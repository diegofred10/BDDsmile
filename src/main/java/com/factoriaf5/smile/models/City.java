package com.factoriaf5.smile.models;

import javax.persistence.*;

@Entity
@Table(name = "cities")
public class City {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name= "id_city")
    private Long id;
    private String name;

    public City(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    
    
}
