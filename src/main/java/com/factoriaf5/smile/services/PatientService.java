package com.factoriaf5.smile.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.factoriaf5.smile.models.Patient;
import com.factoriaf5.smile.repositories.PatientRepository;


@Service
public class PatientService {
    private PatientRepository repository;

    public PatientService(PatientRepository repository){
        this.repository = repository;
    }
    

    public List<Patient> getAll() {
        return repository.findAll();
    
}
}
