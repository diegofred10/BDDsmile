package com.factoriaf5.smile.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factoriaf5.smile.models.Profile;
import com.factoriaf5.smile.payloads.PatientPayload;

@RestController
@RequestMapping(path = "/api/profiles")
public class ProfileController {
    @GetMapping(path = "")
    
public List<Profile>getAll(){
    return service.getAll();
    
}

@GetMapping(path = "/{id}")
public Profile getOne(@PathVariable String dni){
    return service.getOne(dni);
}

@PostMapping(path = "")
public void save(@RequestBody PatientPayload patient){
    service.save(patient);
}


// @PostMapping("/{dni}/profiles")
// public void saveProfile(@RequestBody Profile profileToAdd, @PathVariable String dni){
//     service.saveProfile(profileToAdd, dni);
// }


@DeleteMapping(path = "/{id}")
public List<Profile> delete(@PathVariable String dni){
    return service.delete(dni);
}



@PutMapping(path = "/{id}")
public ResponseEntity<Profile> update(@PathVariable String dni, @RequestBody PatientPayload patient){
    Profile patientTemporal = service.getOne(dni);

    try {
        if(patientTemporal !=null){
            patient.setDni(dni);
            service.save(patient);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    }
}
