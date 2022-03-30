package com.syte;

import com.syte.model.ToDo;
import com.syte.protobuf.*;
import com.syte.service.GrpsService;
import com.syte.service.ToDoService;
import io.grpc.internal.testing.StreamRecorder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Fail.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
class SyteApplicationTests {

    ToDoService listMock = Mockito.mock(ToDoService.class);

    private final GrpsService grpsService = new GrpsService(listMock);


    @Test
    void createToDo() throws Exception {
        ToDo responseToDo = new ToDo(1, "Get shaved", "Shave your beard",
                "2022-04-01", false,
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()),
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));


        CreateToDoProto request = CreateToDoProto.newBuilder()
                .setTitle("Get shaved")
                .setDescription("Shave your beard")
                .setTodoDate("2022-04-01")
                .build();
        when(listMock.createToDo(any())).thenReturn(responseToDo);
        StreamRecorder<ToDoProto> responseObserver = StreamRecorder.create();
        grpsService.createToDo(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<ToDoProto> results = responseObserver.getValues();
        assertEquals(1, results.size());
        ToDoProto response = results.get(0);
        assertEquals(ToDoProto.newBuilder()
                .setId(1)
                .setTitle("Get shaved")
                .setDescription("Shave your beard")
                .setTodoDate("2022-04-01")
                .setIsComplete(false)
                .setCreationDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()))
                .setUpdateDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()))
                .build(), response);
    }

    @Test
    void updateToDo() throws Exception {
        ToDo responseToDo = new ToDo(1, "Get shaved", "Shave your beard and mustache",
                "2022-04-01", false,
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()),
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));

        ToDoProto request = ToDoProto.newBuilder()
                .setId(1)
                .setTitle("Get shaved")
                .setDescription("Shave your beard and mustache")
                .setTodoDate("2022-04-01")
                .setIsComplete(false)
                .setCreationDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()))
                .setUpdateDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()))
                .build();
        when(listMock.updateToDo(any())).thenReturn(responseToDo);
        StreamRecorder<ToDoProto> responseObserver = StreamRecorder.create();
        grpsService.updateToDo(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<ToDoProto> results = responseObserver.getValues();
        assertEquals(1, results.size());
        ToDoProto response = results.get(0);
        assertEquals(ToDoProto.newBuilder()
                .setId(1)
                .setTitle("Get shaved")
                .setDescription("Shave your beard and mustache")
                .setTodoDate("2022-04-01")
                .setIsComplete(false)
                .setCreationDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()))
                .setUpdateDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()))
                .build(), response);
    }

    @Test
    void getToDoById() throws Exception {
        ToDo responseToDo = new ToDo(1, "Get shaved", "Shave your beard and mustache",
                "2022-04-01", false,
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()),
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));

        GetToDoByIdRequest request = GetToDoByIdRequest.newBuilder()
                .setId(1)
                .build();
        when(listMock.getToDoById(any())).thenReturn(responseToDo);
        StreamRecorder<ToDoProto> responseObserver = StreamRecorder.create();
        grpsService.getToDoById(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<ToDoProto> results = responseObserver.getValues();
        assertEquals(1, results.size());
        ToDoProto response = results.get(0);
        assertEquals(ToDoProto.newBuilder()
                .setId(1)
                .setTitle("Get shaved")
                .setDescription("Shave your beard and mustache")
                .setTodoDate("2022-04-01")
                .setIsComplete(false)
                .setCreationDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()))
                .setUpdateDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()))
                .build(), response);
    }

    @Test
    void deleteToDo() throws Exception {
        GetToDoByIdRequest request = GetToDoByIdRequest.newBuilder()
                .setId(1)
                .build();
        StreamRecorder<DeleteToDoResponse> responseObserver = StreamRecorder.create();
        grpsService.deleteToDo(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<DeleteToDoResponse> results = responseObserver.getValues();
        assertEquals(1, results.size());
        DeleteToDoResponse response = results.get(0);
        assertEquals(DeleteToDoResponse.newBuilder()
                .setDeleted(true)
                .build(), response);
    }

    @Test
    void setToDoIsDone() throws Exception {
        ToDo responseToDo = new ToDo(1, "Get shaved", "Shave your beard and mustache",
                "2022-04-01", true,
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()),
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));

        GetToDoByIdRequest request = GetToDoByIdRequest.newBuilder()
                .setId(1)
                .build();
        when(listMock.updateToDoByIdStatusIsDone(any())).thenReturn(responseToDo);
        StreamRecorder<ToDoProto> responseObserver = StreamRecorder.create();
        grpsService.setToDoIsDone(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<ToDoProto> results = responseObserver.getValues();
        assertEquals(1, results.size());
        ToDoProto response = results.get(0);
        assertEquals(ToDoProto.newBuilder()
                .setId(1)
                .setTitle("Get shaved")
                .setDescription("Shave your beard and mustache")
                .setTodoDate("2022-04-01")
                .setIsComplete(true)
                .setCreationDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()))
                .setUpdateDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()))
                .build(), response);
    }

    @Test
    void getAllToDo() throws Exception {
        List<ToDo> responseListToDo = new ArrayList<>();
        responseListToDo.add(new ToDo(1, "Get shaved", "Shave your beard and mustache",
                "2022-04-01", false,
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()),
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())));
        responseListToDo.add(new ToDo(2, "Get shaved", "Shave your beard",
                "2022-04-01", false,
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()),
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())));

        EmptyToDoProto request = EmptyToDoProto.newBuilder()
                .build();
        when(listMock.getAllToDo()).thenReturn(responseListToDo);
        StreamRecorder<Todos> responseObserver = StreamRecorder.create();
        grpsService.getAllToDo(request, responseObserver);
        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("The call did not terminate in time");
        }
        assertNull(responseObserver.getError());
        List<Todos> results = responseObserver.getValues();
        assertEquals(1, results.size());
        Todos response = results.get(0);
        assertEquals(Todos.newBuilder()
                .addToDoProto(
                        ToDoProto.newBuilder()
                                .setId(1)
                                .setTitle("Get shaved")
                                .setDescription("Shave your beard and mustache")
                                .setTodoDate("2022-04-01")
                                .setIsComplete(false)
                                .setCreationDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()))
                                .setUpdateDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())).build())
                .addToDoProto(
                        ToDoProto.newBuilder()
                                .setId(2)
                                .setTitle("Get shaved")
                                .setDescription("Shave your beard")
                                .setTodoDate("2022-04-01")
                                .setIsComplete(false)
                                .setCreationDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()))
                                .setUpdateDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())).build()
                ).build(), response);
    }
}
