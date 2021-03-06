// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc-interfaces.proto

package com.avelios.grpc.library;

/**
 * Protobuf type {@code ModifyPatientRequest}
 */
public final class ModifyPatientRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ModifyPatientRequest)
    ModifyPatientRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModifyPatientRequest.newBuilder() to construct.
  private ModifyPatientRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModifyPatientRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ModifyPatientRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ModifyPatientRequest(
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
            com.avelios.grpc.library.Patient.Builder subBuilder = null;
            if (patient_ != null) {
              subBuilder = patient_.toBuilder();
            }
            patient_ = input.readMessage(com.avelios.grpc.library.Patient.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(patient_);
              patient_ = subBuilder.buildPartial();
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
    return com.avelios.grpc.library.GrpcInterfaces.internal_static_ModifyPatientRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.avelios.grpc.library.GrpcInterfaces.internal_static_ModifyPatientRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.avelios.grpc.library.ModifyPatientRequest.class, com.avelios.grpc.library.ModifyPatientRequest.Builder.class);
  }

  public static final int PATIENT_FIELD_NUMBER = 1;
  private com.avelios.grpc.library.Patient patient_;
  /**
   * <pre>
   * Contains the id of the patient to modify, as well as all fields to be modified.
   * </pre>
   *
   * <code>.Patient patient = 1;</code>
   * @return Whether the patient field is set.
   */
  @java.lang.Override
  public boolean hasPatient() {
    return patient_ != null;
  }
  /**
   * <pre>
   * Contains the id of the patient to modify, as well as all fields to be modified.
   * </pre>
   *
   * <code>.Patient patient = 1;</code>
   * @return The patient.
   */
  @java.lang.Override
  public com.avelios.grpc.library.Patient getPatient() {
    return patient_ == null ? com.avelios.grpc.library.Patient.getDefaultInstance() : patient_;
  }
  /**
   * <pre>
   * Contains the id of the patient to modify, as well as all fields to be modified.
   * </pre>
   *
   * <code>.Patient patient = 1;</code>
   */
  @java.lang.Override
  public com.avelios.grpc.library.PatientOrBuilder getPatientOrBuilder() {
    return getPatient();
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
    if (patient_ != null) {
      output.writeMessage(1, getPatient());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (patient_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPatient());
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
    if (!(obj instanceof com.avelios.grpc.library.ModifyPatientRequest)) {
      return super.equals(obj);
    }
    com.avelios.grpc.library.ModifyPatientRequest other = (com.avelios.grpc.library.ModifyPatientRequest) obj;

    if (hasPatient() != other.hasPatient()) return false;
    if (hasPatient()) {
      if (!getPatient()
          .equals(other.getPatient())) return false;
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
    if (hasPatient()) {
      hash = (37 * hash) + PATIENT_FIELD_NUMBER;
      hash = (53 * hash) + getPatient().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.avelios.grpc.library.ModifyPatientRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.avelios.grpc.library.ModifyPatientRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.avelios.grpc.library.ModifyPatientRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.avelios.grpc.library.ModifyPatientRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.avelios.grpc.library.ModifyPatientRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.avelios.grpc.library.ModifyPatientRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.avelios.grpc.library.ModifyPatientRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.avelios.grpc.library.ModifyPatientRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.avelios.grpc.library.ModifyPatientRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.avelios.grpc.library.ModifyPatientRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.avelios.grpc.library.ModifyPatientRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.avelios.grpc.library.ModifyPatientRequest parseFrom(
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
  public static Builder newBuilder(com.avelios.grpc.library.ModifyPatientRequest prototype) {
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
   * Protobuf type {@code ModifyPatientRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ModifyPatientRequest)
      com.avelios.grpc.library.ModifyPatientRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.avelios.grpc.library.GrpcInterfaces.internal_static_ModifyPatientRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.avelios.grpc.library.GrpcInterfaces.internal_static_ModifyPatientRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.avelios.grpc.library.ModifyPatientRequest.class, com.avelios.grpc.library.ModifyPatientRequest.Builder.class);
    }

    // Construct using com.avelios.grpc.library.ModifyPatientRequest.newBuilder()
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
      if (patientBuilder_ == null) {
        patient_ = null;
      } else {
        patient_ = null;
        patientBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.avelios.grpc.library.GrpcInterfaces.internal_static_ModifyPatientRequest_descriptor;
    }

    @java.lang.Override
    public com.avelios.grpc.library.ModifyPatientRequest getDefaultInstanceForType() {
      return com.avelios.grpc.library.ModifyPatientRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.avelios.grpc.library.ModifyPatientRequest build() {
      com.avelios.grpc.library.ModifyPatientRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.avelios.grpc.library.ModifyPatientRequest buildPartial() {
      com.avelios.grpc.library.ModifyPatientRequest result = new com.avelios.grpc.library.ModifyPatientRequest(this);
      if (patientBuilder_ == null) {
        result.patient_ = patient_;
      } else {
        result.patient_ = patientBuilder_.build();
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
      if (other instanceof com.avelios.grpc.library.ModifyPatientRequest) {
        return mergeFrom((com.avelios.grpc.library.ModifyPatientRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.avelios.grpc.library.ModifyPatientRequest other) {
      if (other == com.avelios.grpc.library.ModifyPatientRequest.getDefaultInstance()) return this;
      if (other.hasPatient()) {
        mergePatient(other.getPatient());
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
      com.avelios.grpc.library.ModifyPatientRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.avelios.grpc.library.ModifyPatientRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.avelios.grpc.library.Patient patient_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.avelios.grpc.library.Patient, com.avelios.grpc.library.Patient.Builder, com.avelios.grpc.library.PatientOrBuilder> patientBuilder_;
    /**
     * <pre>
     * Contains the id of the patient to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Patient patient = 1;</code>
     * @return Whether the patient field is set.
     */
    public boolean hasPatient() {
      return patientBuilder_ != null || patient_ != null;
    }
    /**
     * <pre>
     * Contains the id of the patient to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Patient patient = 1;</code>
     * @return The patient.
     */
    public com.avelios.grpc.library.Patient getPatient() {
      if (patientBuilder_ == null) {
        return patient_ == null ? com.avelios.grpc.library.Patient.getDefaultInstance() : patient_;
      } else {
        return patientBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Contains the id of the patient to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Patient patient = 1;</code>
     */
    public Builder setPatient(com.avelios.grpc.library.Patient value) {
      if (patientBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        patient_ = value;
        onChanged();
      } else {
        patientBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Contains the id of the patient to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Patient patient = 1;</code>
     */
    public Builder setPatient(
        com.avelios.grpc.library.Patient.Builder builderForValue) {
      if (patientBuilder_ == null) {
        patient_ = builderForValue.build();
        onChanged();
      } else {
        patientBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Contains the id of the patient to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Patient patient = 1;</code>
     */
    public Builder mergePatient(com.avelios.grpc.library.Patient value) {
      if (patientBuilder_ == null) {
        if (patient_ != null) {
          patient_ =
            com.avelios.grpc.library.Patient.newBuilder(patient_).mergeFrom(value).buildPartial();
        } else {
          patient_ = value;
        }
        onChanged();
      } else {
        patientBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Contains the id of the patient to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Patient patient = 1;</code>
     */
    public Builder clearPatient() {
      if (patientBuilder_ == null) {
        patient_ = null;
        onChanged();
      } else {
        patient_ = null;
        patientBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Contains the id of the patient to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Patient patient = 1;</code>
     */
    public com.avelios.grpc.library.Patient.Builder getPatientBuilder() {
      
      onChanged();
      return getPatientFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Contains the id of the patient to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Patient patient = 1;</code>
     */
    public com.avelios.grpc.library.PatientOrBuilder getPatientOrBuilder() {
      if (patientBuilder_ != null) {
        return patientBuilder_.getMessageOrBuilder();
      } else {
        return patient_ == null ?
            com.avelios.grpc.library.Patient.getDefaultInstance() : patient_;
      }
    }
    /**
     * <pre>
     * Contains the id of the patient to modify, as well as all fields to be modified.
     * </pre>
     *
     * <code>.Patient patient = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.avelios.grpc.library.Patient, com.avelios.grpc.library.Patient.Builder, com.avelios.grpc.library.PatientOrBuilder> 
        getPatientFieldBuilder() {
      if (patientBuilder_ == null) {
        patientBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.avelios.grpc.library.Patient, com.avelios.grpc.library.Patient.Builder, com.avelios.grpc.library.PatientOrBuilder>(
                getPatient(),
                getParentForChildren(),
                isClean());
        patient_ = null;
      }
      return patientBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ModifyPatientRequest)
  }

  // @@protoc_insertion_point(class_scope:ModifyPatientRequest)
  private static final com.avelios.grpc.library.ModifyPatientRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.avelios.grpc.library.ModifyPatientRequest();
  }

  public static com.avelios.grpc.library.ModifyPatientRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModifyPatientRequest>
      PARSER = new com.google.protobuf.AbstractParser<ModifyPatientRequest>() {
    @java.lang.Override
    public ModifyPatientRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ModifyPatientRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ModifyPatientRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModifyPatientRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.avelios.grpc.library.ModifyPatientRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

