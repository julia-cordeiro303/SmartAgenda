
package dao;

import beans.Funcionario;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
    private Conexao conexao;
    private Connection conn;
   


     public FuncionarioDAO() {
     this.conexao = new Conexao();
     this.conn = this.conexao.getConexao();
}

     public void inserir (Funcionario funcionario) {
     String sql = "INSERT INTO FUNCIONARIO(id, cpf, nome, email, funcao, cadastro)VALUES (?, ?, ?, ?, ?,?)";
     try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setString(1, funcionario.getNome());
         stmt.setString(2, funcionario.getCpf());
         stmt.setInt(3, funcionario.getId());
         stmt.setString(4, funcionario.getEmail());
         stmt.setString(5, funcionario.getFuncao());
         stmt.setString(6, funcionario.getCadastro());
         stmt.execute();
         
         
        } catch(Exception e) {
            System.out.println("Erro ao inserir funcionário" + e.getMessage());
        } }
     
     
      public void editar (Funcionario funcionario) {
     String sql = "UPDATE FUNCIONARIO SET cpf=?, nome=?, email=?, funcao=?, cadastro=?, WHERE id=?";
     try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
         stmt.setString(1, funcionario.getNome());
         stmt.setString(2, funcionario.getCpf());
         stmt.setInt(3, funcionario.getId());
         stmt.setString(4, funcionario.getEmail());
         stmt.setString(5, funcionario.getFuncao());
         stmt.setString(6, funcionario.getCadastro());
         stmt.execute();
         
        } catch(Exception e) {
            System.out.println("Erro ao editar funcionário" + e.getMessage());
        } }
     
       public void excluir (int id) {
     String sql = "DELETE FROM FUNCIONARIO WHERE id = ?";
     try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setInt(1, id);
         stmt.execute();
        
        } catch(Exception e) {
            System.out.println("Erro ao excluir funcionário" + e.getMessage());
        } }
     
     public Funcionario getFuncionario (int id){
          String sql = "SELECT * FROM FUNCIONARIO WHERE id = ?";
          try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setInt(1, id);
         ResultSet r = stmt.executeQuery();
         Funcionario funcionario = new Funcionario();
         r.next();
         
         funcionario.setId(r.getInt("id"));
         funcionario.setNome(r.getString("nome"));
         funcionario.setCpf(r.getString("cpf"));
         funcionario.setEmail(r.getString("email"));
         funcionario.setFuncao(r.getString("funcao"));
         funcionario.setCadastro(r.getString("cadastro"));
         

         return funcionario;
         
        } catch(Exception e) {
            System.out.println("Erro ao buscar funcionario" + e.getMessage());
            return null;
        } 
     }
     
     
          public Funcionario getFuncionarios (String nome){
          String sql = "SELECT * FROM ALUNO WHERE nome = ?";
          try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setString(1, nome);
         ResultSet r = stmt.executeQuery();
         Funcionario funcionario = new Funcionario();
         r.next();
         
         funcionario.setId(r.getInt("id"));
         funcionario.setNome(r.getString("nome"));
         funcionario.setCpf(r.getString("cpf"));
         funcionario.setEmail(r.getString("email"));
         funcionario.setFuncao(r.getString("funcao"));
         funcionario.setCadastro(r.getString("cadastro"));


         return funcionario;
         
        } catch(Exception e) {
            System.out.println("Erro ao buscar nome dos funcionarios" + e.getMessage());
            return null;
        } 
     }
     
     public List<Funcionario> getFuncionario(String nome) {
         String sql = "SELECT * FROM RESPONSAVEL WHERE nome LIKE ?";
           try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setString(1, "%" + nome + "%");
         ResultSet r = stmt.executeQuery();
         
         List<Funcionario> listaFuncionario = new ArrayList<>();
         
         while (r.next()) {
             Funcionario funcionario = new Funcionario();
             
       funcionario.setId(r.getInt("id"));
         funcionario.setNome(r.getString("nome"));
         funcionario.setCpf(r.getString("cpf"));
         funcionario.setEmail(r.getString("email"));
         funcionario.setFuncao(r.getString("funcao"));
         funcionario.setCadastro(r.getString("cadastro"));


         listaFuncionario.add(funcionario);
             
         } return listaFuncionario;
         
        
        } catch(Exception e) {
            return null; 
        } 
     }
         
     }
     
    