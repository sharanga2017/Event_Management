package com.springboot.management_event.services;


import com.springboot.management_event.model.dtos.*;
import com.springboot.management_event.model.entities.*;
import com.springboot.management_event.model.entities.Organizer;
import com.springboot.management_event.repositories.EventRepository;
import com.springboot.management_event.repositories.LocationRepository;
import com.springboot.management_event.repositories.OrganizerRepository;
import com.springboot.management_event.repositories.SpeakerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    private final ModelMapper mapper;
    private final EventRepository events;
    private final OrganizerRepository organizers;
    private final LocationRepository locations;

    private final SpeakerRepository speakers;

    public EventServiceImpl(ModelMapper mapper,
                            EventRepository events,
                            OrganizerRepository organizers,
                            LocationRepository locations,
                            SpeakerRepository speakers) {
        this.mapper = mapper;
        this.events = events;
        this.organizers = organizers;
        this.locations = locations;
        this.speakers = speakers;
    }

    @Override
    public void create(EventCreate eventCreate) {
        Event event = new Event();
        event =  mapper.map(eventCreate, Event.class);
        OrganizerDTO organizerDTO = eventCreate.getOrganizerDTO();
        Organizer organizer = new Organizer();

        organizer =  mapper.map(organizerDTO, Organizer.class);
        organizers.save(organizer);


        Location location = new Location();
        LocationDTO locationDTO = eventCreate.getLocationDTO();
        location =  mapper.map(locationDTO, Location.class);
        locations.save(location);

        Speaker speaker = new Speaker();
        SpeakerDTO speakerDTO = eventCreate.getSpeakerDTO();
        speaker =  mapper.map(speakerDTO, Speaker.class);
        speakers.save(speaker);



        event.setOrganizer(organizer);
        event.setLocation(location);
        event.setSpeaker(speaker);
        events.save(event);


    }

    @Override
    public EventView getByName(String name) {


        return null;
    }



}
