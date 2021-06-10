package com.springboot.management_event.repositories;

import com.springboot.management_event.model.entities.Event;
import com.springboot.management_event.model.entities.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizerRepository extends JpaRepository<Organizer, Long>  {
}
