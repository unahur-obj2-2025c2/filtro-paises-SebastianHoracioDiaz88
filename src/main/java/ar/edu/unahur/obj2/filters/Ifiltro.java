package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public interface Ifiltro {
    
    Boolean aplicar(Pais pais);

    Ifiltro and (Ifiltro filtro);

    Ifiltro or(Ifiltro filtro);
}