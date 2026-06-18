package com.example.OurProject.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "warehouse")
public class DistributionCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String city;
    private String adress;
    private Boolean isActive;
    private Date createdDate;


    public DistributionCenter(Long id, String name, String city, String adress, Date createdDate, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.adress = adress;
        this.createdDate = createdDate;
        this.isActive = isActive;
    }


    public DistributionCenter() {

    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}