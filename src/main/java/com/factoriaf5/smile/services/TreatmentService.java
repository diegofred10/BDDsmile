package com.factoriaf5.smile.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.factoriaf5.smile.models.Treatment;
import com.factoriaf5.smile.repositories.TreatmentRepository;

@Service
public class TreatmentService {
    private TreatmentRepository repository;


    public TreatmentService(TreatmentRepository repository){
        this.repository = repository;
    }
    

    public List<Treatment> getAll() {
        return repository.findAll();
    
}
}