/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;
import Model.exibir;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */

public class ConectaDB {
    public void exibir (exibir exibirbd){
    String sql = "INSERT INTO exibir (descricao, valor, tipo) VALUES (?, ?, ?)"; 

 try (Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/exibicaobd", "root", "senha");
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
     
      pstmt.setString(1, exibir.getDescricao());
        pstmt.setString(2, exibir.getvalor());
        pstmt.setString(3, exibir.gettipo());
        pstmt.executeUpdate();
        } catch (SQLException e) {
        System.out.println("Erro ao adicionar transação: " + e.getMessage());
        {
        }
        }       
    }    
}       
            
        

   
    
    
    
    
       

