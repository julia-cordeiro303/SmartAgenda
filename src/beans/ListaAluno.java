
package beans;

import java.util.ArrayList;
import java.util.List;

public class ListaAluno {
     private static final List<Aluno> ListaAluno = new ArrayList<>();
    
    public static List<Aluno> Listar() {
        return ListaAluno;
    }

    public static void Adicionar(Aluno a) {
      ListaAluno.add(a);
}
    }  


