package ar.edu.unahur.obj2.filters;

import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import ar.edu.unahur.obj2.model.Pais;
import ar.edu.unahur.obj2.service.IPaisService;
import ar.edu.unahur.obj2.service.PaisService;


public class FiltroTest {
    @Test
    void FiltroAreaMayorAs(){
        IPaisService paisService = new PaisService();
        List<Pais> paises = paisService.getPaises();
        FiltroAreaMayorA areaMayorAUnMillon = new FiltroAreaMayorA(100000);
        List<Pais> paisesGrandes = paises.stream()
            .filter(p -> areaMayorAUnMillon.aplicar(p))
            .collect(Collectors.toList());
        paisesGrandes.forEach(p -> System.err.println(p.toString()));
    }
}