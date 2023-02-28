package com.factoriaf5.smile.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.factoriaf5.smile.models.City;

import com.factoriaf5.smile.repositories.CityRepository;



@Service
public class CityService {
    private CityRepository repository;

    public CityService(CityRepository repository){
        this.repository = repository;
    }
    

    public List<City> getAll() {
        return repository.findAll();
    
}
}