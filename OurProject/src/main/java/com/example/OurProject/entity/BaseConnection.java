package com.example.OurProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tableOFrc")
public class BaseConnection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    public BaseConnection(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public BaseConnection() {

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