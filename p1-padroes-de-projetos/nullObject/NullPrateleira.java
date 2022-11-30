package nullObject;

public class NullPrateleira extends AbstractPrateleira{
    

    @Override
    public String getProduto(){
        return "Esta Prateleira não existe!";
    }

    @Override
    public int getLocacoes(){
        return 0;
    }


}
