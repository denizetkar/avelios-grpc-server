package com.avelios.grpc.server.entity;

import java.io.Serializable;

public class HospitalPatientRelationCompositeKey implements Serializable {
    private Long hospital;
    private Long patient;
}
