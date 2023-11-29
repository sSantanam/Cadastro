
public class Usuarios {
    public class Usuario {
    private String nome;
    private String email;
    public String cpf;
    public String telefone;
    public String endereco;
    // Construtor
    public Usuario(String nome, String email, String cpf, String telefone, String endereco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this. telefone = telefone;
        this. endereco = endereco;
        
    }
    
    // Getters e setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public void getcpf (String cpf) {
        this.cpf = cpf;
    }
public void setcpf(String cpf) {
        this.cpf = cpf;
}
public void gettelefone(String telefone) {
        this.telefone = telefone;
}
public void settelefone(String telefone) {
        this.telefone = telefone;
}
public void getendereco(String endereco) {
        this.endereco = endereco;
}
public void setendereco(String endereco) {
        this.endereco = endereco;
}


    }
}
