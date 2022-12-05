package decoratorAndProxy;

public interface ProdutoDAOInterface {
    
    // Método para Adicionar um Produto
    public void addProduto(String locacao, String nome) throws ProdutoException;

    // Método para "Recuperar" um Produto
    public Produto getProduto(String locacao, String nome) throws ProdutoException;

}
