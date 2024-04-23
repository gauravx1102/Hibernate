package com.fulara;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {

    @Id
    private int id;
    private String name;
    private String city;
    private String email;



    public student(int id, String name, String city) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
        this.email = email;
    }

    public student() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.city+" "+this.email;

    }
}
