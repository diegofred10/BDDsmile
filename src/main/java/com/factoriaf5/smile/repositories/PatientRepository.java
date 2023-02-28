package com.factoriaf5.smile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.factoriaf5.smile.models.Patient;


public interface PatientRepository extends JpaRepository<Patient,Long>{
    
}
