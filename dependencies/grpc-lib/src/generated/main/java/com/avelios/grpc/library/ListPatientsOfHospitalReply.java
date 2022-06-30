// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc-interfaces.proto

package com.avelios.grpc.library;

/**
 * Protobuf type {@code ListPatientsOfHospitalReply}
 */
public final class ListPatientsOfHospitalReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ListPatientsOfHospitalReply)
    ListPatientsOfHospitalReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPatientsOfHospitalReply.newBuilder() to construct.
  private ListPatientsOfHospitalReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPatientsOfHospitalReply() {
    patients_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListPatientsOfHospitalReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListPatientsOfHospitalReply(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              patients_ = new java.util.ArrayList<com.avelios.grpc.library.Patient>();
              mutable_bitField0_ |= 0x00000001;
            }
            patients_.add(
                input.readMessage(com.avelios.grpc.library.Patient.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        patients_ = java.util.Collections.unmodifiableList(patients_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.avelios.grpc.library.GrpcInterfaces.internal_static_ListPatientsOfHospitalReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.avelios.grpc.library.GrpcInterfaces.internal_static_ListPatientsOfHospitalReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.avelios.grpc.library.ListPatientsOfHospitalReply.class, com.avelios.grpc.library.ListPatientsOfHospitalReply.Builder.class);
  }

  public static final int PATIENTS_FIELD_NUMBER = 1;
  private java.util.List<com.avelios.grpc.library.Patient> patients_;
  /**
   * <code>repeated .Patient patients = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.avelios.grpc.library.Patient> getPatientsList() {
    return patients_;
  }
  /**
   * <code>repeated .Patient patients = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.avelios.grpc.library.PatientOrBuilder> 
      getPatientsOrBuilderList() {
    return patients_;
  }
  /**
   * <code>repeated .Patient patients = 1;</code>
   */
  @java.lang.Override
  public int getPatientsCount() {
    return patients_.size();
  }
  /**
   * <code>repeated .Patient patients = 1;</code>
   */
  @java.lang.Override
  public com.avelios.grpc.library.Patient getPatients(int index) {
    return patients_.get(index);
  }
  /**
   * <code>repeated .Patient patients = 1;</code>
   */
  @java.lang.Override
  public com.avelios.grpc.library.PatientOrBuilder getPatientsOrBuilder(
      int index) {
    return patients_.get(index);
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
    for (int i = 0; i < patients_.size(); i++) {
      output.writeMessage(1, patients_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < patients_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, patients_.get(i));
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
    if (!(obj instanceof com.avelios.grpc.library.ListPatientsOfHospitalReply)) {
      return super.equals(obj);
    }
    com.avelios.grpc.library.ListPatientsOfHospitalReply other = (com.avelios.grpc.library.ListPatientsOfHospitalReply) obj;

    if (!getPatientsList()
        .equals(other.getPatientsList())) return false;
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
    if (getPatientsCount() > 0) {
      hash = (37 * hash) + PATIENTS_FIELD_NUMBER;
      hash = (53 * hash) + getPatientsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.avelios.grpc.library.ListPatientsOfHospitalReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.avelios.grpc.library.ListPatientsOfHospitalReply parseFrom(
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
  public static Builder newBuilder(com.avelios.grpc.library.ListPatientsOfHospitalReply prototype) {
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
   * Protobuf type {@code ListPatientsOfHospitalReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ListPatientsOfHospitalReply)
      com.avelios.grpc.library.ListPatientsOfHospitalReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.avelios.grpc.library.GrpcInterfaces.internal_static_ListPatientsOfHospitalReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.avelios.grpc.library.GrpcInterfaces.internal_static_ListPatientsOfHospitalReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.avelios.grpc.library.ListPatientsOfHospitalReply.class, com.avelios.grpc.library.ListPatientsOfHospitalReply.Builder.class);
    }

    // Construct using com.avelios.grpc.library.ListPatientsOfHospitalReply.newBuilder()
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
        getPatientsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (patientsBuilder_ == null) {
        patients_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        patientsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.avelios.grpc.library.GrpcInterfaces.internal_static_ListPatientsOfHospitalReply_descriptor;
    }

    @java.lang.Override
    public com.avelios.grpc.library.ListPatientsOfHospitalReply getDefaultInstanceForType() {
      return com.avelios.grpc.library.ListPatientsOfHospitalReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.avelios.grpc.library.ListPatientsOfHospitalReply build() {
      com.avelios.grpc.library.ListPatientsOfHospitalReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.avelios.grpc.library.ListPatientsOfHospitalReply buildPartial() {
      com.avelios.grpc.library.ListPatientsOfHospitalReply result = new com.avelios.grpc.library.ListPatientsOfHospitalReply(this);
      int from_bitField0_ = bitField0_;
      if (patientsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          patients_ = java.util.Collections.unmodifiableList(patients_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.patients_ = patients_;
      } else {
        result.patients_ = patientsBuilder_.build();
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
      if (other instanceof com.avelios.grpc.library.ListPatientsOfHospitalReply) {
        return mergeFrom((com.avelios.grpc.library.ListPatientsOfHospitalReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.avelios.grpc.library.ListPatientsOfHospitalReply other) {
      if (other == com.avelios.grpc.library.ListPatientsOfHospitalReply.getDefaultInstance()) return this;
      if (patientsBuilder_ == null) {
        if (!other.patients_.isEmpty()) {
          if (patients_.isEmpty()) {
            patients_ = other.patients_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePatientsIsMutable();
            patients_.addAll(other.patients_);
          }
          onChanged();
        }
      } else {
        if (!other.patients_.isEmpty()) {
          if (patientsBuilder_.isEmpty()) {
            patientsBuilder_.dispose();
            patientsBuilder_ = null;
            patients_ = other.patients_;
            bitField0_ = (bitField0_ & ~0x00000001);
            patientsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPatientsFieldBuilder() : null;
          } else {
            patientsBuilder_.addAllMessages(other.patients_);
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
      com.avelios.grpc.library.ListPatientsOfHospitalReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.avelios.grpc.library.ListPatientsOfHospitalReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.avelios.grpc.library.Patient> patients_ =
      java.util.Collections.emptyList();
    private void ensurePatientsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        patients_ = new java.util.ArrayList<com.avelios.grpc.library.Patient>(patients_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.avelios.grpc.library.Patient, com.avelios.grpc.library.Patient.Builder, com.avelios.grpc.library.PatientOrBuilder> patientsBuilder_;

    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public java.util.List<com.avelios.grpc.library.Patient> getPatientsList() {
      if (patientsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(patients_);
      } else {
        return patientsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public int getPatientsCount() {
      if (patientsBuilder_ == null) {
        return patients_.size();
      } else {
        return patientsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public com.avelios.grpc.library.Patient getPatients(int index) {
      if (patientsBuilder_ == null) {
        return patients_.get(index);
      } else {
        return patientsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public Builder setPatients(
        int index, com.avelios.grpc.library.Patient value) {
      if (patientsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePatientsIsMutable();
        patients_.set(index, value);
        onChanged();
      } else {
        patientsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public Builder setPatients(
        int index, com.avelios.grpc.library.Patient.Builder builderForValue) {
      if (patientsBuilder_ == null) {
        ensurePatientsIsMutable();
        patients_.set(index, builderForValue.build());
        onChanged();
      } else {
        patientsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public Builder addPatients(com.avelios.grpc.library.Patient value) {
      if (patientsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePatientsIsMutable();
        patients_.add(value);
        onChanged();
      } else {
        patientsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public Builder addPatients(
        int index, com.avelios.grpc.library.Patient value) {
      if (patientsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePatientsIsMutable();
        patients_.add(index, value);
        onChanged();
      } else {
        patientsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public Builder addPatients(
        com.avelios.grpc.library.Patient.Builder builderForValue) {
      if (patientsBuilder_ == null) {
        ensurePatientsIsMutable();
        patients_.add(builderForValue.build());
        onChanged();
      } else {
        patientsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public Builder addPatients(
        int index, com.avelios.grpc.library.Patient.Builder builderForValue) {
      if (patientsBuilder_ == null) {
        ensurePatientsIsMutable();
        patients_.add(index, builderForValue.build());
        onChanged();
      } else {
        patientsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public Builder addAllPatients(
        java.lang.Iterable<? extends com.avelios.grpc.library.Patient> values) {
      if (patientsBuilder_ == null) {
        ensurePatientsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, patients_);
        onChanged();
      } else {
        patientsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public Builder clearPatients() {
      if (patientsBuilder_ == null) {
        patients_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        patientsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public Builder removePatients(int index) {
      if (patientsBuilder_ == null) {
        ensurePatientsIsMutable();
        patients_.remove(index);
        onChanged();
      } else {
        patientsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public com.avelios.grpc.library.Patient.Builder getPatientsBuilder(
        int index) {
      return getPatientsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public com.avelios.grpc.library.PatientOrBuilder getPatientsOrBuilder(
        int index) {
      if (patientsBuilder_ == null) {
        return patients_.get(index);  } else {
        return patientsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public java.util.List<? extends com.avelios.grpc.library.PatientOrBuilder> 
         getPatientsOrBuilderList() {
      if (patientsBuilder_ != null) {
        return patientsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(patients_);
      }
    }
    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public com.avelios.grpc.library.Patient.Builder addPatientsBuilder() {
      return getPatientsFieldBuilder().addBuilder(
          com.avelios.grpc.library.Patient.getDefaultInstance());
    }
    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public com.avelios.grpc.library.Patient.Builder addPatientsBuilder(
        int index) {
      return getPatientsFieldBuilder().addBuilder(
          index, com.avelios.grpc.library.Patient.getDefaultInstance());
    }
    /**
     * <code>repeated .Patient patients = 1;</code>
     */
    public java.util.List<com.avelios.grpc.library.Patient.Builder> 
         getPatientsBuilderList() {
      return getPatientsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.avelios.grpc.library.Patient, com.avelios.grpc.library.Patient.Builder, com.avelios.grpc.library.PatientOrBuilder> 
        getPatientsFieldBuilder() {
      if (patientsBuilder_ == null) {
        patientsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.avelios.grpc.library.Patient, com.avelios.grpc.library.Patient.Builder, com.avelios.grpc.library.PatientOrBuilder>(
                patients_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        patients_ = null;
      }
      return patientsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ListPatientsOfHospitalReply)
  }

  // @@protoc_insertion_point(class_scope:ListPatientsOfHospitalReply)
  private static final com.avelios.grpc.library.ListPatientsOfHospitalReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.avelios.grpc.library.ListPatientsOfHospitalReply();
  }

  public static com.avelios.grpc.library.ListPatientsOfHospitalReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPatientsOfHospitalReply>
      PARSER = new com.google.protobuf.AbstractParser<ListPatientsOfHospitalReply>() {
    @java.lang.Override
    public ListPatientsOfHospitalReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListPatientsOfHospitalReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListPatientsOfHospitalReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPatientsOfHospitalReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.avelios.grpc.library.ListPatientsOfHospitalReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

