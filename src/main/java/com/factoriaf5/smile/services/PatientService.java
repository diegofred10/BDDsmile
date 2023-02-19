package com.factoriaf5.smile.services;

import com.factoriaf5.smile.repositories.PatientRepository;

public class PatientService {
    private PatientRepository repository;

    public PatientService (PatientRepository repository) {
        this.repository = repository;
}
}