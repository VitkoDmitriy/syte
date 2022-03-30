package com.syte;

import com.syte.service.GrpsService;
import com.syte.service.ToDoService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@Slf4j
@SpringBootApplication
public class App implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Value("${grpc.server.port}")
    private Integer port;

    private final ToDoService toDoService;
    public App(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @Override
    public void run(String... args) {
        toDoService.loadData();
        Server server = ServerBuilder.forPort(port)
                .addService(new GrpsService(toDoService))
                .build();
        try {
            server.start();
            log.info("SERVER STARTED ON PORT {}", port);
            server.awaitTermination();
        } catch (IOException e) {
            log.error("SERVER DID NOT START");
        } catch (InterruptedException e) {
            log.error("SERVER SHUT DOWN ON INTERRUPTED");
        }
    }


}
