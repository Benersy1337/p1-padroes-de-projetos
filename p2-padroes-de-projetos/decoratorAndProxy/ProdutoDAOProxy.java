package decoratorAndProxy;

import java.util.HashMap;
import java.util.Map;

// Responsável por criar e recuperar os dados

public class ProdutoDAOProxy implements ProdutoDAOInterface{
    
    private Map<String, Produto>produtos;
    

    public ProdutoDAOProxy() {
        super();
        this.produtos = new HashMap<>();
    }

    public void addProduto( String locacao, String nome) {
        this.produtos.put(locacao, new Produto(locacao,nome));
    }

    public Produto getProduto(String locacao, String nome) {
        return produtos.get(locacao);
    }
}
