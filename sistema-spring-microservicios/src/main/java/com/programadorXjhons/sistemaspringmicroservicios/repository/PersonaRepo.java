package com.programadorXjhons.sistemaspringmicroservicios.repository;

import com.programadorXjhons.sistemaspringmicroservicios.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepo extends JpaRepository<Persona, Long> {



}
