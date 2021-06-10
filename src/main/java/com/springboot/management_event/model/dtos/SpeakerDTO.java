package com.springboot.management_event.model.dtos;

import com.springboot.management_event.model.entities.Event;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

public class SpeakerDTO {


    private String firstName;
    private String lastName;
    private List<Event> event;
    private String email;
    private String phone;
    private String company;

    public SpeakerDTO() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Event> getEvent() {
        return event;
    }

    public void setEvent(List<Event> event) {
        this.event = event;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
