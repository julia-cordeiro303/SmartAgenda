/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Responsavel;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JULIA
 */
public class ResponsavelDAO {
    private Conexao conexao;
    private Connection conn;
   


     public ResponsavelDAO() {
     this.conexao = new Conexao();
     this.conn = this.conexao.getConexao();
}

     public void inserir (Responsavel responsavel) {
     String sql = "INSERT INTO RESPONSAVEL(id, cpf, nome, dataNascimento, telefone, endereco, parentesco, cadastro) VALUES (?, ?, ?, ?, ?,?,?)";
     try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setString(1, responsavel.getNome());
         stmt.setString(2, responsavel.getDataNascimento());
         stmt.setString(3, responsavel.getCpf());
         stmt.setString(4, responsavel.getTelefone());
         stmt.setString(5, responsavel.getEndereco());
         stmt.setString(6, responsavel.getParentesco());
         stmt.setString(7, responsavel.getCadastro());
         stmt.setInt(8, responsavel.getId());
         stmt.execute();
         
         
        } catch(Exception e) {
            System.out.println("Erro ao inserir responsavel" + e.getMessage());
        } }
     
     
      public void editar (Responsavel responsavel) {
     String sql = "UPDATE RESPONSAVEL SET cpf=?, nome=?, dataNascimento=?, telefone=?, endereco=?, parentesco=?, cadastro=?, WHERE id=?";
     try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        stmt.setString(1, responsavel.getNome());
         stmt.setString(2, responsavel.getDataNascimento());
         stmt.setString(3, responsavel.getCpf());
         stmt.setString(4, responsavel.getEndereco());
         stmt.setString(5, responsavel.getTelefone());
         stmt.setString(6, responsavel.getParentesco());
         stmt.setString(7, responsavel.getCadastro());
         stmt.setInt(8, responsavel.getId());
         stmt.execute();
         
        } catch(Exception e) {
            System.out.println("Erro ao editar responsável" + e.getMessage());
        } }
     
       public void excluir (int id) {
     String sql = "DELETE FROM RESPONSAVEL WHERE id = ?";
     try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setInt(1, id);
         stmt.execute();
        
        } catch(Exception e) {
            System.out.println("Erro ao excluir responsável" + e.getMessage());
        } }
     
     public Responsavel getResponsavel(int id){
          String sql = "SELECT * FROM RESPONSAVEL WHERE id = ?";
          try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setInt(1, id);
         ResultSet r = stmt.executeQuery();
         Responsavel responsavel = new Responsavel();
         r.next();
         
         responsavel.setId(r.getInt(id));
         responsavel.setNome(r.getString("nome"));
         responsavel.setDataNascimento(r.getString("dataNascimento"));
         responsavel.setCpf(r.getString("cpf"));
         responsavel.setTelefone(r.getString("telefone"));
         responsavel.setEndereco(r.getString("endereco"));
         responsavel.setParentesco(r.getString("parentesco"));
         responsavel.setCadastro(r.getString("cadastro"));

         return responsavel;
         
        } catch(Exception e) {
            System.out.println("Erro ao buscar responsável" + e.getMessage());
            return null;
        } 
     }
     
     
          public Responsavel getResponsavel (String nome){
          String sql = "SELECT * FROM RESPONSAVEL WHERE nome = ?";
          try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setString(1, nome);
         ResultSet r = stmt.executeQuery();
         Responsavel responsavel = new Responsavel();
         r.next();
         
         responsavel.setId(r.getInt("id"));
         responsavel.setNome(r.getString("nome"));
         responsavel.setDataNascimento(r.getString("dataNascimento"));
         responsavel.setCpf(r.getString("cpf"));
         responsavel.setTelefone(r.getString("telefone"));
         responsavel.setEndereco(r.getString("endereco"));
         responsavel.setParentesco(r.getString("parentesco"));
         responsavel.setCadastro(r.getString("cadastro"));


         return responsavel;
         
        } catch(Exception e) {
            System.out.println("Erro ao buscar nome de responsavel" + e.getMessage());
            return null;
        } 
     }
     
         public List<Responsavel> getResponsavel1 (String nome) {
         String sql = "SELECT * FROM RESPONSAVEL WHERE nome LIKE ?";
           try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setString(1, "%" + nome + "%");
         ResultSet r = stmt.executeQuery();
         
         List<Responsavel> listaResponsavel = new ArrayList<>();
         
         while (r.next()) {
             Responsavel responsavel = new Responsavel();
             
         responsavel.setId(r.getInt("id"));
         responsavel.setNome(r.getString("nome"));
         responsavel.setDataNascimento(r.getString("dataNascimento"));
         responsavel.setCpf(r.getString("cpf"));
         responsavel.setTelefone(r.getString("telefone"));
         responsavel.setEndereco(r.getString("endereco"));
         responsavel.setParentesco(r.getString("parentesco"));
         responsavel.setCadastro(r.getString("cadastro"));

         listaResponsavel.add(responsavel);
             
         } return listaResponsavel;
         
        
        } catch(Exception e) {
            return null; 
        } 
     }
         
     }
     
     
