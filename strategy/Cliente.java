package strategy;

public class Cliente {
    
    private String nome;
    private String Cadastro;

    public Cliente(String nome, String cadastro) {
        this.nome = nome;
        Cadastro = cadastro;
    }

    public String getNome() {
        return nome;
    }

    public String getCadastro() {
        return Cadastro;
    }

    
}
