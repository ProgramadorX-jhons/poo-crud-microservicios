package com.programadorXjhons.microservicosventa.controller;

import com.programadorXjhons.microservicosventa.entity.Venta;
import com.programadorXjhons.microservicosventa.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    private VentaService service;

    @GetMapping
    /*
    indica que vamos indicar una lista personas
    ceramos una lista
    si personas no existe o esta vacia va retornar que no hay contenido
    si existe normal nos muestra
    */
    public ResponseEntity<List<Venta>> listarVentas() {
        List<Venta> ventas = service.listarVenta();
        if (ventas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(ventas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Venta> obtenerVentas(@PathVariable("id") Long id) {
        Venta ventas = service.obtenerVentaPorId(id);
        if (ventas == null) {
            return ResponseEntity.notFound().build();//quiere decir que no encontro un recurso
        }
        return ResponseEntity.ok(ventas);
    }

    //metodo para poder guadarlo
    @PostMapping()
    public ResponseEntity<Venta> guardarVentas(@RequestBody Venta venta) {
        Venta nuevaVenta = service.guardarPersona(venta);
        return ResponseEntity.ok(nuevaVenta);
    }

    /*obtine y si no obtien*/

    @GetMapping("/persona/{personaId}")
    public ResponseEntity<List<Venta>> listarVentasPorPersonaId(@PathVariable("personaId") Long id) {
        List<Venta> ventas = service.obtenerPersonaId(id);
        if (ventas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(ventas);
    }
}
