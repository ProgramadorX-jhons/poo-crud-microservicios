package com.programdorXjhons.microservicioIngreso.service;

import com.programdorXjhons.microservicioIngreso.entity.Ingreso;
import com.programdorXjhons.microservicioIngreso.repository.IngresoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceIngreso {
    @Autowired
    private IngresoRepo repository;

    public List<Ingreso> listarIngreso() {
        return repository.findAll();
    }
    //metodo pra buscar
    public Ingreso obtenerIngresoPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
    //metodo para guardar
    public Ingreso guardarIngreso(Ingreso ingreso) {
        Ingreso nuevoIngreso = repository.save(ingreso);
        return nuevoIngreso;

    }
    //esto es va hacer buscarme todas las evntas de una persona
    public  List<Ingreso> obtenerIngresoId(Long personaId){
        return repository.buscarPorPersonaId(personaId);
    }



}
