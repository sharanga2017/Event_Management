package com.springboot.management_event.repositories;

import com.springboot.management_event.model.entities.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
