package nullObject;

public class PrateleiraDAO {
    

    public static final String[] produtos = {"Filtro", "Óleo", "Correia", "Junta"};

    public static final int[] locacoes = {12,27,33,24};

    public static AbstractPrateleira getPrateleira(String produto){

        for(int i = 0; i < produtos.length; i++){

            if(produtos[i].equalsIgnoreCase(produto)){
                return new RealPrateleira(produtos[i], locacoes[i]);

            }


        }

        return new NullPrateleira();

    }
}
