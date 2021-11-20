package com.pontescr.projectbootcamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pontescr.projectbootcamp.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
