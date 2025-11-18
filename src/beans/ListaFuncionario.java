
package beans;

import java.util.ArrayList;
import java.util.List;

public class ListaFuncionario {
      private static final List<Funcionario> ListaFuncionario = new ArrayList<>();
    
    public static List<Funcionario> Listar() {
        return ListaFuncionario;
    }
    public static void Adicionar(Funcionario f) {
        ListaFuncionario.add(f);
    }
}

