package com.springboot.management_event.model.entities;



import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType.*;



@Entity
@Table(name = "events")
public class Event extends AbstractEntity  {

    private String name;
    private Status status;
    @OneToOne
    @JoinColumn(name = "organizer_id",
            foreignKey = @ForeignKey(name = "event_organizer"))
    private Organizer organizer;
    private LocalDate StartDate;
    private LocalDate EndDate;
    private int maxSeats;
    private int remainingSeats;
    @OneToOne
    @JoinColumn(name="location_id",
            foreignKey = @ForeignKey(name = "event_location"))
    private Location location;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name="event_attendee",
            joinColumns= @JoinColumn(name="event_id"),
            foreignKey = @ForeignKey(name = "attendee_event"),
            inverseJoinColumns = @JoinColumn(name="attendee_id",
                    foreignKey = @ForeignKey(name = "event_attendee"))

    )
    private Set<Attendee> attendees= new HashSet<>();

    public void addAttendee(Attendee attendee){
        this.attendees.add(attendee);
        attendee.getEvents().add(this);
    }



    public void removeAttendee(Attendee attendee){
        this.attendees.remove(attendee);
        attendee.getEvents().remove(this);
    }



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "speaker_id",
            foreignKey = @ForeignKey(name = "event_speaker"))
    private Speaker speaker;



    public Event() {
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Set<Attendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(Set<Attendee> attendees) {
        this.attendees = attendees;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
}




