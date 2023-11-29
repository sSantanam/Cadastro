/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class exibir {

    public static String gettipo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static String getvalor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static String getDescricao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 private String descricao;
 private String valor;
 private String tipo;

 
 public exibir(String descricao, String valor, String tipo){
     
     this.descricao = descricao;
     this.valor = valor;
     this.tipo = tipo;
     
 }
 
 //metodos getters
 
 public String getdescricao(){
     return descricao;
 }
 
 public String getValor(){
     return valor;
 }
          
 public String getTipo() {
        return tipo;
    }
 
 
 public void setdescricao(String descricao){
     this.descricao = descricao;
 }
 
 public void setvalor(String valor){
     this.valor = valor;
 }
 
 
 public void setTipo(String tipo) {
        this.tipo = tipo;
    }
 
} 

