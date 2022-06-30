package com.avelios.grpc.server.service;

import com.avelios.grpc.library.HospitalPatientGrpc;

import com.avelios.grpc.library.CreateHospitalRequest;
import com.avelios.grpc.library.CreateHospitalReply;
import com.avelios.grpc.library.ModifyHospitalRequest;
import com.avelios.grpc.library.ModifyHospitalReply;
import com.avelios.grpc.library.DeleteHospitalRequest;
import com.avelios.grpc.library.DeleteHospitalReply;
import com.avelios.grpc.library.ListHospitalsReply;

import com.avelios.grpc.library.CreatePatientRequest;
import com.avelios.grpc.library.CreatePatientReply;
import com.avelios.grpc.library.ModifyPatientRequest;
import com.avelios.grpc.library.ModifyPatientReply;
import com.avelios.grpc.library.DeletePatientRequest;
import com.avelios.grpc.library.DeletePatientReply;
import com.avelios.grpc.library.ListPatientsReply;

import com.avelios.grpc.library.RegisterPatientRequest;
import com.avelios.grpc.library.RegisterPatientReply;
import com.avelios.grpc.library.ListPatientsOfHospitalRequest;
import com.avelios.grpc.library.ListPatientsOfHospitalReply;
import com.avelios.grpc.library.ListHospitalsOfPatientRequest;
import com.avelios.grpc.library.ListHospitalsOfPatientReply;

import com.avelios.grpc.server.dao.HospitalPatientRelationRepository;
import com.avelios.grpc.server.dao.HospitalRepository;
import com.avelios.grpc.server.dao.PatientRepository;
import com.avelios.grpc.server.entity.Hospital;
import com.avelios.grpc.server.entity.HospitalPatientRelation;
import com.avelios.grpc.server.entity.Patient;
import net.devh.boot.grpc.server.service.GrpcService;
import io.grpc.stub.StreamObserver;
import com.google.protobuf.Empty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@GrpcService
public class Service extends HospitalPatientGrpc.HospitalPatientImplBase {

    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private HospitalPatientRelationRepository hospitalPatientRelationRepository;

