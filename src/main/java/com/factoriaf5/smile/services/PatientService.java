package com.factoriaf5.smile.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.factoriaf5.smile.models.Patient;
import com.factoriaf5.smile.models.Profile;
import com.factoriaf5.smile.payloads.PatientPayload;
import com.factoriaf5.smile.repositories.PatientRepository;


@Service
public class PatientService {
    private PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public List<Patient> getAll() {
        return repository.findAll();
    }

    public Patient getOne(String dni) {
        return repository.findByDni(dni);
    }

	public void save(PatientPayload patient) {
        Patient patientToAdd = new Patient(patient.getDni(),null, null,null);
        repository.save(patientToAdd);
	}

    public List<Patient> delete(String dni) {
        Patient patientToDelete = repository.findByDni(dni);
        repository.delete(patientToDelete);
        return repository.findAll();
    }

    // public void saveProfile(Profile profileToAdd, String dni) {
    //     Patient newPatientToAdd = new Patient(getDni())
    // }











}
