package zemberek.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: normalization.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NormalizationServiceGrpc {

  private NormalizationServiceGrpc() {}

  public static final String SERVICE_NAME = "zemberek.normalization.NormalizationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<zemberek.proto.NormalizationRequest,
      zemberek.proto.NormalizationResponse> getNormalizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Normalize",
      requestType = zemberek.proto.NormalizationRequest.class,
      responseType = zemberek.proto.NormalizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<zemberek.proto.NormalizationRequest,
      zemberek.proto.NormalizationResponse> getNormalizeMethod() {
    io.grpc.MethodDescriptor<zemberek.proto.NormalizationRequest, zemberek.proto.NormalizationResponse> getNormalizeMethod;
    if ((getNormalizeMethod = NormalizationServiceGrpc.getNormalizeMethod) == null) {
      synchronized (NormalizationServiceGrpc.class) {
        if ((getNormalizeMethod = NormalizationServiceGrpc.getNormalizeMethod) == null) {
          NormalizationServiceGrpc.getNormalizeMethod = getNormalizeMethod =
              io.grpc.MethodDescriptor.<zemberek.proto.NormalizationRequest, zemberek.proto.NormalizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Normalize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  zemberek.proto.NormalizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  zemberek.proto.NormalizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NormalizationServiceMethodDescriptorSupplier("Normalize"))
              .build();
        }
      }
    }
    return getNormalizeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NormalizationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NormalizationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NormalizationServiceStub>() {
        @java.lang.Override
        public NormalizationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NormalizationServiceStub(channel, callOptions);
        }
      };
    return NormalizationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NormalizationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NormalizationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NormalizationServiceBlockingStub>() {
        @java.lang.Override
        public NormalizationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NormalizationServiceBlockingStub(channel, callOptions);
        }
      };
    return NormalizationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NormalizationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NormalizationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NormalizationServiceFutureStub>() {
        @java.lang.Override
        public NormalizationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NormalizationServiceFutureStub(channel, callOptions);
        }
      };
    return NormalizationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class NormalizationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void normalize(zemberek.proto.NormalizationRequest request,
        io.grpc.stub.StreamObserver<zemberek.proto.NormalizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNormalizeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNormalizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                zemberek.proto.NormalizationRequest,
                zemberek.proto.NormalizationResponse>(
                  this, METHODID_NORMALIZE)))
          .build();
    }
  }

  /**
   */
  public static final class NormalizationServiceStub extends io.grpc.stub.AbstractAsyncStub<NormalizationServiceStub> {
    private NormalizationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NormalizationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NormalizationServiceStub(channel, callOptions);
    }

    /**
     */
    public void normalize(zemberek.proto.NormalizationRequest request,
        io.grpc.stub.StreamObserver<zemberek.proto.NormalizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNormalizeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NormalizationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NormalizationServiceBlockingStub> {
    private NormalizationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NormalizationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NormalizationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public zemberek.proto.NormalizationResponse normalize(zemberek.proto.NormalizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNormalizeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NormalizationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NormalizationServiceFutureStub> {
    private NormalizationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NormalizationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NormalizationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<zemberek.proto.NormalizationResponse> normalize(
        zemberek.proto.NormalizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNormalizeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NORMALIZE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NormalizationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NormalizationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NORMALIZE:
          serviceImpl.normalize((zemberek.proto.NormalizationRequest) request,
              (io.grpc.stub.StreamObserver<zemberek.proto.NormalizationResponse>) responseObserver);
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

  private static abstract class NormalizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NormalizationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return zemberek.proto.Normalization.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NormalizationService");
    }
  }

  private static final class NormalizationServiceFileDescriptorSupplier
      extends NormalizationServiceBaseDescriptorSupplier {
    NormalizationServiceFileDescriptorSupplier() {}
  }

  private static final class NormalizationServiceMethodDescriptorSupplier
      extends NormalizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NormalizationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NormalizationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NormalizationServiceFileDescriptorSupplier())
              .addMethod(getNormalizeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
