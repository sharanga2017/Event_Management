package com.springboot.management_event.repositories;

import com.springboot.management_event.model.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
