package com.programadorXjhons.sistemaspringmicroservicios.controller;

import com.programadorXjhons.sistemaspringmicroservicios.entity.Persona;
import com.programadorXjhons.sistemaspringmicroservicios.modelos.Ingreso;
import com.programadorXjhons.sistemaspringmicroservicios.modelos.Venta;
import com.programadorXjhons.sistemaspringmicroservicios.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    //metodo de inyeciones
    @Autowired
    private PersonaService service;

    @GetMapping
    //indica que vamos indicar una lista personas
    public ResponseEntity<List<Persona>> listarPersonas(){
        //ceramos una lista
    List<Persona>  personas = service.listarPersona();
    //si personas no existe o esta vacia va retornar que no hay contenido
        if(personas.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        //si existe normal nos muestra
        return  ResponseEntity.ok(personas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> obtenerPersona(@PathVariable("id")Long id){
        Persona persona = service.obtenerPersonaPorId(id);
        if (persona == null){
            return ResponseEntity.notFound().build();//quiere decir que no encontro un recurso
        }
        return ResponseEntity.ok(persona);
    }

    //metodo para poder guadarlo
    @PostMapping()
    public ResponseEntity<Persona> guardarPersona(@RequestBody Persona persona){
        Persona nuevaPersona = service.guardarPersona(persona);
        return ResponseEntity.ok(nuevaPersona);
    }

    /*
    *son metodos que podremos controlar deade la clase padre
    *
    */
    @GetMapping("ventas/{personaId}")
    public  ResponseEntity<List<Venta>> listarVentas(@PathVariable("personaId")Long id){
        Persona persona = service.obtenerPersonaPorId(id);
        if(persona == null){
            return ResponseEntity.notFound().build();
        }
        List<Venta> ventas = service.getVenta(id);
        return ResponseEntity.ok(ventas);
    }
    @GetMapping("ingreso/{personaId}")
    public  ResponseEntity<List<Ingreso>> listarIngreso(@PathVariable("personaId")Long id){
        Persona persona = service.obtenerPersonaPorId(id);
        if(persona == null){
            return ResponseEntity.notFound().build();
        }
        List<Ingreso> ingresos = service.getIngreso(id);
        return ResponseEntity.ok(ingresos);
    }




}
