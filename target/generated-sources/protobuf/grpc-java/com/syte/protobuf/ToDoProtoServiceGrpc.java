package com.syte.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.0)",
    comments = "Source: ToDo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ToDoProtoServiceGrpc {

  private ToDoProtoServiceGrpc() {}

  public static final String SERVICE_NAME = "com.syte.protobuf.ToDoProtoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.syte.protobuf.GetToDoByIdRequest,
      com.syte.protobuf.ToDoProto> getGetToDoByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getToDoById",
      requestType = com.syte.protobuf.GetToDoByIdRequest.class,
      responseType = com.syte.protobuf.ToDoProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.syte.protobuf.GetToDoByIdRequest,
      com.syte.protobuf.ToDoProto> getGetToDoByIdMethod() {
    io.grpc.MethodDescriptor<com.syte.protobuf.GetToDoByIdRequest, com.syte.protobuf.ToDoProto> getGetToDoByIdMethod;
    if ((getGetToDoByIdMethod = ToDoProtoServiceGrpc.getGetToDoByIdMethod) == null) {
      synchronized (ToDoProtoServiceGrpc.class) {
        if ((getGetToDoByIdMethod = ToDoProtoServiceGrpc.getGetToDoByIdMethod) == null) {
          ToDoProtoServiceGrpc.getGetToDoByIdMethod = getGetToDoByIdMethod =
              io.grpc.MethodDescriptor.<com.syte.protobuf.GetToDoByIdRequest, com.syte.protobuf.ToDoProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getToDoById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syte.protobuf.GetToDoByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syte.protobuf.ToDoProto.getDefaultInstance()))
              .setSchemaDescriptor(new ToDoProtoServiceMethodDescriptorSupplier("getToDoById"))
              .build();
        }
      }
    }
    return getGetToDoByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.syte.protobuf.EmptyToDoProto,
      com.syte.protobuf.Todos> getGetAllToDoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllToDo",
      requestType = com.syte.protobuf.EmptyToDoProto.class,
      responseType = com.syte.protobuf.Todos.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.syte.protobuf.EmptyToDoProto,
      com.syte.protobuf.Todos> getGetAllToDoMethod() {
    io.grpc.MethodDescriptor<com.syte.protobuf.EmptyToDoProto, com.syte.protobuf.Todos> getGetAllToDoMethod;
    if ((getGetAllToDoMethod = ToDoProtoServiceGrpc.getGetAllToDoMethod) == null) {
      synchronized (ToDoProtoServiceGrpc.class) {
        if ((getGetAllToDoMethod = ToDoProtoServiceGrpc.getGetAllToDoMethod) == null) {
          ToDoProtoServiceGrpc.getGetAllToDoMethod = getGetAllToDoMethod =
              io.grpc.MethodDescriptor.<com.syte.protobuf.EmptyToDoProto, com.syte.protobuf.Todos>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllToDo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syte.protobuf.EmptyToDoProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syte.protobuf.Todos.getDefaultInstance()))
              .setSchemaDescriptor(new ToDoProtoServiceMethodDescriptorSupplier("getAllToDo"))
              .build();
        }
      }
    }
    return getGetAllToDoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.syte.protobuf.GetToDoByIdRequest,
      com.syte.protobuf.ToDoProto> getSetToDoIsDoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setToDoIsDone",
      requestType = com.syte.protobuf.GetToDoByIdRequest.class,
      responseType = com.syte.protobuf.ToDoProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.syte.protobuf.GetToDoByIdRequest,
      com.syte.protobuf.ToDoProto> getSetToDoIsDoneMethod() {
    io.grpc.MethodDescriptor<com.syte.protobuf.GetToDoByIdRequest, com.syte.protobuf.ToDoProto> getSetToDoIsDoneMethod;
    if ((getSetToDoIsDoneMethod = ToDoProtoServiceGrpc.getSetToDoIsDoneMethod) == null) {
      synchronized (ToDoProtoServiceGrpc.class) {
        if ((getSetToDoIsDoneMethod = ToDoProtoServiceGrpc.getSetToDoIsDoneMethod) == null) {
          ToDoProtoServiceGrpc.getSetToDoIsDoneMethod = getSetToDoIsDoneMethod =
              io.grpc.MethodDescriptor.<com.syte.protobuf.GetToDoByIdRequest, com.syte.protobuf.ToDoProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setToDoIsDone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syte.protobuf.GetToDoByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syte.protobuf.ToDoProto.getDefaultInstance()))
              .setSchemaDescriptor(new ToDoProtoServiceMethodDescriptorSupplier("setToDoIsDone"))
              .build();
        }
      }
    }
    return getSetToDoIsDoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.syte.protobuf.CreateToDoProto,
      com.syte.protobuf.ToDoProto> getCreateToDoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createToDo",
      requestType = com.syte.protobuf.CreateToDoProto.class,
      responseType = com.syte.protobuf.ToDoProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.syte.protobuf.CreateToDoProto,
      com.syte.protobuf.ToDoProto> getCreateToDoMethod() {
    io.grpc.MethodDescriptor<com.syte.protobuf.CreateToDoProto, com.syte.protobuf.ToDoProto> getCreateToDoMethod;
    if ((getCreateToDoMethod = ToDoProtoServiceGrpc.getCreateToDoMethod) == null) {
      synchronized (ToDoProtoServiceGrpc.class) {
        if ((getCreateToDoMethod = ToDoProtoServiceGrpc.getCreateToDoMethod) == null) {
          ToDoProtoServiceGrpc.getCreateToDoMethod = getCreateToDoMethod =
              io.grpc.MethodDescriptor.<com.syte.protobuf.CreateToDoProto, com.syte.protobuf.ToDoProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createToDo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syte.protobuf.CreateToDoProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syte.protobuf.ToDoProto.getDefaultInstance()))
              .setSchemaDescriptor(new ToDoProtoServiceMethodDescriptorSupplier("createToDo"))
              .build();
        }
      }
    }
    return getCreateToDoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.syte.protobuf.ToDoProto,
      com.syte.protobuf.ToDoProto> getUpdateToDoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateToDo",
      requestType = com.syte.protobuf.ToDoProto.class,
      responseType = com.syte.protobuf.ToDoProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.syte.protobuf.ToDoProto,
      com.syte.protobuf.ToDoProto> getUpdateToDoMethod() {
    io.grpc.MethodDescriptor<com.syte.protobuf.ToDoProto, com.syte.protobuf.ToDoProto> getUpdateToDoMethod;
    if ((getUpdateToDoMethod = ToDoProtoServiceGrpc.getUpdateToDoMethod) == null) {
      synchronized (ToDoProtoServiceGrpc.class) {
        if ((getUpdateToDoMethod = ToDoProtoServiceGrpc.getUpdateToDoMethod) == null) {
          ToDoProtoServiceGrpc.getUpdateToDoMethod = getUpdateToDoMethod =
              io.grpc.MethodDescriptor.<com.syte.protobuf.ToDoProto, com.syte.protobuf.ToDoProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateToDo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syte.protobuf.ToDoProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syte.protobuf.ToDoProto.getDefaultInstance()))
              .setSchemaDescriptor(new ToDoProtoServiceMethodDescriptorSupplier("updateToDo"))
              .build();
        }
      }
    }
    return getUpdateToDoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.syte.protobuf.GetToDoByIdRequest,
      com.syte.protobuf.DeleteToDoResponse> getDeleteToDoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteToDo",
      requestType = com.syte.protobuf.GetToDoByIdRequest.class,
      responseType = com.syte.protobuf.DeleteToDoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.syte.protobuf.GetToDoByIdRequest,
      com.syte.protobuf.DeleteToDoResponse> getDeleteToDoMethod() {
    io.grpc.MethodDescriptor<com.syte.protobuf.GetToDoByIdRequest, com.syte.protobuf.DeleteToDoResponse> getDeleteToDoMethod;
    if ((getDeleteToDoMethod = ToDoProtoServiceGrpc.getDeleteToDoMethod) == null) {
      synchronized (ToDoProtoServiceGrpc.class) {
        if ((getDeleteToDoMethod = ToDoProtoServiceGrpc.getDeleteToDoMethod) == null) {
          ToDoProtoServiceGrpc.getDeleteToDoMethod = getDeleteToDoMethod =
              io.grpc.MethodDescriptor.<com.syte.protobuf.GetToDoByIdRequest, com.syte.protobuf.DeleteToDoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteToDo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syte.protobuf.GetToDoByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syte.protobuf.DeleteToDoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ToDoProtoServiceMethodDescriptorSupplier("deleteToDo"))
              .build();
        }
      }
    }
    return getDeleteToDoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ToDoProtoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ToDoProtoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ToDoProtoServiceStub>() {
        @java.lang.Override
        public ToDoProtoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ToDoProtoServiceStub(channel, callOptions);
        }
      };
    return ToDoProtoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ToDoProtoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ToDoProtoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ToDoProtoServiceBlockingStub>() {
        @java.lang.Override
        public ToDoProtoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ToDoProtoServiceBlockingStub(channel, callOptions);
        }
      };
    return ToDoProtoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ToDoProtoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ToDoProtoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ToDoProtoServiceFutureStub>() {
        @java.lang.Override
        public ToDoProtoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ToDoProtoServiceFutureStub(channel, callOptions);
        }
      };
    return ToDoProtoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ToDoProtoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getToDoById(com.syte.protobuf.GetToDoByIdRequest request,
        io.grpc.stub.StreamObserver<com.syte.protobuf.ToDoProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetToDoByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllToDo(com.syte.protobuf.EmptyToDoProto request,
        io.grpc.stub.StreamObserver<com.syte.protobuf.Todos> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllToDoMethod(), responseObserver);
    }

    /**
     */
    public void setToDoIsDone(com.syte.protobuf.GetToDoByIdRequest request,
        io.grpc.stub.StreamObserver<com.syte.protobuf.ToDoProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetToDoIsDoneMethod(), responseObserver);
    }

    /**
     */
    public void createToDo(com.syte.protobuf.CreateToDoProto request,
        io.grpc.stub.StreamObserver<com.syte.protobuf.ToDoProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateToDoMethod(), responseObserver);
    }

    /**
     */
    public void updateToDo(com.syte.protobuf.ToDoProto request,
        io.grpc.stub.StreamObserver<com.syte.protobuf.ToDoProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateToDoMethod(), responseObserver);
    }

    /**
     */
    public void deleteToDo(com.syte.protobuf.GetToDoByIdRequest request,
        io.grpc.stub.StreamObserver<com.syte.protobuf.DeleteToDoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteToDoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetToDoByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.syte.protobuf.GetToDoByIdRequest,
                com.syte.protobuf.ToDoProto>(
                  this, METHODID_GET_TO_DO_BY_ID)))
          .addMethod(
            getGetAllToDoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.syte.protobuf.EmptyToDoProto,
                com.syte.protobuf.Todos>(
                  this, METHODID_GET_ALL_TO_DO)))
          .addMethod(
            getSetToDoIsDoneMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.syte.protobuf.GetToDoByIdRequest,
                com.syte.protobuf.ToDoProto>(
                  this, METHODID_SET_TO_DO_IS_DONE)))
          .addMethod(
            getCreateToDoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.syte.protobuf.CreateToDoProto,
                com.syte.protobuf.ToDoProto>(
                  this, METHODID_CREATE_TO_DO)))
          .addMethod(
            getUpdateToDoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.syte.protobuf.ToDoProto,
                com.syte.protobuf.ToDoProto>(
                  this, METHODID_UPDATE_TO_DO)))
          .addMethod(
            getDeleteToDoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.syte.protobuf.GetToDoByIdRequest,
                com.syte.protobuf.DeleteToDoResponse>(
                  this, METHODID_DELETE_TO_DO)))
          .build();
    }
  }

  /**
   */
  public static final class ToDoProtoServiceStub extends io.grpc.stub.AbstractAsyncStub<ToDoProtoServiceStub> {
    private ToDoProtoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToDoProtoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ToDoProtoServiceStub(channel, callOptions);
    }

    /**
     */
    public void getToDoById(com.syte.protobuf.GetToDoByIdRequest request,
        io.grpc.stub.StreamObserver<com.syte.protobuf.ToDoProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetToDoByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllToDo(com.syte.protobuf.EmptyToDoProto request,
        io.grpc.stub.StreamObserver<com.syte.protobuf.Todos> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllToDoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setToDoIsDone(com.syte.protobuf.GetToDoByIdRequest request,
        io.grpc.stub.StreamObserver<com.syte.protobuf.ToDoProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetToDoIsDoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createToDo(com.syte.protobuf.CreateToDoProto request,
        io.grpc.stub.StreamObserver<com.syte.protobuf.ToDoProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateToDoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateToDo(com.syte.protobuf.ToDoProto request,
        io.grpc.stub.StreamObserver<com.syte.protobuf.ToDoProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateToDoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteToDo(com.syte.protobuf.GetToDoByIdRequest request,
        io.grpc.stub.StreamObserver<com.syte.protobuf.DeleteToDoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteToDoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ToDoProtoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ToDoProtoServiceBlockingStub> {
    private ToDoProtoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToDoProtoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ToDoProtoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.syte.protobuf.ToDoProto getToDoById(com.syte.protobuf.GetToDoByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetToDoByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.syte.protobuf.Todos getAllToDo(com.syte.protobuf.EmptyToDoProto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllToDoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.syte.protobuf.ToDoProto setToDoIsDone(com.syte.protobuf.GetToDoByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetToDoIsDoneMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.syte.protobuf.ToDoProto createToDo(com.syte.protobuf.CreateToDoProto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateToDoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.syte.protobuf.ToDoProto updateToDo(com.syte.protobuf.ToDoProto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateToDoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.syte.protobuf.DeleteToDoResponse deleteToDo(com.syte.protobuf.GetToDoByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteToDoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ToDoProtoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ToDoProtoServiceFutureStub> {
    private ToDoProtoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToDoProtoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ToDoProtoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.syte.protobuf.ToDoProto> getToDoById(
        com.syte.protobuf.GetToDoByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetToDoByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.syte.protobuf.Todos> getAllToDo(
        com.syte.protobuf.EmptyToDoProto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllToDoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.syte.protobuf.ToDoProto> setToDoIsDone(
        com.syte.protobuf.GetToDoByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetToDoIsDoneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.syte.protobuf.ToDoProto> createToDo(
        com.syte.protobuf.CreateToDoProto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateToDoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.syte.protobuf.ToDoProto> updateToDo(
        com.syte.protobuf.ToDoProto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateToDoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.syte.protobuf.DeleteToDoResponse> deleteToDo(
        com.syte.protobuf.GetToDoByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteToDoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TO_DO_BY_ID = 0;
  private static final int METHODID_GET_ALL_TO_DO = 1;
  private static final int METHODID_SET_TO_DO_IS_DONE = 2;
  private static final int METHODID_CREATE_TO_DO = 3;
  private static final int METHODID_UPDATE_TO_DO = 4;
  private static final int METHODID_DELETE_TO_DO = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ToDoProtoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ToDoProtoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TO_DO_BY_ID:
          serviceImpl.getToDoById((com.syte.protobuf.GetToDoByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.syte.protobuf.ToDoProto>) responseObserver);
          break;
        case METHODID_GET_ALL_TO_DO:
          serviceImpl.getAllToDo((com.syte.protobuf.EmptyToDoProto) request,
              (io.grpc.stub.StreamObserver<com.syte.protobuf.Todos>) responseObserver);
          break;
        case METHODID_SET_TO_DO_IS_DONE:
          serviceImpl.setToDoIsDone((com.syte.protobuf.GetToDoByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.syte.protobuf.ToDoProto>) responseObserver);
          break;
        case METHODID_CREATE_TO_DO:
          serviceImpl.createToDo((com.syte.protobuf.CreateToDoProto) request,
              (io.grpc.stub.StreamObserver<com.syte.protobuf.ToDoProto>) responseObserver);
          break;
        case METHODID_UPDATE_TO_DO:
          serviceImpl.updateToDo((com.syte.protobuf.ToDoProto) request,
              (io.grpc.stub.StreamObserver<com.syte.protobuf.ToDoProto>) responseObserver);
          break;
        case METHODID_DELETE_TO_DO:
          serviceImpl.deleteToDo((com.syte.protobuf.GetToDoByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.syte.protobuf.DeleteToDoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ToDoProtoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ToDoProtoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.syte.protobuf.ToDo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ToDoProtoService");
    }
  }

  private static final class ToDoProtoServiceFileDescriptorSupplier
      extends ToDoProtoServiceBaseDescriptorSupplier {
    ToDoProtoServiceFileDescriptorSupplier() {}
  }

  private static final class ToDoProtoServiceMethodDescriptorSupplier
      extends ToDoProtoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ToDoProtoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ToDoProtoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ToDoProtoServiceFileDescriptorSupplier())
              .addMethod(getGetToDoByIdMethod())
              .addMethod(getGetAllToDoMethod())
              .addMethod(getSetToDoIsDoneMethod())
              .addMethod(getCreateToDoMethod())
              .addMethod(getUpdateToDoMethod())
              .addMethod(getDeleteToDoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
