package com.springboot.management_event.model.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "attendees")
public class Attendee extends AbstractEntity {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String email;
    private String companyName;
    @OneToOne
    @JoinColumn(name="account_id",
            foreignKey = @ForeignKey(name = "attendee_account"))
    private Account account;
    @OneToOne
    @JoinColumn(name="address_id",referencedColumnName="addressId",
            foreignKey = @ForeignKey(name = "attendee_address"))
    private Address address;

    @ManyToMany(mappedBy = "attendees")
    private Set<Event> events = new HashSet<>();
    public Attendee() {
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
