package state;

public class Requisitado extends PrateleiraState{
    
    public Requisitado(Produto produto){
        super(produto);
    }

    @Override
    public void produtoDisponivel() {
        getProduto().setState(new Disponivel(getProduto()));
        
    }

    @Override
    public void produtoPerdido() {
        getProduto().setState(new Perdido(getProduto()));
        
    }

    @Override
    public void produtoRequisitado() {
        System.out.println("Este produto já foi requisitado!");
        
    }

    public void myState(){
        System.out.println("Estado: Requisitado");
    }

    
}
