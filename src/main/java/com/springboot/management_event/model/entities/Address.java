package com.springboot.management_event.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "addresses")

public class Address extends AbstractEntity{
    private String number;
    private String street;
    private int code;
    private String city;
    private String country;
    public Address() {
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