    @Override
    public void createHospital(CreateHospitalRequest request, StreamObserver<CreateHospitalReply> responseObserver) {
        Hospital hospital = new Hospital(
                0L,
                request.getHospital().getName(),
                request.getHospital().getAddress(),
                request.getHospital().getPatientCapacity());
        boolean success = true;
        try {
            hospital = hospitalRepository.save(hospital);
        } catch (Exception e) {
            success = false;
        } finally {
            CreateHospitalReply reply = CreateHospitalReply.newBuilder()
                    .setHospitalId(hospital.getId()).setSuccess(success).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
    }

    @Override
    @Transactional
    public void modifyHospital(ModifyHospitalRequest request, StreamObserver<ModifyHospitalReply> responseObserver) {
        Optional<Hospital> maybeHospital = hospitalRepository.findById(request.getHospital().getId());
        if (maybeHospital.isEmpty()) {
            responseObserver.onNext(ModifyHospitalReply.newBuilder().setSuccess(false).build());
            responseObserver.onCompleted();
            return;
        }
        Hospital hospital = maybeHospital.get();
        hospital.setName(request.getHospital().getName());
        hospital.setAddress(request.getHospital().getAddress());
        hospital.setPatientCapacity(request.getHospital().getPatientCapacity());
        boolean success = true;
        try {
            hospitalRepository.save(hospital);
        } catch (Exception e) {
            success = false;
        } finally {
            responseObserver.onNext(ModifyHospitalReply.newBuilder().setSuccess(success).build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void deleteHospital(DeleteHospitalRequest request, StreamObserver<DeleteHospitalReply> responseObserver) {
        boolean success = true;
        try {
            hospitalRepository.deleteById(request.getHospitalId());
        } catch (Exception e) {
            success = false;
        } finally {
            responseObserver.onNext(DeleteHospitalReply.newBuilder().setSuccess(success).build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void listHospitals(Empty request, StreamObserver<ListHospitalsReply> responseObserver) {
        List<Hospital> hospitals = hospitalRepository.findAll();
        // Convert the list of entity.Hospital's to a list of grpc.Hospital's.
        ListHospitalsReply.Builder replyBuilder = ListHospitalsReply.newBuilder();
        for (Hospital hospital : hospitals) {
            com.avelios.grpc.library.Hospital.Builder builder = com.avelios.grpc.library.Hospital.newBuilder();
            replyBuilder.addHospitals(
                    builder.setId(hospital.getId()).
                            setName(hospital.getName()).
                            setAddress(hospital.getAddress()).
                            setPatientCapacity(hospital.getPatientCapacity()).
                            build());
        }
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void createPatient(CreatePatientRequest request, StreamObserver<CreatePatientReply> responseObserver) {
        Patient patient = new Patient(
                0L,
                request.getPatient().getName(),
                request.getPatient().getAddress(),
                request.getPatient().getAge(),
                request.getPatient().getDiagnosis());
        boolean success = true;
        try {
            patient = patientRepository.save(patient);
        } catch (Exception e) {
            success = false;
        } finally {
            CreatePatientReply reply = CreatePatientReply.newBuilder()
                    .setPatientId(patient.getId()).setSuccess(success).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
    }

    @Override
    @Transactional
    public void modifyPatient(ModifyPatientRequest request, StreamObserver<ModifyPatientReply> responseObserver) {
        Optional<Patient> maybePatient = patientRepository.findById(request.getPatient().getId());
        if (maybePatient.isEmpty()) {
            responseObserver.onNext(ModifyPatientReply.newBuilder().setSuccess(false).build());
            responseObserver.onCompleted();
            return;
        }
        Patient patient = maybePatient.get();
        patient.setName(request.getPatient().getName());
        patient.setAddress(request.getPatient().getAddress());
        patient.setAge(request.getPatient().getAge());
        patient.setDiagnosis(request.getPatient().getDiagnosis());
        boolean success = true;
        try {
            patientRepository.save(patient);
        } catch (Exception e) {
            success = false;
        } finally {
            responseObserver.onNext(ModifyPatientReply.newBuilder().setSuccess(success).build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void deletePatient(DeletePatientRequest request, StreamObserver<DeletePatientReply> responseObserver) {
        boolean success = true;
        try {
            patientRepository.deleteById(request.getPatientId());
        } catch (Exception e) {
            success = false;
        } finally {
            responseObserver.onNext(DeletePatientReply.newBuilder().setSuccess(success).build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void listPatients(Empty request, StreamObserver<ListPatientsReply> responseObserver) {
        List<Patient> patients = patientRepository.findAll();
        // Convert the list of entity.Patient's to a list of grpc.Patient's.
        ListPatientsReply.Builder replyBuilder = ListPatientsReply.newBuilder();
        for (Patient patient : patients) {
            com.avelios.grpc.library.Patient.Builder builder = com.avelios.grpc.library.Patient.newBuilder();
            replyBuilder.addPatients(
                    builder.setId(patient.getId()).
                            setName(patient.getName()).
                            setAddress(patient.getAddress()).
                            setAge(patient.getAge()).
                            setDiagnosis(patient.getDiagnosis()).
                            build());
        }
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    @Transactional
    public void registerPatient(RegisterPatientRequest request, StreamObserver<RegisterPatientReply> responseObserver) {
        Optional<Hospital> maybeHospital = hospitalRepository.findById(request.getHospitalId());
        if (maybeHospital.isEmpty()) {
            responseObserver.onNext(RegisterPatientReply.newBuilder().setSuccess(false).build());
            responseObserver.onCompleted();
            return;
        }
        Hospital hospital = maybeHospital.get();
        // Get the count of current patients.
        Long patientCnt = patientRepository.countPatientsInHospital(hospital.getId());
        if (patientCnt >= hospital.getPatientCapacity()) {
            responseObserver.onNext(RegisterPatientReply.newBuilder().setSuccess(false).build());
            responseObserver.onCompleted();
            return;
        }

        Patient patient = new Patient();
        patient.setId(request.getPatientId());
        HospitalPatientRelation relation = new HospitalPatientRelation(hospital, patient);

        boolean success = true;
        try {
            hospitalPatientRelationRepository.save(relation);
        } catch (Exception e) {
            success = false;
        } finally {
            responseObserver.onNext(RegisterPatientReply.newBuilder().setSuccess(success).build());
            responseObserver.onCompleted();
        }
    }

    public void listPatientsOfHospital(ListPatientsOfHospitalRequest request,
                                       StreamObserver<ListPatientsOfHospitalReply> responseObserver) {
        List<Patient> patients = patientRepository.findPatientsInHospital(request.getHospitalId());
        // Convert the list of entity.Patient's to a list of grpc.Patient's.
        ListPatientsOfHospitalReply.Builder replyBuilder = ListPatientsOfHospitalReply.newBuilder();
        for (Patient patient : patients) {
            com.avelios.grpc.library.Patient.Builder builder = com.avelios.grpc.library.Patient.newBuilder();
            replyBuilder.addPatients(
                    builder.setId(patient.getId()).
                            setName(patient.getName()).
                            setAddress(patient.getAddress()).
                            setAge(patient.getAge()).
                            setDiagnosis(patient.getDiagnosis()).
                            build());
        }
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
    }

    public void listHospitalsOfPatient(ListHospitalsOfPatientRequest request,
                                       StreamObserver<ListHospitalsOfPatientReply> responseObserver) {
        List<Hospital> hospitals = hospitalRepository.findHospitalsOfPatient(request.getPatientId());
        // Convert the list of entity.Hospital's to a list of grpc.Hospital's.
        ListHospitalsOfPatientReply.Builder replyBuilder = ListHospitalsOfPatientReply.newBuilder();
        for (Hospital hospital : hospitals) {
            com.avelios.grpc.library.Hospital.Builder builder = com.avelios.grpc.library.Hospital.newBuilder();
            replyBuilder.addHospitals(
                    builder.setId(hospital.getId()).
                            setName(hospital.getName()).
                            setAddress(hospital.getAddress()).
                            setPatientCapacity(hospital.getPatientCapacity()).
                            build());
        }
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
    }

}
