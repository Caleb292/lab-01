package com.example.petshop;

import java.util.Date;

public abstract class Pet {

    private String name;
    private Date birthDate;

    // Constructor 1 - only name as arg
    public Pet(String name) {
        this.name = name;
        this.birthDate = new Date();
    }

    // Constructor 2 - name and date args
    public Pet(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Getters and Setters for name and date
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    // Abstract classes have no functionality and must be overwritten
    public abstract String speak();
}
