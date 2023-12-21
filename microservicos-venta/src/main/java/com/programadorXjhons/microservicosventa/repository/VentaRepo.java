package com.programadorXjhons.microservicosventa.repository;

import com.programadorXjhons.microservicosventa.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VentaRepo extends JpaRepository<Venta , Long> {

    //lista de ventas se va llamar :
    List<Venta> buscarPorPersonaId(Long personaId);
}
