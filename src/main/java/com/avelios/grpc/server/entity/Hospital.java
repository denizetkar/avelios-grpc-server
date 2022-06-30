package com.avelios.grpc.server.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HOSPITAL", uniqueConstraints = {@UniqueConstraint(columnNames = {"name", "address"})})
public class Hospital {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false, name = "patient_capacity")
    private Integer patientCapacity;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getPatientCapacity() {
        return patientCapacity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPatientCapacity(Integer patientCapacity) {
        this.patientCapacity = patientCapacity;
    }
}
