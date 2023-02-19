package com.factoriaf5.smile.models;

import javax.persistence.*;

@Entity
@Table(name = "treatments")
public class Treatment {

    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_treatment")
    Long id;
    private String treatmentType;


    public Treatment() {
    }

    

    public Treatment(Long id, String treatmentType) {
        this.id = id;
        this.treatmentType = treatmentType;
    }



    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getTreatmentType() {
        return treatmentType;
    }


    public void setTreatmentType(String treatmentType) {
        this.treatmentType = treatmentType;
    }

    



}
