package com.avelios.grpc.library;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: grpc-interfaces.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HospitalPatientGrpc {

  private HospitalPatientGrpc() {}

  public static final String SERVICE_NAME = "HospitalPatient";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.avelios.grpc.library.CreateHospitalRequest,
      com.avelios.grpc.library.CreateHospitalReply> getCreateHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateHospital",
      requestType = com.avelios.grpc.library.CreateHospitalRequest.class,
      responseType = com.avelios.grpc.library.CreateHospitalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.avelios.grpc.library.CreateHospitalRequest,
      com.avelios.grpc.library.CreateHospitalReply> getCreateHospitalMethod() {
    io.grpc.MethodDescriptor<com.avelios.grpc.library.CreateHospitalRequest, com.avelios.grpc.library.CreateHospitalReply> getCreateHospitalMethod;
    if ((getCreateHospitalMethod = HospitalPatientGrpc.getCreateHospitalMethod) == null) {
      synchronized (HospitalPatientGrpc.class) {
        if ((getCreateHospitalMethod = HospitalPatientGrpc.getCreateHospitalMethod) == null) {
          HospitalPatientGrpc.getCreateHospitalMethod = getCreateHospitalMethod =
              io.grpc.MethodDescriptor.<com.avelios.grpc.library.CreateHospitalRequest, com.avelios.grpc.library.CreateHospitalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.CreateHospitalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.CreateHospitalReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalPatientMethodDescriptorSupplier("CreateHospital"))
              .build();
        }
      }
    }
    return getCreateHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.avelios.grpc.library.ModifyHospitalRequest,
      com.avelios.grpc.library.ModifyHospitalReply> getModifyHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyHospital",
      requestType = com.avelios.grpc.library.ModifyHospitalRequest.class,
      responseType = com.avelios.grpc.library.ModifyHospitalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.avelios.grpc.library.ModifyHospitalRequest,
      com.avelios.grpc.library.ModifyHospitalReply> getModifyHospitalMethod() {
    io.grpc.MethodDescriptor<com.avelios.grpc.library.ModifyHospitalRequest, com.avelios.grpc.library.ModifyHospitalReply> getModifyHospitalMethod;
    if ((getModifyHospitalMethod = HospitalPatientGrpc.getModifyHospitalMethod) == null) {
      synchronized (HospitalPatientGrpc.class) {
        if ((getModifyHospitalMethod = HospitalPatientGrpc.getModifyHospitalMethod) == null) {
          HospitalPatientGrpc.getModifyHospitalMethod = getModifyHospitalMethod =
              io.grpc.MethodDescriptor.<com.avelios.grpc.library.ModifyHospitalRequest, com.avelios.grpc.library.ModifyHospitalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.ModifyHospitalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.ModifyHospitalReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalPatientMethodDescriptorSupplier("ModifyHospital"))
              .build();
        }
      }
    }
    return getModifyHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.avelios.grpc.library.DeleteHospitalRequest,
      com.avelios.grpc.library.DeleteHospitalReply> getDeleteHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHospital",
      requestType = com.avelios.grpc.library.DeleteHospitalRequest.class,
      responseType = com.avelios.grpc.library.DeleteHospitalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.avelios.grpc.library.DeleteHospitalRequest,
      com.avelios.grpc.library.DeleteHospitalReply> getDeleteHospitalMethod() {
    io.grpc.MethodDescriptor<com.avelios.grpc.library.DeleteHospitalRequest, com.avelios.grpc.library.DeleteHospitalReply> getDeleteHospitalMethod;
    if ((getDeleteHospitalMethod = HospitalPatientGrpc.getDeleteHospitalMethod) == null) {
      synchronized (HospitalPatientGrpc.class) {
        if ((getDeleteHospitalMethod = HospitalPatientGrpc.getDeleteHospitalMethod) == null) {
          HospitalPatientGrpc.getDeleteHospitalMethod = getDeleteHospitalMethod =
              io.grpc.MethodDescriptor.<com.avelios.grpc.library.DeleteHospitalRequest, com.avelios.grpc.library.DeleteHospitalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.DeleteHospitalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.DeleteHospitalReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalPatientMethodDescriptorSupplier("DeleteHospital"))
              .build();
        }
      }
    }
    return getDeleteHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.avelios.grpc.library.ListHospitalsReply> getListHospitalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHospitals",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.avelios.grpc.library.ListHospitalsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.avelios.grpc.library.ListHospitalsReply> getListHospitalsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.avelios.grpc.library.ListHospitalsReply> getListHospitalsMethod;
    if ((getListHospitalsMethod = HospitalPatientGrpc.getListHospitalsMethod) == null) {
      synchronized (HospitalPatientGrpc.class) {
        if ((getListHospitalsMethod = HospitalPatientGrpc.getListHospitalsMethod) == null) {
          HospitalPatientGrpc.getListHospitalsMethod = getListHospitalsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.avelios.grpc.library.ListHospitalsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHospitals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.ListHospitalsReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalPatientMethodDescriptorSupplier("ListHospitals"))
              .build();
        }
      }
    }
    return getListHospitalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.avelios.grpc.library.CreatePatientRequest,
      com.avelios.grpc.library.CreatePatientReply> getCreatePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePatient",
      requestType = com.avelios.grpc.library.CreatePatientRequest.class,
      responseType = com.avelios.grpc.library.CreatePatientReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.avelios.grpc.library.CreatePatientRequest,
      com.avelios.grpc.library.CreatePatientReply> getCreatePatientMethod() {
    io.grpc.MethodDescriptor<com.avelios.grpc.library.CreatePatientRequest, com.avelios.grpc.library.CreatePatientReply> getCreatePatientMethod;
    if ((getCreatePatientMethod = HospitalPatientGrpc.getCreatePatientMethod) == null) {
      synchronized (HospitalPatientGrpc.class) {
        if ((getCreatePatientMethod = HospitalPatientGrpc.getCreatePatientMethod) == null) {
          HospitalPatientGrpc.getCreatePatientMethod = getCreatePatientMethod =
              io.grpc.MethodDescriptor.<com.avelios.grpc.library.CreatePatientRequest, com.avelios.grpc.library.CreatePatientReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.CreatePatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.CreatePatientReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalPatientMethodDescriptorSupplier("CreatePatient"))
              .build();
        }
      }
    }
    return getCreatePatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.avelios.grpc.library.ModifyPatientRequest,
      com.avelios.grpc.library.ModifyPatientReply> getModifyPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyPatient",
      requestType = com.avelios.grpc.library.ModifyPatientRequest.class,
      responseType = com.avelios.grpc.library.ModifyPatientReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.avelios.grpc.library.ModifyPatientRequest,
      com.avelios.grpc.library.ModifyPatientReply> getModifyPatientMethod() {
    io.grpc.MethodDescriptor<com.avelios.grpc.library.ModifyPatientRequest, com.avelios.grpc.library.ModifyPatientReply> getModifyPatientMethod;
    if ((getModifyPatientMethod = HospitalPatientGrpc.getModifyPatientMethod) == null) {
      synchronized (HospitalPatientGrpc.class) {
        if ((getModifyPatientMethod = HospitalPatientGrpc.getModifyPatientMethod) == null) {
          HospitalPatientGrpc.getModifyPatientMethod = getModifyPatientMethod =
              io.grpc.MethodDescriptor.<com.avelios.grpc.library.ModifyPatientRequest, com.avelios.grpc.library.ModifyPatientReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.ModifyPatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.ModifyPatientReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalPatientMethodDescriptorSupplier("ModifyPatient"))
              .build();
        }
      }
    }
    return getModifyPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.avelios.grpc.library.DeletePatientRequest,
      com.avelios.grpc.library.DeletePatientReply> getDeletePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePatient",
      requestType = com.avelios.grpc.library.DeletePatientRequest.class,
      responseType = com.avelios.grpc.library.DeletePatientReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.avelios.grpc.library.DeletePatientRequest,
      com.avelios.grpc.library.DeletePatientReply> getDeletePatientMethod() {
    io.grpc.MethodDescriptor<com.avelios.grpc.library.DeletePatientRequest, com.avelios.grpc.library.DeletePatientReply> getDeletePatientMethod;
    if ((getDeletePatientMethod = HospitalPatientGrpc.getDeletePatientMethod) == null) {
      synchronized (HospitalPatientGrpc.class) {
        if ((getDeletePatientMethod = HospitalPatientGrpc.getDeletePatientMethod) == null) {
          HospitalPatientGrpc.getDeletePatientMethod = getDeletePatientMethod =
              io.grpc.MethodDescriptor.<com.avelios.grpc.library.DeletePatientRequest, com.avelios.grpc.library.DeletePatientReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.DeletePatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.DeletePatientReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalPatientMethodDescriptorSupplier("DeletePatient"))
              .build();
        }
      }
    }
    return getDeletePatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.avelios.grpc.library.ListPatientsReply> getListPatientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPatients",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.avelios.grpc.library.ListPatientsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.avelios.grpc.library.ListPatientsReply> getListPatientsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.avelios.grpc.library.ListPatientsReply> getListPatientsMethod;
    if ((getListPatientsMethod = HospitalPatientGrpc.getListPatientsMethod) == null) {
      synchronized (HospitalPatientGrpc.class) {
        if ((getListPatientsMethod = HospitalPatientGrpc.getListPatientsMethod) == null) {
          HospitalPatientGrpc.getListPatientsMethod = getListPatientsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.avelios.grpc.library.ListPatientsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPatients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.ListPatientsReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalPatientMethodDescriptorSupplier("ListPatients"))
              .build();
        }
      }
    }
    return getListPatientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.avelios.grpc.library.RegisterPatientRequest,
      com.avelios.grpc.library.RegisterPatientReply> getRegisterPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPatient",
      requestType = com.avelios.grpc.library.RegisterPatientRequest.class,
      responseType = com.avelios.grpc.library.RegisterPatientReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.avelios.grpc.library.RegisterPatientRequest,
      com.avelios.grpc.library.RegisterPatientReply> getRegisterPatientMethod() {
    io.grpc.MethodDescriptor<com.avelios.grpc.library.RegisterPatientRequest, com.avelios.grpc.library.RegisterPatientReply> getRegisterPatientMethod;
    if ((getRegisterPatientMethod = HospitalPatientGrpc.getRegisterPatientMethod) == null) {
      synchronized (HospitalPatientGrpc.class) {
        if ((getRegisterPatientMethod = HospitalPatientGrpc.getRegisterPatientMethod) == null) {
          HospitalPatientGrpc.getRegisterPatientMethod = getRegisterPatientMethod =
              io.grpc.MethodDescriptor.<com.avelios.grpc.library.RegisterPatientRequest, com.avelios.grpc.library.RegisterPatientReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.RegisterPatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.RegisterPatientReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalPatientMethodDescriptorSupplier("RegisterPatient"))
              .build();
        }
      }
    }
    return getRegisterPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.avelios.grpc.library.ListPatientsOfHospitalRequest,
      com.avelios.grpc.library.ListPatientsOfHospitalReply> getListPatientsOfHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPatientsOfHospital",
      requestType = com.avelios.grpc.library.ListPatientsOfHospitalRequest.class,
      responseType = com.avelios.grpc.library.ListPatientsOfHospitalReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.avelios.grpc.library.ListPatientsOfHospitalRequest,
      com.avelios.grpc.library.ListPatientsOfHospitalReply> getListPatientsOfHospitalMethod() {
    io.grpc.MethodDescriptor<com.avelios.grpc.library.ListPatientsOfHospitalRequest, com.avelios.grpc.library.ListPatientsOfHospitalReply> getListPatientsOfHospitalMethod;
    if ((getListPatientsOfHospitalMethod = HospitalPatientGrpc.getListPatientsOfHospitalMethod) == null) {
      synchronized (HospitalPatientGrpc.class) {
        if ((getListPatientsOfHospitalMethod = HospitalPatientGrpc.getListPatientsOfHospitalMethod) == null) {
          HospitalPatientGrpc.getListPatientsOfHospitalMethod = getListPatientsOfHospitalMethod =
              io.grpc.MethodDescriptor.<com.avelios.grpc.library.ListPatientsOfHospitalRequest, com.avelios.grpc.library.ListPatientsOfHospitalReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPatientsOfHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.ListPatientsOfHospitalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.ListPatientsOfHospitalReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalPatientMethodDescriptorSupplier("ListPatientsOfHospital"))
              .build();
        }
      }
    }
    return getListPatientsOfHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.avelios.grpc.library.ListHospitalsOfPatientRequest,
      com.avelios.grpc.library.ListHospitalsOfPatientReply> getListHospitalsOfPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHospitalsOfPatient",
      requestType = com.avelios.grpc.library.ListHospitalsOfPatientRequest.class,
      responseType = com.avelios.grpc.library.ListHospitalsOfPatientReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.avelios.grpc.library.ListHospitalsOfPatientRequest,
      com.avelios.grpc.library.ListHospitalsOfPatientReply> getListHospitalsOfPatientMethod() {
    io.grpc.MethodDescriptor<com.avelios.grpc.library.ListHospitalsOfPatientRequest, com.avelios.grpc.library.ListHospitalsOfPatientReply> getListHospitalsOfPatientMethod;
    if ((getListHospitalsOfPatientMethod = HospitalPatientGrpc.getListHospitalsOfPatientMethod) == null) {
      synchronized (HospitalPatientGrpc.class) {
        if ((getListHospitalsOfPatientMethod = HospitalPatientGrpc.getListHospitalsOfPatientMethod) == null) {
          HospitalPatientGrpc.getListHospitalsOfPatientMethod = getListHospitalsOfPatientMethod =
              io.grpc.MethodDescriptor.<com.avelios.grpc.library.ListHospitalsOfPatientRequest, com.avelios.grpc.library.ListHospitalsOfPatientReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHospitalsOfPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.ListHospitalsOfPatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.avelios.grpc.library.ListHospitalsOfPatientReply.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalPatientMethodDescriptorSupplier("ListHospitalsOfPatient"))
              .build();
        }
      }
    }
    return getListHospitalsOfPatientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HospitalPatientStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HospitalPatientStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HospitalPatientStub>() {
        @java.lang.Override
        public HospitalPatientStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HospitalPatientStub(channel, callOptions);
        }
      };
    return HospitalPatientStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HospitalPatientBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HospitalPatientBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HospitalPatientBlockingStub>() {
        @java.lang.Override
        public HospitalPatientBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HospitalPatientBlockingStub(channel, callOptions);
        }
      };
    return HospitalPatientBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HospitalPatientFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HospitalPatientFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HospitalPatientFutureStub>() {
        @java.lang.Override
        public HospitalPatientFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HospitalPatientFutureStub(channel, callOptions);
        }
      };
    return HospitalPatientFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HospitalPatientImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Hospital RPCs.
     * </pre>
     */
    public void createHospital(com.avelios.grpc.library.CreateHospitalRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.CreateHospitalReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateHospitalMethod(), responseObserver);
    }

    /**
     */
    public void modifyHospital(com.avelios.grpc.library.ModifyHospitalRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.ModifyHospitalReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyHospitalMethod(), responseObserver);
    }

    /**
     */
    public void deleteHospital(com.avelios.grpc.library.DeleteHospitalRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.DeleteHospitalReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteHospitalMethod(), responseObserver);
    }

    /**
     */
    public void listHospitals(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.ListHospitalsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHospitalsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Patient RPCs.
     * </pre>
     */
    public void createPatient(com.avelios.grpc.library.CreatePatientRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.CreatePatientReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePatientMethod(), responseObserver);
    }

    /**
     */
    public void modifyPatient(com.avelios.grpc.library.ModifyPatientRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.ModifyPatientReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyPatientMethod(), responseObserver);
    }

    /**
     */
    public void deletePatient(com.avelios.grpc.library.DeletePatientRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.DeletePatientReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePatientMethod(), responseObserver);
    }

    /**
     */
    public void listPatients(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.ListPatientsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPatientsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Hospital-Patient RPCs.
     * </pre>
     */
    public void registerPatient(com.avelios.grpc.library.RegisterPatientRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.RegisterPatientReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterPatientMethod(), responseObserver);
    }

    /**
     */
    public void listPatientsOfHospital(com.avelios.grpc.library.ListPatientsOfHospitalRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.ListPatientsOfHospitalReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPatientsOfHospitalMethod(), responseObserver);
    }

    /**
     */
    public void listHospitalsOfPatient(com.avelios.grpc.library.ListHospitalsOfPatientRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.ListHospitalsOfPatientReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHospitalsOfPatientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.avelios.grpc.library.CreateHospitalRequest,
                com.avelios.grpc.library.CreateHospitalReply>(
                  this, METHODID_CREATE_HOSPITAL)))
          .addMethod(
            getModifyHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.avelios.grpc.library.ModifyHospitalRequest,
                com.avelios.grpc.library.ModifyHospitalReply>(
                  this, METHODID_MODIFY_HOSPITAL)))
          .addMethod(
            getDeleteHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.avelios.grpc.library.DeleteHospitalRequest,
                com.avelios.grpc.library.DeleteHospitalReply>(
                  this, METHODID_DELETE_HOSPITAL)))
          .addMethod(
            getListHospitalsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.avelios.grpc.library.ListHospitalsReply>(
                  this, METHODID_LIST_HOSPITALS)))
          .addMethod(
            getCreatePatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.avelios.grpc.library.CreatePatientRequest,
                com.avelios.grpc.library.CreatePatientReply>(
                  this, METHODID_CREATE_PATIENT)))
          .addMethod(
            getModifyPatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.avelios.grpc.library.ModifyPatientRequest,
                com.avelios.grpc.library.ModifyPatientReply>(
                  this, METHODID_MODIFY_PATIENT)))
          .addMethod(
            getDeletePatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.avelios.grpc.library.DeletePatientRequest,
                com.avelios.grpc.library.DeletePatientReply>(
                  this, METHODID_DELETE_PATIENT)))
          .addMethod(
            getListPatientsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.avelios.grpc.library.ListPatientsReply>(
                  this, METHODID_LIST_PATIENTS)))
          .addMethod(
            getRegisterPatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.avelios.grpc.library.RegisterPatientRequest,
                com.avelios.grpc.library.RegisterPatientReply>(
                  this, METHODID_REGISTER_PATIENT)))
          .addMethod(
            getListPatientsOfHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.avelios.grpc.library.ListPatientsOfHospitalRequest,
                com.avelios.grpc.library.ListPatientsOfHospitalReply>(
                  this, METHODID_LIST_PATIENTS_OF_HOSPITAL)))
          .addMethod(
            getListHospitalsOfPatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.avelios.grpc.library.ListHospitalsOfPatientRequest,
                com.avelios.grpc.library.ListHospitalsOfPatientReply>(
                  this, METHODID_LIST_HOSPITALS_OF_PATIENT)))
          .build();
    }
  }

  /**
   */
  public static final class HospitalPatientStub extends io.grpc.stub.AbstractAsyncStub<HospitalPatientStub> {
    private HospitalPatientStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalPatientStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HospitalPatientStub(channel, callOptions);
    }

    /**
     * <pre>
     * Hospital RPCs.
     * </pre>
     */
    public void createHospital(com.avelios.grpc.library.CreateHospitalRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.CreateHospitalReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyHospital(com.avelios.grpc.library.ModifyHospitalRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.ModifyHospitalReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteHospital(com.avelios.grpc.library.DeleteHospitalRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.DeleteHospitalReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listHospitals(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.ListHospitalsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHospitalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Patient RPCs.
     * </pre>
     */
    public void createPatient(com.avelios.grpc.library.CreatePatientRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.CreatePatientReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyPatient(com.avelios.grpc.library.ModifyPatientRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.ModifyPatientReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePatient(com.avelios.grpc.library.DeletePatientRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.DeletePatientReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPatients(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.ListPatientsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPatientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Hospital-Patient RPCs.
     * </pre>
     */
    public void registerPatient(com.avelios.grpc.library.RegisterPatientRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.RegisterPatientReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPatientsOfHospital(com.avelios.grpc.library.ListPatientsOfHospitalRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.ListPatientsOfHospitalReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPatientsOfHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listHospitalsOfPatient(com.avelios.grpc.library.ListHospitalsOfPatientRequest request,
        io.grpc.stub.StreamObserver<com.avelios.grpc.library.ListHospitalsOfPatientReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHospitalsOfPatientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HospitalPatientBlockingStub extends io.grpc.stub.AbstractBlockingStub<HospitalPatientBlockingStub> {
    private HospitalPatientBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalPatientBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HospitalPatientBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Hospital RPCs.
     * </pre>
     */
    public com.avelios.grpc.library.CreateHospitalReply createHospital(com.avelios.grpc.library.CreateHospitalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.avelios.grpc.library.ModifyHospitalReply modifyHospital(com.avelios.grpc.library.ModifyHospitalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.avelios.grpc.library.DeleteHospitalReply deleteHospital(com.avelios.grpc.library.DeleteHospitalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.avelios.grpc.library.ListHospitalsReply listHospitals(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHospitalsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Patient RPCs.
     * </pre>
     */
    public com.avelios.grpc.library.CreatePatientReply createPatient(com.avelios.grpc.library.CreatePatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.avelios.grpc.library.ModifyPatientReply modifyPatient(com.avelios.grpc.library.ModifyPatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyPatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.avelios.grpc.library.DeletePatientReply deletePatient(com.avelios.grpc.library.DeletePatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.avelios.grpc.library.ListPatientsReply listPatients(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPatientsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Hospital-Patient RPCs.
     * </pre>
     */
    public com.avelios.grpc.library.RegisterPatientReply registerPatient(com.avelios.grpc.library.RegisterPatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterPatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.avelios.grpc.library.ListPatientsOfHospitalReply listPatientsOfHospital(com.avelios.grpc.library.ListPatientsOfHospitalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPatientsOfHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.avelios.grpc.library.ListHospitalsOfPatientReply listHospitalsOfPatient(com.avelios.grpc.library.ListHospitalsOfPatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHospitalsOfPatientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HospitalPatientFutureStub extends io.grpc.stub.AbstractFutureStub<HospitalPatientFutureStub> {
    private HospitalPatientFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalPatientFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HospitalPatientFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Hospital RPCs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.avelios.grpc.library.CreateHospitalReply> createHospital(
        com.avelios.grpc.library.CreateHospitalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.avelios.grpc.library.ModifyHospitalReply> modifyHospital(
        com.avelios.grpc.library.ModifyHospitalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.avelios.grpc.library.DeleteHospitalReply> deleteHospital(
        com.avelios.grpc.library.DeleteHospitalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.avelios.grpc.library.ListHospitalsReply> listHospitals(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHospitalsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Patient RPCs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.avelios.grpc.library.CreatePatientReply> createPatient(
        com.avelios.grpc.library.CreatePatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.avelios.grpc.library.ModifyPatientReply> modifyPatient(
        com.avelios.grpc.library.ModifyPatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyPatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.avelios.grpc.library.DeletePatientReply> deletePatient(
        com.avelios.grpc.library.DeletePatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.avelios.grpc.library.ListPatientsReply> listPatients(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPatientsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Hospital-Patient RPCs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.avelios.grpc.library.RegisterPatientReply> registerPatient(
        com.avelios.grpc.library.RegisterPatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterPatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.avelios.grpc.library.ListPatientsOfHospitalReply> listPatientsOfHospital(
        com.avelios.grpc.library.ListPatientsOfHospitalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPatientsOfHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.avelios.grpc.library.ListHospitalsOfPatientReply> listHospitalsOfPatient(
        com.avelios.grpc.library.ListHospitalsOfPatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHospitalsOfPatientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_HOSPITAL = 0;
  private static final int METHODID_MODIFY_HOSPITAL = 1;
  private static final int METHODID_DELETE_HOSPITAL = 2;
  private static final int METHODID_LIST_HOSPITALS = 3;
  private static final int METHODID_CREATE_PATIENT = 4;
  private static final int METHODID_MODIFY_PATIENT = 5;
  private static final int METHODID_DELETE_PATIENT = 6;
  private static final int METHODID_LIST_PATIENTS = 7;
  private static final int METHODID_REGISTER_PATIENT = 8;
  private static final int METHODID_LIST_PATIENTS_OF_HOSPITAL = 9;
  private static final int METHODID_LIST_HOSPITALS_OF_PATIENT = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HospitalPatientImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HospitalPatientImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_HOSPITAL:
          serviceImpl.createHospital((com.avelios.grpc.library.CreateHospitalRequest) request,
              (io.grpc.stub.StreamObserver<com.avelios.grpc.library.CreateHospitalReply>) responseObserver);
          break;
        case METHODID_MODIFY_HOSPITAL:
          serviceImpl.modifyHospital((com.avelios.grpc.library.ModifyHospitalRequest) request,
              (io.grpc.stub.StreamObserver<com.avelios.grpc.library.ModifyHospitalReply>) responseObserver);
          break;
        case METHODID_DELETE_HOSPITAL:
          serviceImpl.deleteHospital((com.avelios.grpc.library.DeleteHospitalRequest) request,
              (io.grpc.stub.StreamObserver<com.avelios.grpc.library.DeleteHospitalReply>) responseObserver);
          break;
        case METHODID_LIST_HOSPITALS:
          serviceImpl.listHospitals((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.avelios.grpc.library.ListHospitalsReply>) responseObserver);
          break;
        case METHODID_CREATE_PATIENT:
          serviceImpl.createPatient((com.avelios.grpc.library.CreatePatientRequest) request,
              (io.grpc.stub.StreamObserver<com.avelios.grpc.library.CreatePatientReply>) responseObserver);
          break;
        case METHODID_MODIFY_PATIENT:
          serviceImpl.modifyPatient((com.avelios.grpc.library.ModifyPatientRequest) request,
              (io.grpc.stub.StreamObserver<com.avelios.grpc.library.ModifyPatientReply>) responseObserver);
          break;
        case METHODID_DELETE_PATIENT:
          serviceImpl.deletePatient((com.avelios.grpc.library.DeletePatientRequest) request,
              (io.grpc.stub.StreamObserver<com.avelios.grpc.library.DeletePatientReply>) responseObserver);
          break;
        case METHODID_LIST_PATIENTS:
          serviceImpl.listPatients((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.avelios.grpc.library.ListPatientsReply>) responseObserver);
          break;
        case METHODID_REGISTER_PATIENT:
          serviceImpl.registerPatient((com.avelios.grpc.library.RegisterPatientRequest) request,
              (io.grpc.stub.StreamObserver<com.avelios.grpc.library.RegisterPatientReply>) responseObserver);
          break;
        case METHODID_LIST_PATIENTS_OF_HOSPITAL:
          serviceImpl.listPatientsOfHospital((com.avelios.grpc.library.ListPatientsOfHospitalRequest) request,
              (io.grpc.stub.StreamObserver<com.avelios.grpc.library.ListPatientsOfHospitalReply>) responseObserver);
          break;
        case METHODID_LIST_HOSPITALS_OF_PATIENT:
          serviceImpl.listHospitalsOfPatient((com.avelios.grpc.library.ListHospitalsOfPatientRequest) request,
              (io.grpc.stub.StreamObserver<com.avelios.grpc.library.ListHospitalsOfPatientReply>) responseObserver);
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

  private static abstract class HospitalPatientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HospitalPatientBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.avelios.grpc.library.GrpcInterfaces.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HospitalPatient");
    }
  }

  private static final class HospitalPatientFileDescriptorSupplier
      extends HospitalPatientBaseDescriptorSupplier {
    HospitalPatientFileDescriptorSupplier() {}
  }

  private static final class HospitalPatientMethodDescriptorSupplier
      extends HospitalPatientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HospitalPatientMethodDescriptorSupplier(String methodName) {
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
      synchronized (HospitalPatientGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HospitalPatientFileDescriptorSupplier())
              .addMethod(getCreateHospitalMethod())
              .addMethod(getModifyHospitalMethod())
              .addMethod(getDeleteHospitalMethod())
              .addMethod(getListHospitalsMethod())
              .addMethod(getCreatePatientMethod())
              .addMethod(getModifyPatientMethod())
              .addMethod(getDeletePatientMethod())
              .addMethod(getListPatientsMethod())
              .addMethod(getRegisterPatientMethod())
              .addMethod(getListPatientsOfHospitalMethod())
              .addMethod(getListHospitalsOfPatientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
