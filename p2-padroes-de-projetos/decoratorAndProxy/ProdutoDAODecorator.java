package decoratorAndProxy;

// Responsável pela verificação dos dados

public class ProdutoDAODecorator implements ProdutoDAOInterface{
    
    private static ProdutoDAOInterface produtoDAO;

    private ProdutoDAOInterface getDAO() {
        if (produtoDAO == null)
            // cria um objeto que é responsável por criar e recuperar os dados
            produtoDAO = new ProdutoDAOProxy();
        return produtoDAO;
    }

    public void addProduto(String locacao, String nome) throws ProdutoException {

        if(locacao.isBlank() && nome != "") {

            getDAO().addProduto(locacao, nome);

            System.out.println("Adicionado produto a locação com sucesso!");
            
        }

        if(locacao.isBlank() && nome.isBlank()){
            throw new ProdutoException("Insira um item!");
        }
        
    
        else {
            throw new ProdutoException("Locação já está sendo usada!");
        }
           
    }

    public Produto getProduto(String locacao, String nome) throws ProdutoException {

        if(locacao.isBlank() && nome.isBlank()){
            throw new ProdutoException("Locação disponivel!");
        } 

    
        else {
            // Recupera o Produto
            Produto x = getDAO().getProduto(locacao, nome);

            
            // Caso na recuperação do produto voltar null, fazemos uma verificação. 
            if(x == null)
                return x;
            throw new ProdutoException("Locação Preenchida");
        }
        
    }
}
