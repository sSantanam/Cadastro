
public class ClassConsulta {
     public class Consulta {
    private String nome;
    private String cpf;

     public Consulta (String nome, String cpf)
     {
         this.nome = nome;
          this.cpf = cpf ;
     
    }
     public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
  }
     public void getcpf (String cpf) {
       this. cpf = cpf;
    }
public void setcpf(String cpf) {
        this.cpf = cpf;
    }
   }
}