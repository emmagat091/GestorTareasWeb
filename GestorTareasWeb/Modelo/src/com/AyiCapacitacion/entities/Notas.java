package com.AyiCapacitacion.entities;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@NamedQueries( { @NamedQuery(name = "Notas.findAll", query = "select o from Notas o") })
public class Notas implements Serializable {
    @SuppressWarnings("compatibility:-6573493685807962814")
    private static final long serialVersionUID = 1L;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private String nota;
    @Id  
    //insercion de código, pág 35, ver que cambios realiar en cuanto al name y sequenceName
    // es probable, que se deba comentar generatedValue y sequencegenerator.
    @GeneratedValue(strategy=GenerationType.SEQUENCE,
    generator="SEQ_NOTAS")
    @SequenceGenerator(name="seqNotas",sequenceName="SEQ_NOTAS",
    allocationSize=1)
        
    private BigDecimal sid;
    
    @ManyToOne
    @JoinColumn(name = "FK_TEMA")
    private Temas temas;

    public Notas() {
    }

    public Notas(Date fecha, Temas temas, String nota, BigDecimal sid) {
        this.fecha = fecha;
        this.temas = temas;
        this.nota = nota;
        this.sid = sid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public Temas getTemas() {
        return temas;
    }

    public void setTemas(Temas temas) {
        this.temas = temas;
    }
}
