package com.avelios.grpc.server.dao;

import com.avelios.grpc.server.entity.HospitalPatientRelation;
import com.avelios.grpc.server.entity.HospitalPatientRelationCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalPatientRelationRepository
        extends JpaRepository<HospitalPatientRelation, HospitalPatientRelationCompositeKey> {
}
