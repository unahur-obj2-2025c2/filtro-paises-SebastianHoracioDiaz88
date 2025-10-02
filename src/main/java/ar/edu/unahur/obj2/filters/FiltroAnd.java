package ar.edu.unahur.obj2.filters;

import java.util.List;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroAnd extends FiltroCompuesto {

    public FiltroAnd(Ifiltro filtro, Ifiltro nuevo){
        filtros.add(filtro);
        filtros.add(nuevo);
    }

    public FiltroAnd(List<Ifiltro> filtrosNuevos){
        filtros.addAll(filtrosNuevos);
    }

    @Override
    public Boolean aplicar(Pais pais) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aplicar'");
    }

    @Override
    public Ifiltro or(Ifiltro filtro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'or'");
    }
     
}
