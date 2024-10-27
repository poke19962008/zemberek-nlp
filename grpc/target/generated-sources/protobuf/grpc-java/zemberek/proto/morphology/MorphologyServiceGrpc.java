package zemberek.proto.morphology;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: morphology.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MorphologyServiceGrpc {

  private MorphologyServiceGrpc() {}

  public static final String SERVICE_NAME = "zemberek.morphology.MorphologyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<zemberek.proto.morphology.SentenceAnalysisRequest,
      zemberek.proto.morphology.SentenceAnalysisProto> getAnalyzeSentenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnalyzeSentence",
      requestType = zemberek.proto.morphology.SentenceAnalysisRequest.class,
      responseType = zemberek.proto.morphology.SentenceAnalysisProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<zemberek.proto.morphology.SentenceAnalysisRequest,
      zemberek.proto.morphology.SentenceAnalysisProto> getAnalyzeSentenceMethod() {
    io.grpc.MethodDescriptor<zemberek.proto.morphology.SentenceAnalysisRequest, zemberek.proto.morphology.SentenceAnalysisProto> getAnalyzeSentenceMethod;
    if ((getAnalyzeSentenceMethod = MorphologyServiceGrpc.getAnalyzeSentenceMethod) == null) {
      synchronized (MorphologyServiceGrpc.class) {
        if ((getAnalyzeSentenceMethod = MorphologyServiceGrpc.getAnalyzeSentenceMethod) == null) {
          MorphologyServiceGrpc.getAnalyzeSentenceMethod = getAnalyzeSentenceMethod =
              io.grpc.MethodDescriptor.<zemberek.proto.morphology.SentenceAnalysisRequest, zemberek.proto.morphology.SentenceAnalysisProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AnalyzeSentence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  zemberek.proto.morphology.SentenceAnalysisRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  zemberek.proto.morphology.SentenceAnalysisProto.getDefaultInstance()))
              .setSchemaDescriptor(new MorphologyServiceMethodDescriptorSupplier("AnalyzeSentence"))
              .build();
        }
      }
    }
    return getAnalyzeSentenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<zemberek.proto.morphology.WordAnalysisRequest,
      zemberek.proto.morphology.WordAnalysisProto> getAnalyzeWordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnalyzeWord",
      requestType = zemberek.proto.morphology.WordAnalysisRequest.class,
      responseType = zemberek.proto.morphology.WordAnalysisProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<zemberek.proto.morphology.WordAnalysisRequest,
      zemberek.proto.morphology.WordAnalysisProto> getAnalyzeWordMethod() {
    io.grpc.MethodDescriptor<zemberek.proto.morphology.WordAnalysisRequest, zemberek.proto.morphology.WordAnalysisProto> getAnalyzeWordMethod;
    if ((getAnalyzeWordMethod = MorphologyServiceGrpc.getAnalyzeWordMethod) == null) {
      synchronized (MorphologyServiceGrpc.class) {
        if ((getAnalyzeWordMethod = MorphologyServiceGrpc.getAnalyzeWordMethod) == null) {
          MorphologyServiceGrpc.getAnalyzeWordMethod = getAnalyzeWordMethod =
              io.grpc.MethodDescriptor.<zemberek.proto.morphology.WordAnalysisRequest, zemberek.proto.morphology.WordAnalysisProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AnalyzeWord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  zemberek.proto.morphology.WordAnalysisRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  zemberek.proto.morphology.WordAnalysisProto.getDefaultInstance()))
              .setSchemaDescriptor(new MorphologyServiceMethodDescriptorSupplier("AnalyzeWord"))
              .build();
        }
      }
    }
    return getAnalyzeWordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MorphologyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MorphologyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MorphologyServiceStub>() {
        @java.lang.Override
        public MorphologyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MorphologyServiceStub(channel, callOptions);
        }
      };
    return MorphologyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MorphologyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MorphologyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MorphologyServiceBlockingStub>() {
        @java.lang.Override
        public MorphologyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MorphologyServiceBlockingStub(channel, callOptions);
        }
      };
    return MorphologyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MorphologyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MorphologyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MorphologyServiceFutureStub>() {
        @java.lang.Override
        public MorphologyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MorphologyServiceFutureStub(channel, callOptions);
        }
      };
    return MorphologyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MorphologyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void analyzeSentence(zemberek.proto.morphology.SentenceAnalysisRequest request,
        io.grpc.stub.StreamObserver<zemberek.proto.morphology.SentenceAnalysisProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnalyzeSentenceMethod(), responseObserver);
    }

    /**
     */
    public void analyzeWord(zemberek.proto.morphology.WordAnalysisRequest request,
        io.grpc.stub.StreamObserver<zemberek.proto.morphology.WordAnalysisProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnalyzeWordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAnalyzeSentenceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                zemberek.proto.morphology.SentenceAnalysisRequest,
                zemberek.proto.morphology.SentenceAnalysisProto>(
                  this, METHODID_ANALYZE_SENTENCE)))
          .addMethod(
            getAnalyzeWordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                zemberek.proto.morphology.WordAnalysisRequest,
                zemberek.proto.morphology.WordAnalysisProto>(
                  this, METHODID_ANALYZE_WORD)))
          .build();
    }
  }

  /**
   */
  public static final class MorphologyServiceStub extends io.grpc.stub.AbstractAsyncStub<MorphologyServiceStub> {
    private MorphologyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MorphologyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MorphologyServiceStub(channel, callOptions);
    }

    /**
     */
    public void analyzeSentence(zemberek.proto.morphology.SentenceAnalysisRequest request,
        io.grpc.stub.StreamObserver<zemberek.proto.morphology.SentenceAnalysisProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnalyzeSentenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void analyzeWord(zemberek.proto.morphology.WordAnalysisRequest request,
        io.grpc.stub.StreamObserver<zemberek.proto.morphology.WordAnalysisProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnalyzeWordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MorphologyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MorphologyServiceBlockingStub> {
    private MorphologyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MorphologyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MorphologyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public zemberek.proto.morphology.SentenceAnalysisProto analyzeSentence(zemberek.proto.morphology.SentenceAnalysisRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnalyzeSentenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public zemberek.proto.morphology.WordAnalysisProto analyzeWord(zemberek.proto.morphology.WordAnalysisRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnalyzeWordMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MorphologyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MorphologyServiceFutureStub> {
    private MorphologyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MorphologyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MorphologyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<zemberek.proto.morphology.SentenceAnalysisProto> analyzeSentence(
        zemberek.proto.morphology.SentenceAnalysisRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnalyzeSentenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<zemberek.proto.morphology.WordAnalysisProto> analyzeWord(
        zemberek.proto.morphology.WordAnalysisRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnalyzeWordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ANALYZE_SENTENCE = 0;
  private static final int METHODID_ANALYZE_WORD = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MorphologyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MorphologyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ANALYZE_SENTENCE:
          serviceImpl.analyzeSentence((zemberek.proto.morphology.SentenceAnalysisRequest) request,
              (io.grpc.stub.StreamObserver<zemberek.proto.morphology.SentenceAnalysisProto>) responseObserver);
          break;
        case METHODID_ANALYZE_WORD:
          serviceImpl.analyzeWord((zemberek.proto.morphology.WordAnalysisRequest) request,
              (io.grpc.stub.StreamObserver<zemberek.proto.morphology.WordAnalysisProto>) responseObserver);
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

  private static abstract class MorphologyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MorphologyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return zemberek.proto.morphology.Morphology.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MorphologyService");
    }
  }

  private static final class MorphologyServiceFileDescriptorSupplier
      extends MorphologyServiceBaseDescriptorSupplier {
    MorphologyServiceFileDescriptorSupplier() {}
  }

  private static final class MorphologyServiceMethodDescriptorSupplier
      extends MorphologyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MorphologyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MorphologyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MorphologyServiceFileDescriptorSupplier())
              .addMethod(getAnalyzeSentenceMethod())
              .addMethod(getAnalyzeWordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
