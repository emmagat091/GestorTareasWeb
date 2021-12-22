package com.AyiCapacitacion.entities;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

@Entity
@NamedQueries( { @NamedQuery(name = "Estados.findAll", query = "select o from Estados o") })
public class Estados implements Serializable {
    @SuppressWarnings("compatibility:7649271232412655890")
    private static final long serialVersionUID = 1L;
    private String estado;
    @Id
    //insercion de código, pág 35, ver que cambios realiar en cuanto al name y sequenceName
    // es probable, que se deba comentar generatedValue y sequencegenerator.
    @GeneratedValue(strategy=GenerationType.SEQUENCE,
    generator="SEQ_ESTADOS")
    @SequenceGenerator(name="seqEstados",sequenceName="SEQ_ESTADOS",
    allocationSize=1)         
    
        
        
    private BigDecimal sid;
    @OneToMany(mappedBy = "estados")
    private List<Temas> temasList;

    public Estados() {
    }

    /**
     * @param estado
     * @param sid
     */
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

    public List<Temas> getTemasList() {
        return temasList;
    }

    public void setTemasList(List<Temas> temasList) {
        this.temasList = temasList;
    }

    public Temas addTemas(Temas temas) {
        getTemasList().add(temas);
        temas.setEstados(this);
        return temas;
    }

    public Temas removeTemas(Temas temas) {
        getTemasList().remove(temas);
        temas.setEstados(null);
        return temas;
    }
}
