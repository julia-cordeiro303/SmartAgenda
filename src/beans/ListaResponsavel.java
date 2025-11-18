
package beans;

import java.util.ArrayList;
import java.util.List;

public class ListaResponsavel {
    private static final List<Responsavel> ListaResponsavel = new ArrayList<>();
    
    public static List<Responsavel> Listar() {
        return ListaResponsavel;
    }
    public static void Adicionar(Responsavel r) {
        ListaResponsavel.add(r);
}
}

