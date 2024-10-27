// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: preprocess.proto

package zemberek.proto;

/**
 * Protobuf type {@code zemberek.preprocessor.TokenizationRequest}
 */
public final class TokenizationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zemberek.preprocessor.TokenizationRequest)
    TokenizationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TokenizationRequest.newBuilder() to construct.
  private TokenizationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TokenizationRequest() {
    input_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TokenizationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TokenizationRequest(
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

            input_ = s;
            break;
          }
          case 16: {

            includeTokenBoundaries_ = input.readBool();
            break;
          }
          case 24: {

            ignoreDoubleQuotes_ = input.readBool();
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
    return zemberek.proto.Preprocess.internal_static_zemberek_preprocessor_TokenizationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return zemberek.proto.Preprocess.internal_static_zemberek_preprocessor_TokenizationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            zemberek.proto.TokenizationRequest.class, zemberek.proto.TokenizationRequest.Builder.class);
  }

  public static final int INPUT_FIELD_NUMBER = 1;
  private volatile java.lang.Object input_;
  /**
   * <code>string input = 1;</code>
   * @return The input.
   */
  @java.lang.Override
  public java.lang.String getInput() {
    java.lang.Object ref = input_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      input_ = s;
      return s;
    }
  }
  /**
   * <code>string input = 1;</code>
   * @return The bytes for input.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInputBytes() {
    java.lang.Object ref = input_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      input_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INCLUDETOKENBOUNDARIES_FIELD_NUMBER = 2;
  private boolean includeTokenBoundaries_;
  /**
   * <code>bool includeTokenBoundaries = 2;</code>
   * @return The includeTokenBoundaries.
   */
  @java.lang.Override
  public boolean getIncludeTokenBoundaries() {
    return includeTokenBoundaries_;
  }

  public static final int IGNOREDOUBLEQUOTES_FIELD_NUMBER = 3;
  private boolean ignoreDoubleQuotes_;
  /**
   * <pre>
   * TODO: Add options (ignore etc.)
   * </pre>
   *
   * <code>bool ignoreDoubleQuotes = 3;</code>
   * @return The ignoreDoubleQuotes.
   */
  @java.lang.Override
  public boolean getIgnoreDoubleQuotes() {
    return ignoreDoubleQuotes_;
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
    if (!getInputBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, input_);
    }
    if (includeTokenBoundaries_ != false) {
      output.writeBool(2, includeTokenBoundaries_);
    }
    if (ignoreDoubleQuotes_ != false) {
      output.writeBool(3, ignoreDoubleQuotes_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getInputBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, input_);
    }
    if (includeTokenBoundaries_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, includeTokenBoundaries_);
    }
    if (ignoreDoubleQuotes_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, ignoreDoubleQuotes_);
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
    if (!(obj instanceof zemberek.proto.TokenizationRequest)) {
      return super.equals(obj);
    }
    zemberek.proto.TokenizationRequest other = (zemberek.proto.TokenizationRequest) obj;

    if (!getInput()
        .equals(other.getInput())) return false;
    if (getIncludeTokenBoundaries()
        != other.getIncludeTokenBoundaries()) return false;
    if (getIgnoreDoubleQuotes()
        != other.getIgnoreDoubleQuotes()) return false;
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
    hash = (37 * hash) + INPUT_FIELD_NUMBER;
    hash = (53 * hash) + getInput().hashCode();
    hash = (37 * hash) + INCLUDETOKENBOUNDARIES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeTokenBoundaries());
    hash = (37 * hash) + IGNOREDOUBLEQUOTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIgnoreDoubleQuotes());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static zemberek.proto.TokenizationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.TokenizationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.TokenizationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.TokenizationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.TokenizationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.TokenizationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.TokenizationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zemberek.proto.TokenizationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static zemberek.proto.TokenizationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static zemberek.proto.TokenizationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static zemberek.proto.TokenizationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zemberek.proto.TokenizationRequest parseFrom(
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
  public static Builder newBuilder(zemberek.proto.TokenizationRequest prototype) {
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
   * Protobuf type {@code zemberek.preprocessor.TokenizationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zemberek.preprocessor.TokenizationRequest)
      zemberek.proto.TokenizationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return zemberek.proto.Preprocess.internal_static_zemberek_preprocessor_TokenizationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return zemberek.proto.Preprocess.internal_static_zemberek_preprocessor_TokenizationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              zemberek.proto.TokenizationRequest.class, zemberek.proto.TokenizationRequest.Builder.class);
    }

    // Construct using zemberek.proto.TokenizationRequest.newBuilder()
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
      input_ = "";

      includeTokenBoundaries_ = false;

      ignoreDoubleQuotes_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return zemberek.proto.Preprocess.internal_static_zemberek_preprocessor_TokenizationRequest_descriptor;
    }

    @java.lang.Override
    public zemberek.proto.TokenizationRequest getDefaultInstanceForType() {
      return zemberek.proto.TokenizationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public zemberek.proto.TokenizationRequest build() {
      zemberek.proto.TokenizationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public zemberek.proto.TokenizationRequest buildPartial() {
      zemberek.proto.TokenizationRequest result = new zemberek.proto.TokenizationRequest(this);
      result.input_ = input_;
      result.includeTokenBoundaries_ = includeTokenBoundaries_;
      result.ignoreDoubleQuotes_ = ignoreDoubleQuotes_;
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
      if (other instanceof zemberek.proto.TokenizationRequest) {
        return mergeFrom((zemberek.proto.TokenizationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(zemberek.proto.TokenizationRequest other) {
      if (other == zemberek.proto.TokenizationRequest.getDefaultInstance()) return this;
      if (!other.getInput().isEmpty()) {
        input_ = other.input_;
        onChanged();
      }
      if (other.getIncludeTokenBoundaries() != false) {
        setIncludeTokenBoundaries(other.getIncludeTokenBoundaries());
      }
      if (other.getIgnoreDoubleQuotes() != false) {
        setIgnoreDoubleQuotes(other.getIgnoreDoubleQuotes());
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
      zemberek.proto.TokenizationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (zemberek.proto.TokenizationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object input_ = "";
    /**
     * <code>string input = 1;</code>
     * @return The input.
     */
    public java.lang.String getInput() {
      java.lang.Object ref = input_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        input_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string input = 1;</code>
     * @return The bytes for input.
     */
    public com.google.protobuf.ByteString
        getInputBytes() {
      java.lang.Object ref = input_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        input_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string input = 1;</code>
     * @param value The input to set.
     * @return This builder for chaining.
     */
    public Builder setInput(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      input_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string input = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInput() {
      
      input_ = getDefaultInstance().getInput();
      onChanged();
      return this;
    }
    /**
     * <code>string input = 1;</code>
     * @param value The bytes for input to set.
     * @return This builder for chaining.
     */
    public Builder setInputBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      input_ = value;
      onChanged();
      return this;
    }

    private boolean includeTokenBoundaries_ ;
    /**
     * <code>bool includeTokenBoundaries = 2;</code>
     * @return The includeTokenBoundaries.
     */
    @java.lang.Override
    public boolean getIncludeTokenBoundaries() {
      return includeTokenBoundaries_;
    }
    /**
     * <code>bool includeTokenBoundaries = 2;</code>
     * @param value The includeTokenBoundaries to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeTokenBoundaries(boolean value) {
      
      includeTokenBoundaries_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool includeTokenBoundaries = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeTokenBoundaries() {
      
      includeTokenBoundaries_ = false;
      onChanged();
      return this;
    }

    private boolean ignoreDoubleQuotes_ ;
    /**
     * <pre>
     * TODO: Add options (ignore etc.)
     * </pre>
     *
     * <code>bool ignoreDoubleQuotes = 3;</code>
     * @return The ignoreDoubleQuotes.
     */
    @java.lang.Override
    public boolean getIgnoreDoubleQuotes() {
      return ignoreDoubleQuotes_;
    }
    /**
     * <pre>
     * TODO: Add options (ignore etc.)
     * </pre>
     *
     * <code>bool ignoreDoubleQuotes = 3;</code>
     * @param value The ignoreDoubleQuotes to set.
     * @return This builder for chaining.
     */
    public Builder setIgnoreDoubleQuotes(boolean value) {
      
      ignoreDoubleQuotes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TODO: Add options (ignore etc.)
     * </pre>
     *
     * <code>bool ignoreDoubleQuotes = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIgnoreDoubleQuotes() {
      
      ignoreDoubleQuotes_ = false;
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


    // @@protoc_insertion_point(builder_scope:zemberek.preprocessor.TokenizationRequest)
  }

  // @@protoc_insertion_point(class_scope:zemberek.preprocessor.TokenizationRequest)
  private static final zemberek.proto.TokenizationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new zemberek.proto.TokenizationRequest();
  }

  public static zemberek.proto.TokenizationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TokenizationRequest>
      PARSER = new com.google.protobuf.AbstractParser<TokenizationRequest>() {
    @java.lang.Override
    public TokenizationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TokenizationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TokenizationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TokenizationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public zemberek.proto.TokenizationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
