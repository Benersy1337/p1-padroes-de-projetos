package DoubleDispatch;

public abstract class Produto {
    
    private double preco;

    public Produto(double preco) {
        super();
        this.preco = preco;
    }

    public void addPropriedades(Estoque estoque) {
        estoque.addPropriedades(PropriedadesEstoque.PRECO, preco);
    }
}
