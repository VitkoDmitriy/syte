package com.syte.controller;

import com.syte.model.ToDo;
import com.syte.service.ToDoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    @GetMapping(value = "/todo/{id}")
    @Operation(summary = "Get To-Do by id", description = "Returns To-do ",
            responses = {@ApiResponse(content = @Content(schema = @Schema(implementation = ToDo.class)))})
    public ResponseEntity<?> getToDoById(@PathVariable(value = "id") Integer id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(toDoService.getToDoById(id));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }

    @PostMapping(value = "/todo")
    @Operation(summary = "Create To-Do", description = "Returns To-do ",
            responses = {@ApiResponse(content = @Content(schema = @Schema(implementation = ToDo.class)))})
    public ResponseEntity<?> createToDo(@RequestBody ToDo toDo) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(toDoService.createToDo(toDo));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }

    @DeleteMapping(value = "/todo/{id}")
    @PostMapping(value = "/todo")
    @Operation(summary = "Delete To-Do", description = "Returns only status without body")
    public ResponseEntity<?> deleteToDoById(@PathVariable(value = "id") Integer id) {
        try {
            toDoService.deleteToDoById(id);
            return ResponseEntity.status(HttpStatus.OK).body(null);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }

    @GetMapping(value = "/todo")
    @Operation(summary = "Get all To-Do list", description = "Returns To-do list",
            responses = {@ApiResponse(content = @Content(schema = @Schema(implementation = ToDo[].class)))})
    public ResponseEntity<?> getAllToDo() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(toDoService.getAllToDo());
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }

    @GetMapping(value = "/todo/set-status-is-done/{id}")
    @Operation(summary = "Change status To-Do to isComplete = true", description = "Returns To-do",
            responses = {@ApiResponse(content = @Content(schema = @Schema(implementation = ToDo.class)))})
    public ResponseEntity<?> updateToDoByIdStatusIsDone(@PathVariable(value = "id") Integer id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(toDoService.updateToDoByIdStatusIsDone(id));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }

    @PutMapping(value = "/todo")
    @Operation(summary = "Update To-Do", description = "Returns To-do ",
            responses = {@ApiResponse(content = @Content(schema = @Schema(implementation = ToDo.class)))})
    public ResponseEntity<?> updateToDo(@RequestBody ToDo toDo) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(toDoService.updateToDo(toDo));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }
}
