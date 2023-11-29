/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

/**
 *
 * @author User
 */
public class cadastroDAO {
    
    
     private String Nome;
    private String Email;
    private String Senha;
    
    //metodos getters
    
    public String getNome(){
     return Nome;
 }
    
    public String getEmail(){
     return Email;
 }
    
    public String getSenha(){
     return Senha;
 }
    
    public void setNome(String Nome){
     this.Nome = Nome;
 }
    
    public void setEmail(String Email){
     this.Email = Email;
 }
    
    public void setdescricao(String Senha){
     this.Senha = Senha;
 }
    
}
