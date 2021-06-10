package com.springboot.management_event.controllers;


import com.springboot.management_event.model.dtos.EventCreate;
import com.springboot.management_event.model.dtos.EventView;
import com.springboot.management_event.services.EventService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventService service;
    public EventController(EventService service)
    {
        this.service = service;
    }

    @GetMapping("/{name}")
    public EventView getByName(@PathVariable("name") String name)
    {
        return service.getByName(name);
    }

    @PostMapping("/add")
    public void create( @RequestBody EventCreate event) {
        service.create(event);
    }

}
