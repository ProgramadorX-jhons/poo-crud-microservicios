package com.programdorXjhons.microservicioIngreso.controller;

import com.programdorXjhons.microservicioIngreso.entity.Ingreso;
import com.programdorXjhons.microservicioIngreso.service.ServiceIngreso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingreso")
public class IngresoController {

    @Autowired
    private ServiceIngreso service;

    @GetMapping
    /*
    indica que vamos indicar una lista personas
    ceramos una lista
    si personas no existe o esta vacia va retornar que no hay contenido
    si existe normal nos muestra
    */
    public ResponseEntity<List<Ingreso>> listarVentas() {
        List<Ingreso> ingreso = service.listarIngreso();
        if (ingreso.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(ingreso);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ingreso> obtenerIngresos(@PathVariable("id") Long id) {
        Ingreso ingreso = service.obtenerIngresoPorId(id);
        if (ingreso == null) {
            return ResponseEntity.notFound().build();//quiere decir que no encontro un recurso
        }
        return ResponseEntity.ok(ingreso);
    }

    //metodo para poder guadarlo
    @PostMapping()
    public ResponseEntity<Ingreso> guardarIngresos(@RequestBody Ingreso ingreso) {
        Ingreso nuevaVenta = service.guardarIngreso(ingreso);
        return ResponseEntity.ok(nuevaVenta);
    }

    /*obtine y si no obtien*/

    @GetMapping("/persona/{personaId}")
    public ResponseEntity<List<Ingreso>> listarVentasPorPerId(@PathVariable("personaId") Long id) {
        List<Ingreso> ingreso = service.obtenerIngresoId(id);
        if (ingreso.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(ingreso);
    }


}
