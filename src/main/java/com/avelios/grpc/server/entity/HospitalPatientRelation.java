package com.avelios.grpc.server.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(HospitalPatientRelationCompositeKey.class)
@Table(name = "HOSPITAL_PATIENT_RELATION",
        indexes = {@Index(columnList = "hospital_id"), @Index(columnList = "patient_id")})
public class HospitalPatientRelation {
    @Id
    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;
    @Id
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
