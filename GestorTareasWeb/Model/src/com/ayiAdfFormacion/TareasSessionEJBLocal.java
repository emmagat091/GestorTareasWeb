package com.ayiAdfFormacion;

import com.ayiAdfFormacion.entities.Estados;
import com.ayiAdfFormacion.entities.Notas;
import com.ayiAdfFormacion.entities.Temas;

import java.util.List;

import javax.ejb.Local;

@Local
public interface TareasSessionEJBLocal {
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    Temas persistTemas(Temas temas);

    Temas mergeTemas(Temas temas);

    void removeTemas(Temas temas);

    List<Temas> getTemasFindAll();

    Estados persistEstados(Estados estados);

    Estados mergeEstados(Estados estados);

    void removeEstados(Estados estados);

    List<Estados> getEstadosFindAll();

    Notas persistNotas(Notas notas);

    Notas mergeNotas(Notas notas);

    void removeNotas(Notas notas);

    List<Notas> getNotasFindAll();
}
