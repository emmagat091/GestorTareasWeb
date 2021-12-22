package com.AyiCapacitacion.session;

import com.AyiCapacitacion.entities.Estados;
import com.AyiCapacitacion.entities.Notas;
import com.AyiCapacitacion.entities.Temas;

import java.util.List;

import javax.ejb.Local;

@Local
public interface TareasSessionEJBLocal {

    Temas persistTemas(Temas temas);

    Temas mergeTemas(Temas temas);

    void removeTemas(Temas temas);

    List<Temas> getTemasFindAll();

    Notas persistNotas(Notas notas);

    Notas mergeNotas(Notas notas);

    void removeNotas(Notas notas);

    List<Notas> getNotasFindAll();

    Estados persistEstados(Estados estados);

    Estados mergeEstados(Estados estados);

    void removeEstados(Estados estados);

    List<Estados> getEstadosFindAll();
}
