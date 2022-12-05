package decoratorAndProxy;

public class Produto {
    
    private String locacao;
    private String nome;

    public Produto(String locacao, String nome) {
        this.locacao = locacao;
        this.nome = nome;
    }
    public String getLocacao() {
        return locacao;
    }
    public void setLocacao(String locacao) {
        this.locacao = locacao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
