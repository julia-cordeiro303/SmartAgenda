
package beans;

public class Funcionario {
    String nome;
    String cpf;
    String email;
    String funcao;
    String cadastro;
    int id;
    
    public Funcionario() {}
    
    public Funcionario(String nome, String cpf, String email, String funcao, String cadastro, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.funcao = funcao;
        this.cadastro = cadastro;
        this.id = id;
    }       
    
    public String getNome() {return nome;}
    public String getCpf() {return cpf;}
    public String getEmail() {return email;}
    public String getFuncao() {return funcao;}
    public String getCadastro() {return cadastro;}
    public int getId() {return id;}
 
  public void setNome(String nome) {
        this.nome = nome;
}
  public void setCpf(String cpf) {
        this.cpf = cpf;
}
    public void setEmail(String email) {
        this.email = email;
}
      public void setFuncao(String funcao) {
        this.funcao = funcao;
}
       public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
}
        public void setId(int id) {
        this.id = id;
}
}

