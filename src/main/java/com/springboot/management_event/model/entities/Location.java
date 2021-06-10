package com.springboot.management_event.model.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "locations")
public class Location extends AbstractEntity {




    private String street;
    private String city;
    private int codePostal;
    private String country;
    private boolean verified;





    public Location() {
    }



    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
}
