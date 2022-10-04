package state;

public abstract class PrateleiraState{

    private Produto produto;

    public PrateleiraState(Produto produto){
        this.produto = produto;
    }

    public abstract void produtoDisponivel();

    public abstract void produtoPerdido();

    public abstract void produtoRequisitado();

    public abstract void myState();

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


}