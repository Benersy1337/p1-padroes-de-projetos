package nullObject;

public class RealPrateleira extends AbstractPrateleira {
    

    public RealPrateleira(String produto, int locacoes){

        super();
        this.produto = produto;
        this.locacoes = locacoes;
    }

    @Override
    public String getProduto(){
        return this.produto;
    }

    @Override
    public int getLocacoes(){
        return this.locacoes;
    }

}
