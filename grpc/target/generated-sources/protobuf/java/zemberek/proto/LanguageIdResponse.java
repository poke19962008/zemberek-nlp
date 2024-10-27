// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language_id.proto

package zemberek.proto;

/**
 * Protobuf type {@code zemberek.langid.LanguageIdResponse}
 */
public final class LanguageIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zemberek.langid.LanguageIdResponse)
    LanguageIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LanguageIdResponse.newBuilder() to construct.
  private LanguageIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LanguageIdResponse() {
    langId_ = "";
    idResult_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LanguageIdResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LanguageIdResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            langId_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              idResult_ = new java.util.ArrayList<zemberek.proto.IdResult>();
              mutable_bitField0_ |= 0x00000001;
            }
            idResult_.add(
                input.readMessage(zemberek.proto.IdResult.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        idResult_ = java.util.Collections.unmodifiableList(idResult_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return zemberek.proto.LanguageId.internal_static_zemberek_langid_LanguageIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return zemberek.proto.LanguageId.internal_static_zemberek_langid_LanguageIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            zemberek.proto.LanguageIdResponse.class, zemberek.proto.LanguageIdResponse.Builder.class);
  }

  public static final int LANGID_FIELD_NUMBER = 1;
  private volatile java.lang.Object langId_;
  /**
   * <code>string langId = 1;</code>
   * @return The langId.
   */
  @java.lang.Override
  public java.lang.String getLangId() {
    java.lang.Object ref = langId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      langId_ = s;
      return s;
    }
  }
  /**
   * <code>string langId = 1;</code>
   * @return The bytes for langId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLangIdBytes() {
    java.lang.Object ref = langId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      langId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IDRESULT_FIELD_NUMBER = 2;
  private java.util.List<zemberek.proto.IdResult> idResult_;
  /**
   * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
   */
  @java.lang.Override
  public java.util.List<zemberek.proto.IdResult> getIdResultList() {
    return idResult_;
  }
  /**
   * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends zemberek.proto.IdResultOrBuilder> 
      getIdResultOrBuilderList() {
    return idResult_;
  }
  /**
   * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
   */
  @java.lang.Override
  public int getIdResultCount() {
    return idResult_.size();
  }
  /**
   * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
   */
  @java.lang.Override
  public zemberek.proto.IdResult getIdResult(int index) {
    return idResult_.get(index);
  }
  /**
   * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
   */
  @java.lang.Override
  public zemberek.proto.IdResultOrBuilder getIdResultOrBuilder(
      int index) {
    return idResult_.get(index);
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
    if (!getLangIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, langId_);
    }
    for (int i = 0; i < idResult_.size(); i++) {
      output.writeMessage(2, idResult_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLangIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, langId_);
    }
    for (int i = 0; i < idResult_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, idResult_.get(i));
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
    if (!(obj instanceof zemberek.proto.LanguageIdResponse)) {
      return super.equals(obj);
    }
    zemberek.proto.LanguageIdResponse other = (zemberek.proto.LanguageIdResponse) obj;

    if (!getLangId()
        .equals(other.getLangId())) return false;
    if (!getIdResultList()
        .equals(other.getIdResultList())) return false;
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
    hash = (37 * hash) + LANGID_FIELD_NUMBER;
    hash = (53 * hash) + getLangId().hashCode();
    if (getIdResultCount() > 0) {
      hash = (37 * hash) + IDRESULT_FIELD_NUMBER;
      hash = (53 * hash) + getIdResultList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static zemberek.proto.LanguageIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.LanguageIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.LanguageIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.LanguageIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.LanguageIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.LanguageIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.LanguageIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zemberek.proto.LanguageIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static zemberek.proto.LanguageIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static zemberek.proto.LanguageIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static zemberek.proto.LanguageIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zemberek.proto.LanguageIdResponse parseFrom(
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
  public static Builder newBuilder(zemberek.proto.LanguageIdResponse prototype) {
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
   * Protobuf type {@code zemberek.langid.LanguageIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zemberek.langid.LanguageIdResponse)
      zemberek.proto.LanguageIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return zemberek.proto.LanguageId.internal_static_zemberek_langid_LanguageIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return zemberek.proto.LanguageId.internal_static_zemberek_langid_LanguageIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              zemberek.proto.LanguageIdResponse.class, zemberek.proto.LanguageIdResponse.Builder.class);
    }

    // Construct using zemberek.proto.LanguageIdResponse.newBuilder()
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
        getIdResultFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      langId_ = "";

      if (idResultBuilder_ == null) {
        idResult_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        idResultBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return zemberek.proto.LanguageId.internal_static_zemberek_langid_LanguageIdResponse_descriptor;
    }

    @java.lang.Override
    public zemberek.proto.LanguageIdResponse getDefaultInstanceForType() {
      return zemberek.proto.LanguageIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public zemberek.proto.LanguageIdResponse build() {
      zemberek.proto.LanguageIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public zemberek.proto.LanguageIdResponse buildPartial() {
      zemberek.proto.LanguageIdResponse result = new zemberek.proto.LanguageIdResponse(this);
      int from_bitField0_ = bitField0_;
      result.langId_ = langId_;
      if (idResultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          idResult_ = java.util.Collections.unmodifiableList(idResult_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.idResult_ = idResult_;
      } else {
        result.idResult_ = idResultBuilder_.build();
      }
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
      if (other instanceof zemberek.proto.LanguageIdResponse) {
        return mergeFrom((zemberek.proto.LanguageIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(zemberek.proto.LanguageIdResponse other) {
      if (other == zemberek.proto.LanguageIdResponse.getDefaultInstance()) return this;
      if (!other.getLangId().isEmpty()) {
        langId_ = other.langId_;
        onChanged();
      }
      if (idResultBuilder_ == null) {
        if (!other.idResult_.isEmpty()) {
          if (idResult_.isEmpty()) {
            idResult_ = other.idResult_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIdResultIsMutable();
            idResult_.addAll(other.idResult_);
          }
          onChanged();
        }
      } else {
        if (!other.idResult_.isEmpty()) {
          if (idResultBuilder_.isEmpty()) {
            idResultBuilder_.dispose();
            idResultBuilder_ = null;
            idResult_ = other.idResult_;
            bitField0_ = (bitField0_ & ~0x00000001);
            idResultBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getIdResultFieldBuilder() : null;
          } else {
            idResultBuilder_.addAllMessages(other.idResult_);
          }
        }
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
      zemberek.proto.LanguageIdResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (zemberek.proto.LanguageIdResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object langId_ = "";
    /**
     * <code>string langId = 1;</code>
     * @return The langId.
     */
    public java.lang.String getLangId() {
      java.lang.Object ref = langId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        langId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string langId = 1;</code>
     * @return The bytes for langId.
     */
    public com.google.protobuf.ByteString
        getLangIdBytes() {
      java.lang.Object ref = langId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        langId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string langId = 1;</code>
     * @param value The langId to set.
     * @return This builder for chaining.
     */
    public Builder setLangId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      langId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string langId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLangId() {
      
      langId_ = getDefaultInstance().getLangId();
      onChanged();
      return this;
    }
    /**
     * <code>string langId = 1;</code>
     * @param value The bytes for langId to set.
     * @return This builder for chaining.
     */
    public Builder setLangIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      langId_ = value;
      onChanged();
      return this;
    }

    private java.util.List<zemberek.proto.IdResult> idResult_ =
      java.util.Collections.emptyList();
    private void ensureIdResultIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        idResult_ = new java.util.ArrayList<zemberek.proto.IdResult>(idResult_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        zemberek.proto.IdResult, zemberek.proto.IdResult.Builder, zemberek.proto.IdResultOrBuilder> idResultBuilder_;

    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public java.util.List<zemberek.proto.IdResult> getIdResultList() {
      if (idResultBuilder_ == null) {
        return java.util.Collections.unmodifiableList(idResult_);
      } else {
        return idResultBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public int getIdResultCount() {
      if (idResultBuilder_ == null) {
        return idResult_.size();
      } else {
        return idResultBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public zemberek.proto.IdResult getIdResult(int index) {
      if (idResultBuilder_ == null) {
        return idResult_.get(index);
      } else {
        return idResultBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public Builder setIdResult(
        int index, zemberek.proto.IdResult value) {
      if (idResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdResultIsMutable();
        idResult_.set(index, value);
        onChanged();
      } else {
        idResultBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public Builder setIdResult(
        int index, zemberek.proto.IdResult.Builder builderForValue) {
      if (idResultBuilder_ == null) {
        ensureIdResultIsMutable();
        idResult_.set(index, builderForValue.build());
        onChanged();
      } else {
        idResultBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public Builder addIdResult(zemberek.proto.IdResult value) {
      if (idResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdResultIsMutable();
        idResult_.add(value);
        onChanged();
      } else {
        idResultBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public Builder addIdResult(
        int index, zemberek.proto.IdResult value) {
      if (idResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdResultIsMutable();
        idResult_.add(index, value);
        onChanged();
      } else {
        idResultBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public Builder addIdResult(
        zemberek.proto.IdResult.Builder builderForValue) {
      if (idResultBuilder_ == null) {
        ensureIdResultIsMutable();
        idResult_.add(builderForValue.build());
        onChanged();
      } else {
        idResultBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public Builder addIdResult(
        int index, zemberek.proto.IdResult.Builder builderForValue) {
      if (idResultBuilder_ == null) {
        ensureIdResultIsMutable();
        idResult_.add(index, builderForValue.build());
        onChanged();
      } else {
        idResultBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public Builder addAllIdResult(
        java.lang.Iterable<? extends zemberek.proto.IdResult> values) {
      if (idResultBuilder_ == null) {
        ensureIdResultIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, idResult_);
        onChanged();
      } else {
        idResultBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public Builder clearIdResult() {
      if (idResultBuilder_ == null) {
        idResult_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        idResultBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public Builder removeIdResult(int index) {
      if (idResultBuilder_ == null) {
        ensureIdResultIsMutable();
        idResult_.remove(index);
        onChanged();
      } else {
        idResultBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public zemberek.proto.IdResult.Builder getIdResultBuilder(
        int index) {
      return getIdResultFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public zemberek.proto.IdResultOrBuilder getIdResultOrBuilder(
        int index) {
      if (idResultBuilder_ == null) {
        return idResult_.get(index);  } else {
        return idResultBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public java.util.List<? extends zemberek.proto.IdResultOrBuilder> 
         getIdResultOrBuilderList() {
      if (idResultBuilder_ != null) {
        return idResultBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(idResult_);
      }
    }
    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public zemberek.proto.IdResult.Builder addIdResultBuilder() {
      return getIdResultFieldBuilder().addBuilder(
          zemberek.proto.IdResult.getDefaultInstance());
    }
    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public zemberek.proto.IdResult.Builder addIdResultBuilder(
        int index) {
      return getIdResultFieldBuilder().addBuilder(
          index, zemberek.proto.IdResult.getDefaultInstance());
    }
    /**
     * <code>repeated .zemberek.langid.IdResult idResult = 2;</code>
     */
    public java.util.List<zemberek.proto.IdResult.Builder> 
         getIdResultBuilderList() {
      return getIdResultFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        zemberek.proto.IdResult, zemberek.proto.IdResult.Builder, zemberek.proto.IdResultOrBuilder> 
        getIdResultFieldBuilder() {
      if (idResultBuilder_ == null) {
        idResultBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            zemberek.proto.IdResult, zemberek.proto.IdResult.Builder, zemberek.proto.IdResultOrBuilder>(
                idResult_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        idResult_ = null;
      }
      return idResultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:zemberek.langid.LanguageIdResponse)
  }

  // @@protoc_insertion_point(class_scope:zemberek.langid.LanguageIdResponse)
  private static final zemberek.proto.LanguageIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new zemberek.proto.LanguageIdResponse();
  }

  public static zemberek.proto.LanguageIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LanguageIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<LanguageIdResponse>() {
    @java.lang.Override
    public LanguageIdResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LanguageIdResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LanguageIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LanguageIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public zemberek.proto.LanguageIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

