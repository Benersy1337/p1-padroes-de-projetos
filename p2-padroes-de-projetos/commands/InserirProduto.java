package commands;

public class InserirProduto implements Comando{
    private String produto;
    private String adicionar;

    public InserirProduto(String produto, String adicionar) {
        super();
        this.produto = produto;
        this.adicionar = adicionar;
    }
    

    public String adicionar() {
        return produto.concat(adicionar);
    }

    public String remover() {
        return produto;
    }


}
