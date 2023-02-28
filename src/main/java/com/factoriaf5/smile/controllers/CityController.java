package com.factoriaf5.smile.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factoriaf5.smile.models.City;
import com.factoriaf5.smile.services.CityService;

@RestController
@RequestMapping
public class CityController{
    private CityService service;

    public CityController(CityService service){
        this.service = service;
        
    }
   
    @GetMapping(path = "")
    public List<City>getAll(){
        return service.getAll();
    }
    
}


    

