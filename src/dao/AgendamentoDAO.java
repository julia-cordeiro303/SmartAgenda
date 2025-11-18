/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Agendamento;
import beans.Aluno;
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
public class AgendamentoDAO {
      private Conexao conexao;
    private Connection conn;
   


     public AgendamentoDAO() {
     this.conexao = new Conexao();
     this.conn = this.conexao.getConexao();
}

     public void inserir (Agendamento agendamento) {
     String sql = "INSERT INTO AGENDAMENTO(id, data, horario, funcionarioAgendamento, nomeAluno, nomeResponsavel) VALUES (?, ?, ?, ?, ?,?)";
     try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setString(1, agendamento.getData());
         stmt.setString(2, agendamento.getHorario());
         stmt.setString(3, agendamento.getFuncionarioAgendamento());
         stmt.setString(4, agendamento.getNomeAluno());
         stmt.setString(5, agendamento.getNomeResponsavel());
         stmt.setInt(6, agendamento.getId());
         stmt.execute();
         
         
        } catch(Exception e) {
            System.out.println("Erro ao inserir agendamento" + e.getMessage());
        } }
     
     
      public void editar (Agendamento agendamento) {
     String sql = "UPDATE AGENDAMENTO SET data=?, horario=?, funcionarioAgendamento=?, nomeAluno=?, nomeResponsavel=?, WHERE id=?";
     try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
         stmt.setString(1, agendamento.getData());
         stmt.setString(2, agendamento.getHorario());
         stmt.setString(3, agendamento.getFuncionarioAgendamento());
         stmt.setString(4, agendamento.getNomeAluno());
         stmt.setString(5, agendamento.getNomeResponsavel());
         stmt.setInt(6, agendamento.getId());
         stmt.execute();
         stmt.execute();
         
        } catch(Exception e) {
            System.out.println("Erro ao editar agendamento" + e.getMessage());
        } }
     
       public void excluir (int id) {
     String sql = "DELETE FROM AGENDAMENTO WHERE id = ?";
     try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setInt(1, id);
         stmt.execute();
        
        } catch(Exception e) {
            System.out.println("Erro ao excluir agendamento" + e.getMessage());
        } }
     
     public Agendamento getAgendamento (int id){
          String sql = "SELECT * FROM AGENDAMENTO WHERE id = ?";
          try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setInt(1, id);
         ResultSet r = stmt.executeQuery();
         Agendamento agendamento = new Agendamento();
         r.next();
         
         agendamento.setId(r.getInt("id"));
         agendamento.setData(r.getString("data"));
         agendamento.setHorario(r.getString("horario"));
         agendamento.setFuncionarioAgendamento(r.getString("funcionarioAgendamento"));
         agendamento.setNomeAluno(r.getString("nomeAluno"));
         agendamento.setNomeResponsavel(r.getString("nomeResponsavel"));

         return agendamento;
         
        } catch(Exception e) {
            System.out.println("Erro ao buscar agendamento" + e.getMessage());
            return null;
        } 
     }
     
     
          public Agendamento getAgendamento (String data){
          String sql = "SELECT * FROM AGENDAMENTO WHERE data = ?";
          try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setString(1, data);
         ResultSet r = stmt.executeQuery();
         Agendamento agendamento = new Agendamento();
         r.next();
         
         agendamento.setId(r.getInt("id"));
         agendamento.setData(r.getString("data"));
         agendamento.setHorario(r.getString("horario"));
         agendamento.setFuncionarioAgendamento(r.getString("funcionarioAgendamento"));
         agendamento.setNomeAluno(r.getString("nomeAluno"));
         agendamento.setNomeResponsavel(r.getString("nomeResponsavel"));


         return agendamento;
         
        } catch(Exception e) {
            System.out.println("Erro ao buscar data dos agendamento" + e.getMessage());
            return null;
        } 
     }
     
        public List<Agendamento> getAgendamento1(String data) {
         String sql = "SELECT * FROM AGENDAMENTO WHERE data LIKE ?";
           try { 
         PreparedStatement stmt = this.conn.prepareStatement(sql);
         stmt.setString(1, "%" + data + "%");
         ResultSet r = stmt.executeQuery();
         
         List<Agendamento> listaAgendamento = new ArrayList<>();
         
         while (r.next()) {
             Agendamento agendamento = new Agendamento();
             
               agendamento.setId(r.getInt("id"));
         agendamento.setData(r.getString("data"));
         agendamento.setHorario(r.getString("horario"));
         agendamento.setFuncionarioAgendamento(r.getString("funcionarioAgendamento"));
         agendamento.setNomeAluno(r.getString("nomeAluno"));
         agendamento.setNomeResponsavel(r.getString("nomeResponsavel"));

         listaAgendamento.add(agendamento);
             
         } return listaAgendamento;
         
        
        } catch(Exception e) {
            return null; 
        } 
     }
         
     }
     
     
 


