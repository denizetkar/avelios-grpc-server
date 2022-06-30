package com.avelios.grpc.server.dao;

import com.avelios.grpc.server.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
    @Query(value = "SELECT h.* FROM HOSPITAL AS h INNER JOIN " +
            "(SELECT * FROM HOSPITAL_PATIENT_RELATION WHERE patient_id = :patient_id) AS hp " +
            "ON h.id = hp.hospital_id", nativeQuery = true)
    List<Hospital> findHospitalsOfPatient(@Param("patient_id") Long patientId);
}
