package com.syte.service;

import com.syte.model.ToDo;
import com.syte.protobuf.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Slf4j
@Service
public class GrpsService extends ToDoProtoServiceGrpc.ToDoProtoServiceImplBase {


    private final ToDoService toDoService;

    public GrpsService(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @Override
    public void createToDo(CreateToDoProto createToDoProto, StreamObserver<ToDoProto> responseObserver) {
        try {
            ToDo toDo = new ToDo(createToDoProto.getTitle(), createToDoProto.getDescription(),
                    createToDoProto.getTodoDate(), createToDoProto.getIsComplete());
            ToDo toDoAfterSave = toDoService.createToDo(toDo);
            ToDoProto toDoProto = buildToDoProto(toDoAfterSave).build();

            responseObserver.onNext(toDoProto);
            responseObserver.onCompleted();
        } catch (Exception ex) {
            log.error("Error: {}", ex.getMessage());
            responseObserver.onError(Status.INVALID_ARGUMENT.asRuntimeException());
        }
    }

    @Override
    public void updateToDo(ToDoProto toDoProto, StreamObserver<ToDoProto> responseObserver) {
        try {
            ToDo toDo = new ToDo(toDoProto.getId(),
                    toDoProto.getTitle(), toDoProto.getDescription(), toDoProto.getTodoDate(),
                    toDoProto.getIsComplete(), toDoProto.getCreationDate(), toDoProto.getUpdateDate());
            ToDo toDoAfterSave = toDoService.updateToDo(toDo);
            ToDoProto responseToDoProto = buildToDoProto(toDoAfterSave).build();

            responseObserver.onNext(responseToDoProto);
            responseObserver.onCompleted();
        } catch (Exception ex) {
            log.error("Error: {}", ex.getMessage());
            responseObserver.onError(Status.INVALID_ARGUMENT.asRuntimeException());
        }
    }

    @Override
    public void getToDoById(GetToDoByIdRequest request, StreamObserver<ToDoProto> responseObserver) {
        try {
            ToDo todo = toDoService.getToDoById(request.getId());
            ToDoProto toDoProto = buildToDoProto(todo).build();

            responseObserver.onNext(toDoProto);
            responseObserver.onCompleted();
        } catch (Exception ex) {
            log.error("To Do with id {}, not found", request.getId());
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }
    }

    @Override
    public void deleteToDo(GetToDoByIdRequest request, StreamObserver<DeleteToDoResponse> responseObserver) {
        try {
            toDoService.deleteToDoById(request.getId());
            responseObserver.onNext(DeleteToDoResponse.newBuilder().setDeleted(true).build());
            responseObserver.onCompleted();
        } catch (Exception ex) {
            log.error("Error: {}", ex.getMessage());
            responseObserver.onError(Status.INVALID_ARGUMENT.asRuntimeException());
        }
    }

    @Override
    public void getAllToDo(EmptyToDoProto request, StreamObserver<Todos> responseObserver) {
        try {
            List<ToDo> listToDo = toDoService.getAllToDo();
            Todos.Builder todosBuilder = Todos.newBuilder();

            listToDo.forEach(toDo -> {
                todosBuilder.addToDoProto(buildToDoProto(toDo));
            });

            responseObserver.onNext(todosBuilder.build());
            responseObserver.onCompleted();
        } catch (Exception ex) {
            log.error("Error: {}", ex.getMessage());
            responseObserver.onError(Status.INVALID_ARGUMENT.asRuntimeException());
        }
    }

    @Override
    public void setToDoIsDone(GetToDoByIdRequest getToDoByIdRequest, StreamObserver<ToDoProto> responseObserver) {
        try {
            ToDo todo = toDoService.updateToDoByIdStatusIsDone(getToDoByIdRequest.getId());
            ToDoProto toDoProto = buildToDoProto(todo).build();

            responseObserver.onNext(toDoProto);
            responseObserver.onCompleted();
        } catch (Exception ex) {
            log.error("Error: {}", ex.getMessage());
            responseObserver.onError(Status.INVALID_ARGUMENT.asRuntimeException());
        }
    }

    private ToDoProto.Builder buildToDoProto(ToDo toDo) {
        return ToDoProto.newBuilder()
                .setId(toDo.getId())
                .setTitle(toDo.getTitle())
                .setDescription(toDo.getDescription())
                .setTodoDate(new SimpleDateFormat("yyyy-MM-dd").format(toDo.getTodoDate()))
                .setIsComplete(toDo.isComplete())
                .setCreationDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(toDo.getCreationDate()))
                .setUpdateDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(toDo.getUpdateDate()));

    }
}
