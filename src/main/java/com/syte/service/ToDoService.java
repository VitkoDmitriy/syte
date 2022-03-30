package com.syte.service;

import com.google.common.collect.Lists;
import com.syte.exception.ToDoNotFoundException;
import com.syte.model.ToDo;
import com.syte.repository.ToDoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Service
public class ToDoService {

    private final ConcurrentHashMap<Integer, ToDo> hashToDo = new ConcurrentHashMap<>();

    private final ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public ToDo createToDo(ToDo toDo) {
        ToDo afterSaveToDo = toDoRepository.save(toDo);
        hashToDo.put(afterSaveToDo.getId(), afterSaveToDo);
        log.info("ToDo was added to data {}", afterSaveToDo);
        return afterSaveToDo;
    }

    public ToDo getToDoById(Integer id) {
        ToDo toDo = hashToDo.get(id);
        if (toDo == null) {
            log.error("ToDo with id {}, not found", id);
            throw new ToDoNotFoundException(id);
        }
        log.info("ToDo with id {} was found: {}", id, toDo);
        return toDo;
    }

    public ToDo updateToDo(ToDo toDo) {
        ToDo afterSaveToDo = toDoRepository.save(toDo);
        hashToDo.put(afterSaveToDo.getId(), afterSaveToDo);
        log.info("ToDo was updated in data {}", afterSaveToDo);
        return afterSaveToDo;
    }

    public ToDo updateToDoByIdStatusIsDone(Integer id) {
        ToDo toDo = getToDoById(id);
        toDo.setComplete(true);
        updateToDo(toDo);
        log.info("ToDo with id {}, status was changed to DONE", id);
        return toDo;
    }

    public List<ToDo> getAllToDo() {
        return Lists.newArrayList(hashToDo.values());
    }

    public void deleteToDoById(Integer id) {
        hashToDo.remove(id);
        toDoRepository.deleteById(id);
        log.info("ToDo with id {} deleted", id);
    }

    public void loadData() {
        List<ToDo> listToDo = toDoRepository.findAll();
        listToDo.forEach(toDo -> {
            hashToDo.put(toDo.getId(), toDo);
        });
        log.info("List To Do was loaded ...");

    }
}
