package fluentInterfaces;

public class Prateleira {
    private String produto;
    private int quantidade;
    private String locacao;


    public Prateleira produtos(String produto){
        this.produto = produto;
        return this;
    }

    
    public Prateleira quantity(int quantidade){
        this.quantidade = quantidade;
        return this;
    }

    public Prateleira locacoes(String locacao) {
        this.locacao = locacao;
        return this;
    }


    public String getProduto() {
        return produto;
    }


    public int getQuantidade() {
        return quantidade;
    }


    public String getLocacao() {
        return locacao;
    }

    
}


