# Home assignment for Syte.ai
This application is simple To-do list with gRPC(Protobuf) CRUD and Rest CRUD. You can add, edit, delete your To-do. Get a To-do list. You can also change the status by id

## Requirements

1. IntelliJ IDE
2. JDK 11 or above [DownLoad JDK 11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
3. Postman or Insomnia (if you use IntelliJ community edition)
4. BloomRPC

## Instructions
1. Open IntelliJ IDE
2. Start new project from existing sources in `https://github.com/VitkoDmitriy/syte`
3. Enable annotation processing (IntelliJ will hint you for that)   
4. Run `App` Server

## Database
Application use database H2. When an application starts, all data is loaded into the application's cache. The new date is added to the database and cache in parallel. 

## gRPS CRUD
gRPS server run on port: 9091. If you need to change port you can do it in application.yaml file properties
You can run all APIs directly from BloomRPC instead. [DownLoad BloomRPC](https://github.com/bloomrpc/bloomrpc/releases)
After that, from the proto directory, add the ToDo.proto file to BloomRPC and use the gRPS connection.
- rpc getToDoById 
{"id": 1 }
- rpc getAllToDo
- rpc setToDoIsDone
{"id": 1 }
- rpc createToDo 
{"title": "Get shaved",
 "description": "Shave your beard",
 "todoDate": "2022-04-01"}
- rpc updateToDo
{ "id": 1,
  "title": "Get shaved",
  "description": "Shave your beard",
  "todoDate": "2022-04-01",
  "isComplete": false,
  "creationDate": "2022-03-31 12:06:48",
  "updateDate": "2022-03-31 12:06:48"}
- rpc deleteToDo
{"id": 1 }


## Rest API
Rest server run on port: 9090. If you need to change port you can do it in application.yaml file properties 
You can run all APIs directly from IntelliJ if you have ultimate version or use Postman or Insomnia instead.
You can find all API documents in [Swager](http://localhost:9090/swagger-ui/index.html)



