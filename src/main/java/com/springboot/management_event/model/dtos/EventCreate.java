package com.springboot.management_event.model.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.springboot.management_event.model.entities.Location;
import com.springboot.management_event.model.entities.Organizer;
import com.springboot.management_event.model.entities.Status;

import java.time.LocalDate;

public class EventCreate {

    private String name;
    private Status status;

    private OrganizerDTO organizerDTO;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate StartDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate EndDate;
    private int maxSeats;
    private int remainingSeats;
    private LocationDTO locationDTO;
    private SpeakerDTO speakerDTO;

    public SpeakerDTO getSpeakerDTO() {
        return speakerDTO;
    }

    public void setSpeakerDTO(SpeakerDTO speakerDTO) {
        this.speakerDTO = speakerDTO;
    }

    public LocationDTO getLocationDTO() {
        return locationDTO;
    }

    public void setLocationDTO(LocationDTO locationDTO) {
        this.locationDTO = locationDTO;
    }

    public EventCreate() {
    }


    public OrganizerDTO getOrganizerDTO() {
        return organizerDTO;
    }

    public void setOrganizerDTO(OrganizerDTO organizerDTO) {
        this.organizerDTO = organizerDTO;
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
}
