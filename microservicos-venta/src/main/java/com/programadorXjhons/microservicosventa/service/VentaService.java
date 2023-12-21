package com.programadorXjhons.microservicosventa.service;

import com.programadorXjhons.microservicosventa.entity.Venta;
import com.programadorXjhons.microservicosventa.repository.VentaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {

    //inyectamos
    @Autowired
    private VentaRepo repository;

    public List<Venta> listarVenta() {
        return repository.findAll();
    }
    //metodo pra buscar
    public Venta obtenerVentaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
    //metodo para guardar
    public Venta guardarPersona(Venta venta) {
        Venta nuevaVenta=repository.save(venta);
        return nuevaVenta;

    }
    //esto es va hacer buscarme todas las evntas de una persona
    public  List<Venta> obtenerPersonaId(Long personaId){
        return repository.buscarPorPersonaId(personaId);
    }
}
