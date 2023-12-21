package com.programadorXjhons.sistemaspringmicroservicios.service;

import com.programadorXjhons.sistemaspringmicroservicios.entity.Persona;
import com.programadorXjhons.sistemaspringmicroservicios.modelos.Ingreso;
import com.programadorXjhons.sistemaspringmicroservicios.modelos.Venta;
import com.programadorXjhons.sistemaspringmicroservicios.repository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    private RestTemplate restTemplate;

    //este metodo lo qeu acen esque  se inyectan con los microservicios y llama el puerto para poder ingresar
    //estes motods ya estan comunicando  un microservicio con sus 2 microservicios
    public List<Venta> getVenta(Long personaId){
        List<Venta> ventas = restTemplate.getForObject("http://localhost:8001/venta/persona/"+ personaId, List.class);
        return ventas;
    }
    public List<Ingreso> getIngreso(Long personaId){
        List<Ingreso> ingresos = restTemplate.getForObject("http://localhost:8002/ingreso/persona/"+ personaId, List.class);
        return ingresos;
    }
    //inyectamos la dependencias
    @Autowired
    private PersonaRepo repository;
    //listar persona
    public List<Persona> listarPersona() {
        return repository.findAll();
    }
    //metodo pra buscar
    public Persona obtenerPersonaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
    //metodo para guardar
    public Persona guardarPersona(Persona persona) {
        Persona nuevaPersona=repository.save(persona);
        return nuevaPersona;

    }
    //metodo para eliminar
    public void eliminarPersona(Long id) {
        repository.deleteById(id);
    }


}
