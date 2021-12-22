package com.AyiCapacitacion.entities;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@NamedQueries( { @NamedQuery(name = "Temas.findAll", query = "select o from Temas o") })
public class Temas implements Serializable {
    @SuppressWarnings("compatibility:5429730932258348848")
    private static final long serialVersionUID = 1L;
    private String descripcion;
    private String incidencias;
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,
    generator="SEQ_TEMAS")
    @SequenceGenerator(name="seqTemas",sequenceName="SEQ_TEMAS",
    allocationSize=1)   
    
    private BigDecimal sid;
    private String tema;
    @OneToMany(mappedBy = "temas")
    private List<Notas> notasList;
    @ManyToOne
    @JoinColumn(name = "FK_ESTADO")
    private Estados estados;

    public Temas() {
    }

    /**
     * @param descripcion
     * @param estados
     * @param incidencias
     * @param sid
     * @param tema
     */
    public Temas(String descripcion, Estados estados, String incidencias, BigDecimal sid, String tema) {
        this.descripcion = descripcion;
        this.estados = estados;
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

    public List<Notas> getNotasList() {
        return notasList;
    }

    public void setNotasList(List<Notas> notasList) {
        this.notasList = notasList;
    }

    public Notas addNotas(Notas notas) {
        getNotasList().add(notas);
        notas.setTemas(this);
        return notas;
    }

    public Notas removeNotas(Notas notas) {
        getNotasList().remove(notas);
        notas.setTemas(null);
        return notas;
    }

    public Estados getEstados() {
        return estados;
    }

    public void setEstados(Estados estados) {
        this.estados = estados;
    }
}
