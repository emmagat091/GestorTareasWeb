package com.ayiAdfFormacion.entities;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries( { @NamedQuery(name = "Notas.findAll", query = "select o from Notas o") })
public class Notas implements Serializable {
    private String fecha;
    @Column(name = "FK_TEMA")
    private BigDecimal fkTema;
    private String nota;
    @Id
    private BigDecimal sid;

    public Notas() {
    }

    public Notas(String fecha, BigDecimal fkTema, String nota, BigDecimal sid) {
        this.fecha = fecha;
        this.fkTema = fkTema;
        this.nota = nota;
        this.sid = sid;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getFkTema() {
        return fkTema;
    }

    public void setFkTema(BigDecimal fkTema) {
        this.fkTema = fkTema;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public BigDecimal getSid() {
        return sid;
    }

    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }
}
