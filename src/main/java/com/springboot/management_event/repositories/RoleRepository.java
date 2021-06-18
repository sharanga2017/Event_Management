package com.springboot.management_event.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.management_event.model.entities.Role;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    /**
     * Finds the default role. Does not return an {@code Optional} as we should
     * always have a default role in the data store.
     *
     * @return the default role; {@code null} if none found
     */
    Role findByByDefaultTrue();

    Optional<Role> findByCode(String code);
}