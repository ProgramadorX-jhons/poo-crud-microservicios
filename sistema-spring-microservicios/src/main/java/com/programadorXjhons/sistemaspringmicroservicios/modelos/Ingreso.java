package com.programadorXjhons.sistemaspringmicroservicios.modelos;

import java.util.Date;

public class Ingreso {

    private Long idIngreso;

    private String topoComprobante;

    private String numComprobante;

    private Date fechaHora;

    private Double impuesto;

    private  String estado;

    //contructor basio

    public Ingreso() {
    }

    public Long getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(Long idIngreso) {
        this.idIngreso = idIngreso;
    }

    public String getTopoComprobante() {
        return topoComprobante;
    }

    public void setTopoComprobante(String topoComprobante) {
        this.topoComprobante = topoComprobante;
    }

    public String getNumComprobante() {
        return numComprobante;
    }

    public void setNumComprobante(String numComprobante) {
        this.numComprobante = numComprobante;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
