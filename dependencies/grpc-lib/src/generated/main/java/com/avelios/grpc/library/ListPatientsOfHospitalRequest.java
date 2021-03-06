// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc-interfaces.proto

package com.avelios.grpc.library;

/**
 * Protobuf type {@code ListPatientsOfHospitalRequest}
 */
public final class ListPatientsOfHospitalRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ListPatientsOfHospitalRequest)
    ListPatientsOfHospitalRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPatientsOfHospitalRequest.newBuilder() to construct.
  private ListPatientsOfHospitalRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPatientsOfHospitalRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListPatientsOfHospitalRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListPatientsOfHospitalRequest(
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
          case 8: {

            hospitalId_ = input.readInt64();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.avelios.grpc.library.GrpcInterfaces.internal_static_ListPatientsOfHospitalRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.avelios.grpc.library.GrpcInterfaces.internal_static_ListPatientsOfHospitalRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.avelios.grpc.library.ListPatientsOfHospitalRequest.class, com.avelios.grpc.library.ListPatientsOfHospitalRequest.Builder.class);
  }

  public static final int HOSPITAL_ID_FIELD_NUMBER = 1;
  private long hospitalId_;
  /**
   * <code>int64 hospital_id = 1;</code>
   * @return The hospitalId.
   */
  @java.lang.Override
  public long getHospitalId() {
    return hospitalId_;
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
    if (hospitalId_ != 0L) {
      output.writeInt64(1, hospitalId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hospitalId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, hospitalId_);
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
    if (!(obj instanceof com.avelios.grpc.library.ListPatientsOfHospitalRequest)) {
      return super.equals(obj);
    }
    com.avelios.grpc.library.ListPatientsOfHospitalRequest other = (com.avelios.grpc.library.ListPatientsOfHospitalRequest) obj;

    if (getHospitalId()
        != other.getHospitalId()) return false;
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
    hash = (37 * hash) + HOSPITAL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHospitalId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.avelios.grpc.library.ListPatientsOfHospitalRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalRequest parseFrom(
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
  public static Builder newBuilder(com.avelios.grpc.library.ListPatientsOfHospitalRequest prototype) {
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
   * Protobuf type {@code ListPatientsOfHospitalRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ListPatientsOfHospitalRequest)
      com.avelios.grpc.library.ListPatientsOfHospitalRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.avelios.grpc.library.GrpcInterfaces.internal_static_ListPatientsOfHospitalRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.avelios.grpc.library.GrpcInterfaces.internal_static_ListPatientsOfHospitalRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.avelios.grpc.library.ListPatientsOfHospitalRequest.class, com.avelios.grpc.library.ListPatientsOfHospitalRequest.Builder.class);
    }

    // Construct using com.avelios.grpc.library.ListPatientsOfHospitalRequest.newBuilder()
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
      hospitalId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.avelios.grpc.library.GrpcInterfaces.internal_static_ListPatientsOfHospitalRequest_descriptor;
    }

    @java.lang.Override
    public com.avelios.grpc.library.ListPatientsOfHospitalRequest getDefaultInstanceForType() {
      return com.avelios.grpc.library.ListPatientsOfHospitalRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.avelios.grpc.library.ListPatientsOfHospitalRequest build() {
      com.avelios.grpc.library.ListPatientsOfHospitalRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.avelios.grpc.library.ListPatientsOfHospitalRequest buildPartial() {
      com.avelios.grpc.library.ListPatientsOfHospitalRequest result = new com.avelios.grpc.library.ListPatientsOfHospitalRequest(this);
      result.hospitalId_ = hospitalId_;
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
      if (other instanceof com.avelios.grpc.library.ListPatientsOfHospitalRequest) {
        return mergeFrom((com.avelios.grpc.library.ListPatientsOfHospitalRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.avelios.grpc.library.ListPatientsOfHospitalRequest other) {
      if (other == com.avelios.grpc.library.ListPatientsOfHospitalRequest.getDefaultInstance()) return this;
      if (other.getHospitalId() != 0L) {
        setHospitalId(other.getHospitalId());
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
      com.avelios.grpc.library.ListPatientsOfHospitalRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.avelios.grpc.library.ListPatientsOfHospitalRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long hospitalId_ ;
    /**
     * <code>int64 hospital_id = 1;</code>
     * @return The hospitalId.
     */
    @java.lang.Override
    public long getHospitalId() {
      return hospitalId_;
    }
    /**
     * <code>int64 hospital_id = 1;</code>
     * @param value The hospitalId to set.
     * @return This builder for chaining.
     */
    public Builder setHospitalId(long value) {
      
      hospitalId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 hospital_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHospitalId() {
      
      hospitalId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:ListPatientsOfHospitalRequest)
  }

  // @@protoc_insertion_point(class_scope:ListPatientsOfHospitalRequest)
  private static final com.avelios.grpc.library.ListPatientsOfHospitalRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.avelios.grpc.library.ListPatientsOfHospitalRequest();
  }

  public static com.avelios.grpc.library.ListPatientsOfHospitalRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPatientsOfHospitalRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListPatientsOfHospitalRequest>() {
    @java.lang.Override
    public ListPatientsOfHospitalRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListPatientsOfHospitalRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListPatientsOfHospitalRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPatientsOfHospitalRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.avelios.grpc.library.ListPatientsOfHospitalRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

