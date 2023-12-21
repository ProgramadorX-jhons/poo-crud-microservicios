package com.programadorXjhons.sistemaspringmicroservicios.entity;

import jakarta.persistence.*;

@Entity
public class Persona {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_persona")
    private Long idPersona;
    @Column(name="tipoPersona")
    private String tipoPersona;
    @Column(name="nombre")
    private String nombre;
    @Column(name="tipoDocumento")
    private String tipoDocumento;
    @Column(name="numDocumento")
    private String numDocumento;
    @Column(name="direccion")
    private String direccion;
    @Column(name="telefono")
    private String telefono;
    @Column(name="email")
    private String email;

    public Persona() {
    }

    //con parametros
    public Persona(Long idPersona, String tipoPersona, String nombre, String tipoDocumento, String numDocumento, String direccion, String telefono, String email) {
        this.idPersona = idPersona;
        this.tipoPersona = tipoPersona;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    //get y set
    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void actualizarPersona(Persona actual) {
    }
}
