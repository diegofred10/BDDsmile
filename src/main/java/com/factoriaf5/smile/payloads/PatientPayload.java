package com.factoriaf5.smile.payloads;

import java.util.List;

import com.factoriaf5.smile.models.Profile;
import com.factoriaf5.smile.models.Treatment;

public class PatientPayload {
    private String dni;
    private Profile profile;
    private List <Treatment> treatment;


    public PatientPayload() {
    }


    public PatientPayload(String dni, Profile profile, List<Treatment> treatment) {
        this.dni = dni;
        this.profile = profile;
        this.treatment = treatment;
    }


    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }


    public Profile getProfile() {
        return profile;
    }


    public void setProfile(Profile profile) {
        this.profile = profile;
    }


    public List<Treatment> getTreatment() {
        return treatment;
    }


    public void setTreatment(List<Treatment> treatment) {
        this.treatment = treatment;
    }
    
    

    
}
