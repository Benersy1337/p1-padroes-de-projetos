package state;

public class Perdido extends PrateleiraState{
    
    public Perdido(Produto produto){
        super(produto);
    }

    @Override
    public void produtoDisponivel() {
       getProduto().setState(new Disponivel(getProduto()));
        
    }

    @Override
    public void produtoRequisitado() {
        getProduto().setState(new Requisitado(getProduto()));
        
    }

    @Override
    public void produtoPerdido() {
        System.out.println("Este Produto já está perdido!");
        
    }

    public void myState(){
        System.out.println("Estado: Perdido");
    }

    
}
