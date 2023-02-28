package com.factoriaf5.smile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.factoriaf5.smile.models.Treatment;

public interface TreatmentRepository extends JpaRepository<Treatment,Long>{
    
}
