package state;

public class Disponivel extends PrateleiraState{
    
    public Disponivel(Produto produto){
        super(produto);
    }

    @Override
    public void produtoDisponivel() {
        System.out.println("Este Produto já está Disponível!");
        
    }

    @Override
    public void produtoPerdido() {
        getProduto().setState(new Perdido(getProduto()));
        
    }

    @Override
    public void produtoRequisitado() {
        getProduto().setState(new Requisitado(getProduto()));
    }

    public void myState(){
        System.out.println("Estado: Disponivel");
    }
}
