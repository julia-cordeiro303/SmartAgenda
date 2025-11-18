package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
      public Connection getConexao() {
            
                    try {
                        Connection conn = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/SMARTAGENDA ", 
                                "root", 
                                "310309"
                        );
                        return conn;
            
                    } catch (Exception e) {
                        System.out.println("Erro ao conectar o banco de dados " + e.getMessage());
                        return null;
                    }
            
                }
            
            }



