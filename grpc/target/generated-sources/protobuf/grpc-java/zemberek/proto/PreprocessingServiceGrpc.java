package zemberek.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: preprocess.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PreprocessingServiceGrpc {

  private PreprocessingServiceGrpc() {}

  public static final String SERVICE_NAME = "zemberek.preprocessor.PreprocessingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<zemberek.proto.TokenizationRequest,
      zemberek.proto.TokenizationResponse> getTokenizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Tokenize",
      requestType = zemberek.proto.TokenizationRequest.class,
      responseType = zemberek.proto.TokenizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<zemberek.proto.TokenizationRequest,
      zemberek.proto.TokenizationResponse> getTokenizeMethod() {
    io.grpc.MethodDescriptor<zemberek.proto.TokenizationRequest, zemberek.proto.TokenizationResponse> getTokenizeMethod;
    if ((getTokenizeMethod = PreprocessingServiceGrpc.getTokenizeMethod) == null) {
      synchronized (PreprocessingServiceGrpc.class) {
        if ((getTokenizeMethod = PreprocessingServiceGrpc.getTokenizeMethod) == null) {
          PreprocessingServiceGrpc.getTokenizeMethod = getTokenizeMethod =
              io.grpc.MethodDescriptor.<zemberek.proto.TokenizationRequest, zemberek.proto.TokenizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Tokenize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  zemberek.proto.TokenizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  zemberek.proto.TokenizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PreprocessingServiceMethodDescriptorSupplier("Tokenize"))
              .build();
        }
      }
    }
    return getTokenizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<zemberek.proto.SentenceExtractionRequest,
      zemberek.proto.SentenceExtractionResponse> getExtractSentencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExtractSentences",
      requestType = zemberek.proto.SentenceExtractionRequest.class,
      responseType = zemberek.proto.SentenceExtractionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<zemberek.proto.SentenceExtractionRequest,
      zemberek.proto.SentenceExtractionResponse> getExtractSentencesMethod() {
    io.grpc.MethodDescriptor<zemberek.proto.SentenceExtractionRequest, zemberek.proto.SentenceExtractionResponse> getExtractSentencesMethod;
    if ((getExtractSentencesMethod = PreprocessingServiceGrpc.getExtractSentencesMethod) == null) {
      synchronized (PreprocessingServiceGrpc.class) {
        if ((getExtractSentencesMethod = PreprocessingServiceGrpc.getExtractSentencesMethod) == null) {
          PreprocessingServiceGrpc.getExtractSentencesMethod = getExtractSentencesMethod =
              io.grpc.MethodDescriptor.<zemberek.proto.SentenceExtractionRequest, zemberek.proto.SentenceExtractionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExtractSentences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  zemberek.proto.SentenceExtractionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  zemberek.proto.SentenceExtractionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PreprocessingServiceMethodDescriptorSupplier("ExtractSentences"))
              .build();
        }
      }
    }
    return getExtractSentencesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PreprocessingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PreprocessingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PreprocessingServiceStub>() {
        @java.lang.Override
        public PreprocessingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PreprocessingServiceStub(channel, callOptions);
        }
      };
    return PreprocessingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PreprocessingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PreprocessingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PreprocessingServiceBlockingStub>() {
        @java.lang.Override
        public PreprocessingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PreprocessingServiceBlockingStub(channel, callOptions);
        }
      };
    return PreprocessingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PreprocessingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PreprocessingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PreprocessingServiceFutureStub>() {
        @java.lang.Override
        public PreprocessingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PreprocessingServiceFutureStub(channel, callOptions);
        }
      };
    return PreprocessingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PreprocessingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void tokenize(zemberek.proto.TokenizationRequest request,
        io.grpc.stub.StreamObserver<zemberek.proto.TokenizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTokenizeMethod(), responseObserver);
    }

    /**
     */
    public void extractSentences(zemberek.proto.SentenceExtractionRequest request,
        io.grpc.stub.StreamObserver<zemberek.proto.SentenceExtractionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExtractSentencesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTokenizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                zemberek.proto.TokenizationRequest,
                zemberek.proto.TokenizationResponse>(
                  this, METHODID_TOKENIZE)))
          .addMethod(
            getExtractSentencesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                zemberek.proto.SentenceExtractionRequest,
                zemberek.proto.SentenceExtractionResponse>(
                  this, METHODID_EXTRACT_SENTENCES)))
          .build();
    }
  }

  /**
   */
  public static final class PreprocessingServiceStub extends io.grpc.stub.AbstractAsyncStub<PreprocessingServiceStub> {
    private PreprocessingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PreprocessingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PreprocessingServiceStub(channel, callOptions);
    }

    /**
     */
    public void tokenize(zemberek.proto.TokenizationRequest request,
        io.grpc.stub.StreamObserver<zemberek.proto.TokenizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTokenizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void extractSentences(zemberek.proto.SentenceExtractionRequest request,
        io.grpc.stub.StreamObserver<zemberek.proto.SentenceExtractionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExtractSentencesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PreprocessingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PreprocessingServiceBlockingStub> {
    private PreprocessingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PreprocessingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PreprocessingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public zemberek.proto.TokenizationResponse tokenize(zemberek.proto.TokenizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTokenizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public zemberek.proto.SentenceExtractionResponse extractSentences(zemberek.proto.SentenceExtractionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExtractSentencesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PreprocessingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PreprocessingServiceFutureStub> {
    private PreprocessingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PreprocessingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PreprocessingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<zemberek.proto.TokenizationResponse> tokenize(
        zemberek.proto.TokenizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTokenizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<zemberek.proto.SentenceExtractionResponse> extractSentences(
        zemberek.proto.SentenceExtractionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExtractSentencesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOKENIZE = 0;
  private static final int METHODID_EXTRACT_SENTENCES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PreprocessingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PreprocessingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TOKENIZE:
          serviceImpl.tokenize((zemberek.proto.TokenizationRequest) request,
              (io.grpc.stub.StreamObserver<zemberek.proto.TokenizationResponse>) responseObserver);
          break;
        case METHODID_EXTRACT_SENTENCES:
          serviceImpl.extractSentences((zemberek.proto.SentenceExtractionRequest) request,
              (io.grpc.stub.StreamObserver<zemberek.proto.SentenceExtractionResponse>) responseObserver);
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

  private static abstract class PreprocessingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PreprocessingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return zemberek.proto.Preprocess.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PreprocessingService");
    }
  }

  private static final class PreprocessingServiceFileDescriptorSupplier
      extends PreprocessingServiceBaseDescriptorSupplier {
    PreprocessingServiceFileDescriptorSupplier() {}
  }

  private static final class PreprocessingServiceMethodDescriptorSupplier
      extends PreprocessingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PreprocessingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PreprocessingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PreprocessingServiceFileDescriptorSupplier())
              .addMethod(getTokenizeMethod())
              .addMethod(getExtractSentencesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
