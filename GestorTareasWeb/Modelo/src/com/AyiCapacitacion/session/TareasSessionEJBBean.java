package com.AyiCapacitacion.session;


import com.AyiCapacitacion.entities.Estados;
import com.AyiCapacitacion.entities.Notas;
import com.AyiCapacitacion.entities.Temas;

import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless(name = "TareasSessionEJB", mappedName = "GestorTareasWeb-Modelo-TareasSessionEJB")
public class TareasSessionEJBBean implements TareasSessionEJB, TareasSessionEJBLocal {
    @Resource
    SessionContext sessionContext;
    @PersistenceContext(unitName = "persistenceUnit")
    private EntityManager em;

    public TareasSessionEJBBean() {
    }


    public Temas persistTemas(Temas temas) {
        em.persist(temas);
        return temas;
    }

    public Temas mergeTemas(Temas temas) {
        return em.merge(temas);
    }

    public void removeTemas(Temas temas) {
        temas = em.find(Temas.class, temas.getSid());
        em.remove(temas);
    }

    /** <code>select o from Temas o</code> */
    public List<Temas> getTemasFindAll() {
        return em.createNamedQuery("Temas.findAll").getResultList();
    }

    public Notas persistNotas(Notas notas) {
        em.persist(notas);
        return notas;
    }

    public Notas mergeNotas(Notas notas) {
        return em.merge(notas);
    }

    public void removeNotas(Notas notas) {
        notas = em.find(Notas.class, notas.getSid());
        em.remove(notas);
    }

    /** <code>select o from Notas o</code> */
    public List<Notas> getNotasFindAll() {
        return em.createNamedQuery("Notas.findAll").getResultList();
    }

    public Estados persistEstados(Estados estados) {
        em.persist(estados);
        return estados;
    }

    public Estados mergeEstados(Estados estados) {
        return em.merge(estados);
    }

    public void removeEstados(Estados estados) {
        estados = em.find(Estados.class, estados.getSid());
        em.remove(estados);
    }

    /** <code>select o from Estados o</code> */
    public List<Estados> getEstadosFindAll() {
        return em.createNamedQuery("Estados.findAll").getResultList();
    }
}
