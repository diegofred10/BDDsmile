package com.factoriaf5.smile.models;

import javax.persistence.*;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    private int dniNumber;

    private String name;
    private int idProfile;

    public Patient() {
    }

    public Patient(int dniNumber, String name, int idProfile) {
        this.dniNumber = dniNumber;
        this.name = name;
        this.idProfile = idProfile;
    }

    public int getDniNumber() {
        return dniNumber;
    }

    public void setDniNumber(int dniNumber) {
        this.dniNumber = dniNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(int idProfile) {
        this.idProfile = idProfile;
    }

}
