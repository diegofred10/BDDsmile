package com.factoriaf5.smile.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factoriaf5.smile.models.Patient;
import com.factoriaf5.smile.services.PatientService;

@RestController
@RequestMapping
public class PatientController{
    private PatientService service;

    public PatientController(PatientService service){
        this.service = service;
        
    }
   
    @GetMapping(path = "")
    public List<Patient>getAll(){
        return service.getAll();
    }
    
}