/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.util.ArrayList;
import java.util.List;

public class ListaAgendamento {
     private static final List<Agendamento> ListaAgendamento = new ArrayList<>();
    
    public static List<Agendamento> Listar() {
        return ListaAgendamento;
    }

    public static void Adicionar(Agendamento a) {
      ListaAgendamento.add(a);
}
    }  

