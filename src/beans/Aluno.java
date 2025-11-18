
package beans;
public class Aluno {
    String nome;
    String dataNascimento;
    String serie;
    String turma;
    String turno;
    String cpf;
    String cadastro;
    int id;
    
    public Aluno() {}
    
    public Aluno(String nome, String dataNascimento, String serie, String turma, String turno, String cpf, String cadastro, int id) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.serie = serie;
        this.turma = turma;
        this.turno = turno;
        this.cpf = cpf;   
        this.cadastro = cadastro;
        this.id = id;
    }


    
    public String getNome() { return nome; }
    public String getDataNascimento() { return dataNascimento;}
    public String getSerie() { return serie;}
    public String getTurma() {return turma;}
    public String getTurno() { return turno;}
    public String getCpf() { return cpf;}
    public String getCadastro() { return cadastro;}
    public int getId() { return id;}
 
    public void setNome(String nome) {
        this.nome = nome;
}
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
}
    public void setSerie(String serie) {
        this.serie = serie;
}
    public void setTurma(String turma) {
        this.turma = turma;
}
    public void setTurno(String turno) {
        this.turno = turno;
}
    public void setCpf(String cpf) {
        this.cpf = cpf;
}
      public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
}
    public void setId(int id) {
        this.id = id;
}
      
      
      
    }


