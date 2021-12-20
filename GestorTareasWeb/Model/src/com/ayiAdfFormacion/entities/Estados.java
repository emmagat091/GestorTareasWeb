package com.ayiAdfFormacion.entities;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries( { @NamedQuery(name = "Estados.findAll", query = "select o from Estados o") })
public class Estados implements Serializable {
    private String estado;
    @Id
    private BigDecimal sid;

    public Estados() {
    }

    public Estados(String estado, BigDecimal sid) {
        this.estado = estado;
        this.sid = sid;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getSid() {
        return sid;
    }

    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }
}
