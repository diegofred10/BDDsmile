package com.factoriaf5.smile.models;

import javax.persistence.*;

@Entity
@Table(name = "profiles")
public class Profile {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name= "id_profile")
    Long id;
    
    private String dni;
    private String name;
    private String lastname;
    private int age;
    private String address;
    private String city;


    public Profile() {
    }


    public Profile(Long id, String dni, String name, String lastname, int age, String address, String city) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
        this.city = city;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getLastname() {
        return lastname;
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    

}
