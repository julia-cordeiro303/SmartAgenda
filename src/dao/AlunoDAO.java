
package dao;

import beans.Aluno;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class AlunoDAO {
    private Conexao conexao;
    private Connection conn;
   


     public AlunoDAO() {
     this.conexao = new Conexao();
     this.conn = this.conexao.getConexao();
}

     public void inserir (Aluno aluno) {
     String sql = "INSERT INTO ALUNO(id, cpf, nome, dataNascimento, serie, turma, turno, cadastro) VALUES (?, ?, ?, ?, ?,?,?)";
     try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setString(1, aluno.getNome());
         stmt.setString(2, aluno.getDataNascimento());
         stmt.setString(3, aluno.getCpf());
         stmt.setString(4, aluno.getSerie());
         stmt.setString(5, aluno.getTurma());
         stmt.setString(6, aluno.getTurno());
         stmt.setString(7, aluno.getCadastro());
         stmt.setInt(8, aluno.getId());
         stmt.execute();
         
         
        } catch(Exception e) {
            System.out.println("Erro ao inserir aluno" + e.getMessage());
        } }
     
     
      public void editar (Aluno aluno) {
     String sql = "UPDATE ALUNO SET cpf=?, nome=?, dataNascimento=?, serie=?, turma=?, turno=?, cadastro=?, WHERE id=?";
     try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        stmt.setString(1, aluno.getNome());
         stmt.setString(2, aluno.getDataNascimento());
         stmt.setString(3, aluno.getCpf());
         stmt.setString(4, aluno.getSerie());
         stmt.setString(5, aluno.getTurma());
         stmt.setString(6, aluno.getTurno());
         stmt.setString(7, aluno.getCadastro());
         stmt.setInt(8, aluno.getId());
         stmt.execute();
         
        } catch(Exception e) {
            System.out.println("Erro ao editar aluno" + e.getMessage());
        } }
     
       public void excluir (int id) {
     String sql = "DELETE FROM ALUNO WHERE id = ?";
     try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setInt(1, id);
         stmt.execute();
        
        } catch(Exception e) {
            System.out.println("Erro ao excluir aluno" + e.getMessage());
        } }
     
     public Aluno getAluno (int id){
          String sql = "SELECT * FROM ALUNO WHERE id = ?";
          try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setInt(1, id);
         ResultSet r = stmt.executeQuery();
         Aluno aluno = new Aluno();
         r.next();
         
         aluno.setId(r.getInt(id));
         aluno.setNome(r.getString("nome"));
         aluno.setDataNascimento(r.getString("dataNascimento"));
         aluno.setCpf(r.getString("cpf"));
         aluno.setSerie(r.getString("serie"));
         aluno.setTurma(r.getString("turma"));
         aluno.setTurno(r.getString("turno"));
         aluno.setCadastro(r.getString("cadastro"));

         return aluno;
         
        } catch(Exception e) {
            System.out.println("Erro ao buscar alunos" + e.getMessage());
            return null;
        } 
     }
     
     
          public Aluno getFilmes (String nome){
          String sql = "SELECT * FROM ALUNO WHERE nome = ?";
          try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setString(1, nome);
         ResultSet r = stmt.executeQuery();
         Aluno aluno = new Aluno();
         r.next();
         
         aluno.setId(r.getInt("id"));
         aluno.setNome(r.getString("nome"));
         aluno.setDataNascimento(r.getString("dataNascimento"));
         aluno.setCpf(r.getString("cpf"));
         aluno.setSerie(r.getString("serie"));
         aluno.setTurma(r.getString("turma"));
         aluno.setTurno(r.getString("turno"));
         aluno.setCadastro(r.getString("cadastro"));


         return aluno;
         
        } catch(Exception e) {
            System.out.println("Erro ao buscar nome dos alunos" + e.getMessage());
            return null;
        } 
     }
     
     public List<Aluno> getAluno(String nome) {
         String sql = "SELECT * FROM ALUNO WHERE nome LIKE ?";
           try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setString(1, "%" + nome + "%");
         ResultSet r = stmt.executeQuery();
         
         List<Aluno> listaAluno = new ArrayList<>();
         
         while (r.next()) {
             Aluno aluno = new Aluno();
             
         aluno.setId(r.getInt("id"));
         aluno.setNome(r.getString("nome"));
         aluno.setDataNascimento(r.getString("dataNascimento"));
         aluno.setCpf(r.getString("cpf"));
         aluno.setSerie(r.getString("serie"));
         aluno.setTurma(r.getString("turma"));
         aluno.setTurno(r.getString("turno"));
         aluno.setCadastro(r.getString("cadastro"));

         listaAluno.add(aluno);
             
         } return listaAluno;
         
        
        } catch(Exception e) {
            return null; 
        } 
     }
         
     }
     
     
 
