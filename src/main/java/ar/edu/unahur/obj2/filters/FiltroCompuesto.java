package ar.edu.unahur.obj2.filters;

import java.util.ArrayList;
import java.util.List;

public abstract class FiltroCompuesto implements Ifiltro{

    protected List<Ifiltro> filtros;

    public FiltroCompuesto() {
        this.filtros = new ArrayList<>();
    }
       
    public void agregarFiltro(Ifiltro filtro){
        filtros.add(filtro);
    }

     @Override   
    public Ifiltro and(Ifiltro filtro) {
        return null;
    }
    

    @Override
    public Ifiltro or(Ifiltro filtro){
        return null;
    }
           

}
