package DoubleDispatch;

public class ProdutoCliente extends Produto{
    private double custoCliente;

    public ProdutoCliente(double preco, double custoCliente) {
        super(preco);
        this.custoCliente = custoCliente;
    }

    public void addPropriedades(Estoque estoque) {
        super.addPropriedades(estoque);
        estoque.addPropriedades(PropriedadesEstoque.CUSTOCLIENTE,custoCliente);
    }
}
