package ar.edu.unahur.obj2.filters;

import java.util.List;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroOr extends FiltroCompuesto{

    
    public FiltroOr(Ifiltro filtro, Ifiltro nuevo){
        filtros.add(filtro);
        filtros.add(nuevo);
    }

    public FiltroOr(List<Ifiltro> filtros){
        filtros.addAll(filtros);
    }
    
    
    @Override
    public Boolean aplicar(Pais pais) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aplicar'");
    }

    @Override
    public Ifiltro and(Ifiltro filtro) {
       return super.and(filtro);
    }

   

}
