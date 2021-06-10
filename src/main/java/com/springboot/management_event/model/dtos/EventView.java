package com.springboot.management_event.model.dtos;

import com.springboot.management_event.model.entities.Attendee;
import com.springboot.management_event.model.entities.Organizer;
import com.springboot.management_event.model.entities.Status;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class EventView {

    private String name;
    private Status status;

    private Organizer organizer;
    private LocalDate StartDate;
    private LocalDate EndDate;
    private int maxSeats;
    private int remainingSeats;

    private List<Attendee> attendees;

    public EventView() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getRemainingSeats() {
        return remainingSeats;
    }

    public void setRemainingSeats(int remainingSeats) {
        this.remainingSeats = remainingSeats;
    }

    public List<Attendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Attendee> attendees) {
        this.attendees = attendees;
    }
}
