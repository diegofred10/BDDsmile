package com.factoriaf5.smile.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factoriaf5.smile.models.Treatment;
import com.factoriaf5.smile.services.TreatmentService;

@RestController
@RequestMapping(path = "/api/profiles")
public class TreatmentController {
    private TreatmentService service;

    public TreatmentController(TreatmentService service){
        this.service = service;
    }
    
    @GetMapping(path = "")
    public List<Treatment>getAll(){
        return service.getAll();
    }
    
}
