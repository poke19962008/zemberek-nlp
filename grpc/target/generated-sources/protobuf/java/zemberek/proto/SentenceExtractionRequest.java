// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: preprocess.proto

package zemberek.proto;

/**
 * Protobuf type {@code zemberek.preprocessor.SentenceExtractionRequest}
 */
public final class SentenceExtractionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zemberek.preprocessor.SentenceExtractionRequest)
    SentenceExtractionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SentenceExtractionRequest.newBuilder() to construct.
  private SentenceExtractionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SentenceExtractionRequest() {
    document_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SentenceExtractionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SentenceExtractionRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            document_ = s;
            break;
          }
          case 16: {

            doNotSplitInDoubleQuotes_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return zemberek.proto.Preprocess.internal_static_zemberek_preprocessor_SentenceExtractionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return zemberek.proto.Preprocess.internal_static_zemberek_preprocessor_SentenceExtractionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            zemberek.proto.SentenceExtractionRequest.class, zemberek.proto.SentenceExtractionRequest.Builder.class);
  }

  public static final int DOCUMENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object document_;
  /**
   * <code>string document = 1;</code>
   * @return The document.
   */
  @java.lang.Override
  public java.lang.String getDocument() {
    java.lang.Object ref = document_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      document_ = s;
      return s;
    }
  }
  /**
   * <code>string document = 1;</code>
   * @return The bytes for document.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDocumentBytes() {
    java.lang.Object ref = document_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      document_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DONOTSPLITINDOUBLEQUOTES_FIELD_NUMBER = 2;
  private boolean doNotSplitInDoubleQuotes_;
  /**
   * <code>bool doNotSplitInDoubleQuotes = 2;</code>
   * @return The doNotSplitInDoubleQuotes.
   */
  @java.lang.Override
  public boolean getDoNotSplitInDoubleQuotes() {
    return doNotSplitInDoubleQuotes_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getDocumentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, document_);
    }
    if (doNotSplitInDoubleQuotes_ != false) {
      output.writeBool(2, doNotSplitInDoubleQuotes_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDocumentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, document_);
    }
    if (doNotSplitInDoubleQuotes_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, doNotSplitInDoubleQuotes_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof zemberek.proto.SentenceExtractionRequest)) {
      return super.equals(obj);
    }
    zemberek.proto.SentenceExtractionRequest other = (zemberek.proto.SentenceExtractionRequest) obj;

    if (!getDocument()
        .equals(other.getDocument())) return false;
    if (getDoNotSplitInDoubleQuotes()
        != other.getDoNotSplitInDoubleQuotes()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DOCUMENT_FIELD_NUMBER;
    hash = (53 * hash) + getDocument().hashCode();
    hash = (37 * hash) + DONOTSPLITINDOUBLEQUOTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDoNotSplitInDoubleQuotes());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static zemberek.proto.SentenceExtractionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.SentenceExtractionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.SentenceExtractionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.SentenceExtractionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.SentenceExtractionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.SentenceExtractionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.SentenceExtractionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zemberek.proto.SentenceExtractionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static zemberek.proto.SentenceExtractionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static zemberek.proto.SentenceExtractionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static zemberek.proto.SentenceExtractionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zemberek.proto.SentenceExtractionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(zemberek.proto.SentenceExtractionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code zemberek.preprocessor.SentenceExtractionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zemberek.preprocessor.SentenceExtractionRequest)
      zemberek.proto.SentenceExtractionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return zemberek.proto.Preprocess.internal_static_zemberek_preprocessor_SentenceExtractionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return zemberek.proto.Preprocess.internal_static_zemberek_preprocessor_SentenceExtractionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              zemberek.proto.SentenceExtractionRequest.class, zemberek.proto.SentenceExtractionRequest.Builder.class);
    }

    // Construct using zemberek.proto.SentenceExtractionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      document_ = "";

      doNotSplitInDoubleQuotes_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return zemberek.proto.Preprocess.internal_static_zemberek_preprocessor_SentenceExtractionRequest_descriptor;
    }

    @java.lang.Override
    public zemberek.proto.SentenceExtractionRequest getDefaultInstanceForType() {
      return zemberek.proto.SentenceExtractionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public zemberek.proto.SentenceExtractionRequest build() {
      zemberek.proto.SentenceExtractionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public zemberek.proto.SentenceExtractionRequest buildPartial() {
      zemberek.proto.SentenceExtractionRequest result = new zemberek.proto.SentenceExtractionRequest(this);
      result.document_ = document_;
      result.doNotSplitInDoubleQuotes_ = doNotSplitInDoubleQuotes_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof zemberek.proto.SentenceExtractionRequest) {
        return mergeFrom((zemberek.proto.SentenceExtractionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(zemberek.proto.SentenceExtractionRequest other) {
      if (other == zemberek.proto.SentenceExtractionRequest.getDefaultInstance()) return this;
      if (!other.getDocument().isEmpty()) {
        document_ = other.document_;
        onChanged();
      }
      if (other.getDoNotSplitInDoubleQuotes() != false) {
        setDoNotSplitInDoubleQuotes(other.getDoNotSplitInDoubleQuotes());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      zemberek.proto.SentenceExtractionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (zemberek.proto.SentenceExtractionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object document_ = "";
    /**
     * <code>string document = 1;</code>
     * @return The document.
     */
    public java.lang.String getDocument() {
      java.lang.Object ref = document_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        document_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string document = 1;</code>
     * @return The bytes for document.
     */
    public com.google.protobuf.ByteString
        getDocumentBytes() {
      java.lang.Object ref = document_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        document_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string document = 1;</code>
     * @param value The document to set.
     * @return This builder for chaining.
     */
    public Builder setDocument(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      document_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string document = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDocument() {
      
      document_ = getDefaultInstance().getDocument();
      onChanged();
      return this;
    }
    /**
     * <code>string document = 1;</code>
     * @param value The bytes for document to set.
     * @return This builder for chaining.
     */
    public Builder setDocumentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      document_ = value;
      onChanged();
      return this;
    }

    private boolean doNotSplitInDoubleQuotes_ ;
    /**
     * <code>bool doNotSplitInDoubleQuotes = 2;</code>
     * @return The doNotSplitInDoubleQuotes.
     */
    @java.lang.Override
    public boolean getDoNotSplitInDoubleQuotes() {
      return doNotSplitInDoubleQuotes_;
    }
    /**
     * <code>bool doNotSplitInDoubleQuotes = 2;</code>
     * @param value The doNotSplitInDoubleQuotes to set.
     * @return This builder for chaining.
     */
    public Builder setDoNotSplitInDoubleQuotes(boolean value) {
      
      doNotSplitInDoubleQuotes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool doNotSplitInDoubleQuotes = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDoNotSplitInDoubleQuotes() {
      
      doNotSplitInDoubleQuotes_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:zemberek.preprocessor.SentenceExtractionRequest)
  }

  // @@protoc_insertion_point(class_scope:zemberek.preprocessor.SentenceExtractionRequest)
  private static final zemberek.proto.SentenceExtractionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new zemberek.proto.SentenceExtractionRequest();
  }

  public static zemberek.proto.SentenceExtractionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SentenceExtractionRequest>
      PARSER = new com.google.protobuf.AbstractParser<SentenceExtractionRequest>() {
    @java.lang.Override
    public SentenceExtractionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SentenceExtractionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SentenceExtractionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SentenceExtractionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public zemberek.proto.SentenceExtractionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

