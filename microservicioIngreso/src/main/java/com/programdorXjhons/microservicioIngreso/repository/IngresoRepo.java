package com.programdorXjhons.microservicioIngreso.repository;

import com.programdorXjhons.microservicioIngreso.entity.Ingreso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IngresoRepo extends JpaRepository<Ingreso, Long > {

    List<Ingreso> buscarPorPersonaId(Long personaId);
}
