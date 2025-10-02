package ar.edu.unahur.obj2.filters;

public abstract class Filtro implements Ifiltro {

    @Override
    public abstract Ifiltro and(Ifiltro filtro); 
    

    @Override
    public abstract Ifiltro or(Ifiltro filtro); 
           
}

  
  
