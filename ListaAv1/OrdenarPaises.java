package ListaAv1;

import java.util.Collections;
import java.util.List;

public class OrdenarPaises {

    public void ordenarAlfabetica(List<Country> paises) {
        Collections.sort(paises);
    }

    public void ordenarTvAudience(List<Country> paises) {
        paises.sort((o1, o2) -> Double.compare(o2.getTvAudience(), o1.getTvAudience()));
    }

    public void imprimirLista(List<Country> paises) {
        for (Country country : paises) {
            System.out.println(country);
        }
    }
    
}
