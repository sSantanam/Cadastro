/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Login {
     private String Usuario;
      private String Senha;
      
       public Login( String usuario,String senha) {
        this.Usuario = usuario;
        this.Senha = Senha;
}
  public String getUsuario(){
     return Usuario;
 }
    
    public String getSenha(){
     return Senha;
 }
     public void setUsuario (String Usuario){
     this.Usuario = Usuario;
 }
    
    public void setSenha (String Senha){
     this.Senha = Senha;
 }
}