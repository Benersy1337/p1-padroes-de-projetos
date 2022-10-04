package state;

public class Produto {
    
    private PrateleiraState state;

    public Produto(){
        this.state = new Disponivel(this);
    }

    public void disponivel(){
        state.produtoDisponivel();
    }

    public void requisitado(){
        state.produtoRequisitado();
    }

    public void perdido(){
        state.produtoPerdido();
    }

    public PrateleiraState getState() {
        return state;
    }

    public void setState(PrateleiraState state) {
        this.state = state;
    }

    public void state(){
        state.myState();
    }

   
}
