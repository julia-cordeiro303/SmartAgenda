
package beans;

public class Responsavel {
    String nome;
    String dataNascimento;
    String telefone;
    String endereco;
    String parentesco;
    String cpf;
    String cadastro;
    int id;
    
    public Responsavel(){}
    
    public Responsavel(String nome, String dataNascimento, String telefone, String endereco, String parentesco, String cpf, String cadastro, int id) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
        this.parentesco = parentesco;
        this.cpf = cpf;
        this.cadastro = cadastro;
        this.id = id;
    }       

  
    
    public String getNome() { return nome; }
    public String getDataNascimento() { return dataNascimento;}
    public String getTelefone() { return telefone;}
    public String getEndereco() {return endereco;}
    public String getParentesco() { return parentesco;}
    public String getCpf() { return cpf;}
    public String getCadastro() { return cadastro;}
    public int getId() { return id;}


     public void setNome(String nome) {
        this.nome = nome;
}
      public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
}
        public void setTelefone(String telefone) {
        this.telefone = telefone;
}
          public void setEndereco(String endereco) {
        this.endereco = endereco;
}
            public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
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