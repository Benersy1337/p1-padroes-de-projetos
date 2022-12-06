package DoubleDispatch;

public class ProdutoOficina extends Produto{
    private double custoOficina;

    public ProdutoOficina(double preco, double custoOficina) {
        super(preco);
        this.custoOficina = custoOficina;
    }

    public void addPropriedades(Estoque estoque) {
        super.addPropriedades(estoque);
        estoque.addPropriedades(PropriedadesEstoque.CUSTOOFICINA,custoOficina);
    }
}
