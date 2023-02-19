package com.factoriaf5.smile.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factoriaf5.smile.models.Profile;
import com.factoriaf5.smile.services.ProfileService;

@RestController
@RequestMapping(path = "/api/profiles")
public class ProfileController {
    private ProfileService service;

    public ProfileController(ProfileService service){
        this.service = service;
    }
    
    @GetMapping(path = "")
    public List<Profile>getAll(){
        return service.getAll();
    }
    
}
