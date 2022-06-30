// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc-interfaces.proto

package com.avelios.grpc.library;

public final class GrpcInterfaces {
  private GrpcInterfaces() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Hospital_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Hospital_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Patient_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Patient_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateHospitalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateHospitalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateHospitalReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateHospitalReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ModifyHospitalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ModifyHospitalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ModifyHospitalReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ModifyHospitalReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteHospitalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteHospitalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteHospitalReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteHospitalReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ListHospitalsReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ListHospitalsReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreatePatientRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreatePatientRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreatePatientReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreatePatientReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ModifyPatientRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ModifyPatientRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ModifyPatientReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ModifyPatientReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeletePatientRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeletePatientRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeletePatientReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeletePatientReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ListPatientsReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ListPatientsReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RegisterPatientRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RegisterPatientRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RegisterPatientReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RegisterPatientReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ListPatientsOfHospitalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ListPatientsOfHospitalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ListPatientsOfHospitalReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ListPatientsOfHospitalReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ListHospitalsOfPatientRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ListHospitalsOfPatientRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ListHospitalsOfPatientReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ListHospitalsOfPatientReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025grpc-interfaces.proto\032\033google/protobuf" +
      "/empty.proto\"O\n\010Hospital\022\n\n\002id\030\001 \001(\003\022\014\n\004" +
      "name\030\002 \001(\t\022\017\n\007address\030\003 \001(\t\022\030\n\020patient_c" +
      "apacity\030\004 \001(\005\"T\n\007Patient\022\n\n\002id\030\001 \001(\003\022\014\n\004" +
      "name\030\002 \001(\t\022\017\n\007address\030\003 \001(\t\022\013\n\003age\030\004 \001(\005" +
      "\022\021\n\tdiagnosis\030\005 \001(\t\"4\n\025CreateHospitalReq" +
      "uest\022\033\n\010hospital\030\001 \001(\0132\t.Hospital\";\n\023Cre" +
      "ateHospitalReply\022\023\n\013hospital_id\030\001 \001(\003\022\017\n" +
      "\007success\030\002 \001(\010\"4\n\025ModifyHospitalRequest\022" +
      "\033\n\010hospital\030\001 \001(\0132\t.Hospital\"&\n\023ModifyHo" +
      "spitalReply\022\017\n\007success\030\001 \001(\010\",\n\025DeleteHo" +
      "spitalRequest\022\023\n\013hospital_id\030\001 \001(\003\"&\n\023De" +
      "leteHospitalReply\022\017\n\007success\030\001 \001(\010\"2\n\022Li" +
      "stHospitalsReply\022\034\n\thospitals\030\001 \003(\0132\t.Ho" +
      "spital\"1\n\024CreatePatientRequest\022\031\n\007patien" +
      "t\030\001 \001(\0132\010.Patient\"9\n\022CreatePatientReply\022" +
      "\022\n\npatient_id\030\001 \001(\003\022\017\n\007success\030\002 \001(\010\"1\n\024" +
      "ModifyPatientRequest\022\031\n\007patient\030\001 \001(\0132\010." +
      "Patient\"%\n\022ModifyPatientReply\022\017\n\007success" +
      "\030\001 \001(\010\"*\n\024DeletePatientRequest\022\022\n\npatien" +
      "t_id\030\001 \001(\003\"%\n\022DeletePatientReply\022\017\n\007succ" +
      "ess\030\001 \001(\010\"/\n\021ListPatientsReply\022\032\n\010patien" +
      "ts\030\001 \003(\0132\010.Patient\"A\n\026RegisterPatientReq" +
      "uest\022\022\n\npatient_id\030\001 \001(\003\022\023\n\013hospital_id\030" +
      "\002 \001(\003\"\'\n\024RegisterPatientReply\022\017\n\007success" +
      "\030\001 \001(\010\"4\n\035ListPatientsOfHospitalRequest\022" +
      "\023\n\013hospital_id\030\001 \001(\003\"9\n\033ListPatientsOfHo" +
      "spitalReply\022\032\n\010patients\030\001 \003(\0132\010.Patient\"" +
      "3\n\035ListHospitalsOfPatientRequest\022\022\n\npati" +
      "ent_id\030\001 \001(\003\";\n\033ListHospitalsOfPatientRe" +
      "ply\022\034\n\thospitals\030\001 \003(\0132\t.Hospital2\365\005\n\017Ho" +
      "spitalPatient\022>\n\016CreateHospital\022\026.Create" +
      "HospitalRequest\032\024.CreateHospitalReply\022>\n" +
      "\016ModifyHospital\022\026.ModifyHospitalRequest\032" +
      "\024.ModifyHospitalReply\022>\n\016DeleteHospital\022" +
      "\026.DeleteHospitalRequest\032\024.DeleteHospital" +
      "Reply\022<\n\rListHospitals\022\026.google.protobuf" +
      ".Empty\032\023.ListHospitalsReply\022;\n\rCreatePat" +
      "ient\022\025.CreatePatientRequest\032\023.CreatePati" +
      "entReply\022;\n\rModifyPatient\022\025.ModifyPatien" +
      "tRequest\032\023.ModifyPatientReply\022;\n\rDeleteP" +
      "atient\022\025.DeletePatientRequest\032\023.DeletePa" +
      "tientReply\022:\n\014ListPatients\022\026.google.prot" +
      "obuf.Empty\032\022.ListPatientsReply\022A\n\017Regist" +
      "erPatient\022\027.RegisterPatientRequest\032\025.Reg" +
      "isterPatientReply\022V\n\026ListPatientsOfHospi" +
      "tal\022\036.ListPatientsOfHospitalRequest\032\034.Li" +
      "stPatientsOfHospitalReply\022V\n\026ListHospita" +
      "lsOfPatient\022\036.ListHospitalsOfPatientRequ" +
      "est\032\034.ListHospitalsOfPatientReplyB,\n\030com" +
      ".avelios.grpc.libraryB\016GrpcInterfacesP\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_Hospital_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Hospital_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Hospital_descriptor,
        new java.lang.String[] { "Id", "Name", "Address", "PatientCapacity", });
    internal_static_Patient_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Patient_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Patient_descriptor,
        new java.lang.String[] { "Id", "Name", "Address", "Age", "Diagnosis", });
    internal_static_CreateHospitalRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_CreateHospitalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateHospitalRequest_descriptor,
        new java.lang.String[] { "Hospital", });
    internal_static_CreateHospitalReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_CreateHospitalReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateHospitalReply_descriptor,
        new java.lang.String[] { "HospitalId", "Success", });
    internal_static_ModifyHospitalRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ModifyHospitalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ModifyHospitalRequest_descriptor,
        new java.lang.String[] { "Hospital", });
    internal_static_ModifyHospitalReply_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ModifyHospitalReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ModifyHospitalReply_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_DeleteHospitalRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_DeleteHospitalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteHospitalRequest_descriptor,
        new java.lang.String[] { "HospitalId", });
    internal_static_DeleteHospitalReply_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_DeleteHospitalReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteHospitalReply_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_ListHospitalsReply_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_ListHospitalsReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ListHospitalsReply_descriptor,
        new java.lang.String[] { "Hospitals", });
    internal_static_CreatePatientRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_CreatePatientRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreatePatientRequest_descriptor,
        new java.lang.String[] { "Patient", });
    internal_static_CreatePatientReply_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_CreatePatientReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreatePatientReply_descriptor,
        new java.lang.String[] { "PatientId", "Success", });
    internal_static_ModifyPatientRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_ModifyPatientRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ModifyPatientRequest_descriptor,
        new java.lang.String[] { "Patient", });
    internal_static_ModifyPatientReply_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_ModifyPatientReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ModifyPatientReply_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_DeletePatientRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_DeletePatientRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeletePatientRequest_descriptor,
        new java.lang.String[] { "PatientId", });
    internal_static_DeletePatientReply_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_DeletePatientReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeletePatientReply_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_ListPatientsReply_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_ListPatientsReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ListPatientsReply_descriptor,
        new java.lang.String[] { "Patients", });
    internal_static_RegisterPatientRequest_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_RegisterPatientRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RegisterPatientRequest_descriptor,
        new java.lang.String[] { "PatientId", "HospitalId", });
    internal_static_RegisterPatientReply_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_RegisterPatientReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RegisterPatientReply_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_ListPatientsOfHospitalRequest_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_ListPatientsOfHospitalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ListPatientsOfHospitalRequest_descriptor,
        new java.lang.String[] { "HospitalId", });
    internal_static_ListPatientsOfHospitalReply_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_ListPatientsOfHospitalReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ListPatientsOfHospitalReply_descriptor,
        new java.lang.String[] { "Patients", });
    internal_static_ListHospitalsOfPatientRequest_descriptor =
      getDescriptor().getMessageTypes().get(20);
    internal_static_ListHospitalsOfPatientRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ListHospitalsOfPatientRequest_descriptor,
        new java.lang.String[] { "PatientId", });
    internal_static_ListHospitalsOfPatientReply_descriptor =
      getDescriptor().getMessageTypes().get(21);
    internal_static_ListHospitalsOfPatientReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ListHospitalsOfPatientReply_descriptor,
        new java.lang.String[] { "Hospitals", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}