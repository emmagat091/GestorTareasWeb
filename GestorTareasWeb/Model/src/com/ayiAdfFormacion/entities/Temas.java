package com.ayiAdfFormacion.entities;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries( { @NamedQuery(name = "Temas.findAll", query = "select o from Temas o") })
public class Temas implements Serializable {
    private String descripcion;
    @Column(name = "FK_ESTADO")
    private BigDecimal fkEstado;
    private String incidencias;
    @Id
    private BigDecimal sid;
    private String tema;

    public Temas() {
    }

    public Temas(String descripcion, BigDecimal fkEstado, String incidencias, BigDecimal sid, String tema) {
        this.descripcion = descripcion;
        this.fkEstado = fkEstado;
        this.incidencias = incidencias;
        this.sid = sid;
        this.tema = tema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getFkEstado() {
        return fkEstado;
    }

    public void setFkEstado(BigDecimal fkEstado) {
        this.fkEstado = fkEstado;
    }

    public String getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(String incidencias) {
        this.incidencias = incidencias;
    }

    public BigDecimal getSid() {
        return sid;
    }

    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
