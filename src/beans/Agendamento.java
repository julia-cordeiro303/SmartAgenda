
package beans;

public class Agendamento {
    String data;
    String horario;
    String funcionarioAgendamento;
    String nomeAluno;
    String nomeResponsavel;
    int id;
    
       public Agendamento() {}
    
    public Agendamento(String data, String horario, String funcionarioAgendamento, String nomeAluno, String nomeResponsavel,int id) {
        this.data = data;
        this.horario = horario;
        this.funcionarioAgendamento = funcionarioAgendamento;
        this.nomeAluno = nomeAluno;
        this.nomeResponsavel = nomeResponsavel;
        this.id = id;
    }


    
    public String getData() { return data; }
    public String getHorario() { return horario;}
    public String getFuncionarioAgendamento() { return funcionarioAgendamento;}
    public String getNomeAluno() {return nomeAluno;}
    public String getNomeResponsavel() { return nomeResponsavel;}
    public int getId() { return id;}
 
    public void setData(String data) {
        this.data = data;
}
    public void setHorario(String horario) {
        this.horario = horario;
}
    public void setFuncionarioAgendamento(String funcionarioAgendamento) {
        this.funcionarioAgendamento = funcionarioAgendamento;
}
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
}
    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
}
    public void setId(int id) {
        this.id = id;
}
      
      
      
    }

