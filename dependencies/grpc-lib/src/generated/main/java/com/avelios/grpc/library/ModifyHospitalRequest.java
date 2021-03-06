// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc-interfaces.proto

package com.avelios.grpc.library;

/**
 * Protobuf type {@code ModifyHospitalRequest}
 */
public final class ModifyHospitalRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ModifyHospitalRequest)
    ModifyHospitalRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModifyHospitalRequest.newBuilder() to construct.
  private ModifyHospitalRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModifyHospitalRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ModifyHospitalRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ModifyHospitalRequest(
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
            com.avelios.grpc.library.Hospital.Builder subBuilder = null;
            if (hospital_ != null) {
              subBuilder = hospital_.toBuilder();
            }
            hospital_ = input.readMessage(com.avelios.grpc.library.Hospital.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hospital_);
              hospital_ = subBuilder.buildPartial();
            }

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
    return com.avelios.grpc.library.GrpcInterfaces.internal_static_ModifyHospitalRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.avelios.grpc.library.GrpcInterfaces.internal_static_ModifyHospitalRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.avelios.grpc.library.ModifyHospitalRequest.class, com.avelios.grpc.library.ModifyHospitalRequest.Builder.class);
  }

  public static final int HOSPITAL_FIELD_NUMBER = 1;
  private com.avelios.grpc.library.Hospital hospital_;
  /**
   * <pre>
   * Contains the id of the hospital to modify, as well as all fields to be modified.
   * </pre>
   *
   * <code>.Hospital hospital = 1;</code>
   * @return Whether the hospital field is set.
   */
  @java.lang.Override
  public boolean hasHospital() {
    return hospital_ != null;
  }
  /**
   * <pre>
   * Contains the id of the hospital to modify, as well as all fields to be modified.
   * </pre>
   *
   * <code>.Hospital hospital = 1;</code>
   * @return The hospital.
   */
  @java.lang.Override
  public com.avelios.grpc.library.Hospital getHospital() {
    return hospital_ == null ? com.avelios.grpc.library.Hospital.getDefaultInstance() : hospital_;
  }
  /**
   * <pre>
   * Contains the id of the hospital to modify, as well as all fields to be modified.
   * </pre>
   *
   * <code>.Hospital hospital = 1;</code>
   */
  @java.lang.Override
  public com.avelios.grpc.library.HospitalOrBuilder getHospitalOrBuilder() {
    return getHospital();
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
    if (hospital_ != null) {
      output.writeMessage(1, getHospital());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hospital_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHospital());
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
    if (!(obj instanceof com.avelios.grpc.library.ModifyHospitalRequest)) {
      return super.equals(obj);
    }
    com.avelios.grpc.library.ModifyHospitalRequest other = (com.avelios.grpc.library.ModifyHospitalRequest) obj;

    if (hasHospital() != other.hasHospital()) return false;
    if (hasHospital()) {
      if (!getHospital()
          .equals(other.getHospital())) return false;
    }
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
    if (hasHospital()) {
      hash = (37 * hash) + HOSPITAL_FIELD_NUMBER;
      hash = (53 * hash) + getHospital().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.avelios.grpc.library.ModifyHospitalRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.avelios.grpc.library.ModifyHospitalRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.avelios.grpc.library.ModifyHospitalRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.avelios.grpc.library.ModifyHospitalRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.avelios.grpc.library.ModifyHospitalRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.avelios.grpc.library.ModifyHospitalRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.avelios.grpc.library.ModifyHospitalRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.avelios.grpc.library.ModifyHospitalRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.avelios.grpc.library.ModifyHospitalRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.avelios.grpc.library.ModifyHospitalRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.avelios.grpc.library.ModifyHospitalRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.avelios.grpc.library.ModifyHospitalRequest parseFrom(
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
  public static Builder newBuilder(com.avelios.grpc.library.ModifyHospitalRequest prototype) {
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
   * Protobuf type {@code ModifyHospitalRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ModifyHospitalRequest)
      com.avelios.grpc.library.ModifyHospitalRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.avelios.grpc.library.GrpcInterfaces.internal_static_ModifyHospitalRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.avelios.grpc.library.GrpcInterfaces.internal_static_ModifyHospitalRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.avelios.grpc.library.ModifyHospitalRequest.class, com.avelios.grpc.library.ModifyHospitalRequest.Builder.class);
    }

    // Construct using com.avelios.grpc.library.ModifyHospitalRequest.newBuilder()
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
      if (hospitalBuilder_ == null) {
        hospital_ = null;
      } else {
        hospital_ = null;
        hospitalBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.avelios.grpc.library.GrpcInterfaces.internal_static_ModifyHospitalRequest_descriptor;
    }

    @java.lang.Override
    public com.avelios.grpc.library.ModifyHospitalRequest getDefaultInstanceForType() {
      return com.avelios.grpc.library.ModifyHospitalRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.avelios.grpc.library.ModifyHospitalRequest build() {
      com.avelios.grpc.library.ModifyHospitalRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.avelios.grpc.library.ModifyHospitalRequest buildPartial() {
      com.avelios.grpc.library.ModifyHospitalRequest result = new com.avelios.grpc.library.ModifyHospitalRequest(this);
      if (hospitalBuilder_ == null) {
        result.hospital_ = hospital_;
      } else {
        result.hospital_ = hospitalBuilder_.build();
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
      if (other instanceof com.avelios.grpc.library.ModifyHospitalRequest) {
        return mergeFrom((com.avelios.grpc.library.ModifyHospitalRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.avelios.grpc.library.ModifyHospitalRequest other) {
      if (other == com.avelios.grpc.library.ModifyHospitalRequest.getDefaultInstance()) return this;
      if (other.hasHospital()) {
        mergeHospital(other.getHospital());
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
      com.avelios.grpc.library.ModifyHospitalRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.avelios.grpc.library.ModifyHospitalRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.avelios.grpc.library.Hospital hospital_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.avelios.grpc.library.Hospital, com.avelios.grpc.library.Hospital.Builder, com.avelios.grpc.library.HospitalOrBuilder> hospitalBuilder_;
    /**
     * <pre>
     * Contains the id of the hospital to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Hospital hospital = 1;</code>
     * @return Whether the hospital field is set.
     */
    public boolean hasHospital() {
      return hospitalBuilder_ != null || hospital_ != null;
    }
    /**
     * <pre>
     * Contains the id of the hospital to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Hospital hospital = 1;</code>
     * @return The hospital.
     */
    public com.avelios.grpc.library.Hospital getHospital() {
      if (hospitalBuilder_ == null) {
        return hospital_ == null ? com.avelios.grpc.library.Hospital.getDefaultInstance() : hospital_;
      } else {
        return hospitalBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Contains the id of the hospital to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Hospital hospital = 1;</code>
     */
    public Builder setHospital(com.avelios.grpc.library.Hospital value) {
      if (hospitalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hospital_ = value;
        onChanged();
      } else {
        hospitalBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Contains the id of the hospital to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Hospital hospital = 1;</code>
     */
    public Builder setHospital(
        com.avelios.grpc.library.Hospital.Builder builderForValue) {
      if (hospitalBuilder_ == null) {
        hospital_ = builderForValue.build();
        onChanged();
      } else {
        hospitalBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Contains the id of the hospital to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Hospital hospital = 1;</code>
     */
    public Builder mergeHospital(com.avelios.grpc.library.Hospital value) {
      if (hospitalBuilder_ == null) {
        if (hospital_ != null) {
          hospital_ =
            com.avelios.grpc.library.Hospital.newBuilder(hospital_).mergeFrom(value).buildPartial();
        } else {
          hospital_ = value;
        }
        onChanged();
      } else {
        hospitalBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Contains the id of the hospital to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Hospital hospital = 1;</code>
     */
    public Builder clearHospital() {
      if (hospitalBuilder_ == null) {
        hospital_ = null;
        onChanged();
      } else {
        hospital_ = null;
        hospitalBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Contains the id of the hospital to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Hospital hospital = 1;</code>
     */
    public com.avelios.grpc.library.Hospital.Builder getHospitalBuilder() {
      
      onChanged();
      return getHospitalFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Contains the id of the hospital to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Hospital hospital = 1;</code>
     */
    public com.avelios.grpc.library.HospitalOrBuilder getHospitalOrBuilder() {
      if (hospitalBuilder_ != null) {
        return hospitalBuilder_.getMessageOrBuilder();
      } else {
        return hospital_ == null ?
            com.avelios.grpc.library.Hospital.getDefaultInstance() : hospital_;
      }
    }
    /**
     * <pre>
     * Contains the id of the hospital to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Hospital hospital = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.avelios.grpc.library.Hospital, com.avelios.grpc.library.Hospital.Builder, com.avelios.grpc.library.HospitalOrBuilder> 
        getHospitalFieldBuilder() {
      if (hospitalBuilder_ == null) {
        hospitalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.avelios.grpc.library.Hospital, com.avelios.grpc.library.Hospital.Builder, com.avelios.grpc.library.HospitalOrBuilder>(
                getHospital(),
                getParentForChildren(),
                isClean());
        hospital_ = null;
      }
      return hospitalBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ModifyHospitalRequest)
  }

  // @@protoc_insertion_point(class_scope:ModifyHospitalRequest)
  private static final com.avelios.grpc.library.ModifyHospitalRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.avelios.grpc.library.ModifyHospitalRequest();
  }

  public static com.avelios.grpc.library.ModifyHospitalRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModifyHospitalRequest>
      PARSER = new com.google.protobuf.AbstractParser<ModifyHospitalRequest>() {
    @java.lang.Override
    public ModifyHospitalRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ModifyHospitalRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ModifyHospitalRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModifyHospitalRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.avelios.grpc.library.ModifyHospitalRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

