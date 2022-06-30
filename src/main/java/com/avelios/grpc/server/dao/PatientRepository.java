package com.avelios.grpc.server.dao;

import com.avelios.grpc.server.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    @Query(value = "SELECT COUNT(p.*) FROM PATIENT AS p INNER JOIN " +
            "(SELECT * FROM HOSPITAL_PATIENT_RELATION WHERE hospital_id = :hospital_id) AS hp " +
            "ON p.id = hp.patient_id", nativeQuery = true)
    Long countPatientsInHospital(@Param("hospital_id") Long hospitalId);

    @Query(value = "SELECT p.* FROM PATIENT AS p INNER JOIN " +
            "(SELECT * FROM HOSPITAL_PATIENT_RELATION WHERE hospital_id = :hospital_id) AS hp " +
            "ON p.id = hp.patient_id", nativeQuery = true)
    List<Patient> findPatientsInHospital(@Param("hospital_id") Long hospitalId);
}
