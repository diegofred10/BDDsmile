package com.factoriaf5.smile.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.factoriaf5.smile.models.Profile;
import com.factoriaf5.smile.payloads.ProfilePayload;
import com.factoriaf5.smile.repositories.ProfileRepository;
 @Service
public class ProfileService {
  
    private ProfileRepository repository;

    public ProfileService(ProfileRepository repository) {
        this.repository = repository;
    }

    
    }











