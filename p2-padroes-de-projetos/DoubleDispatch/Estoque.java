package DoubleDispatch;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Estoque {
    private List<Produto> produtos;
    private Map<PropriedadesEstoque, Double> propriedades;

    private Map<PropriedadesEstoque, Double> getPropriedades() {
        if(propriedades == null) {
            propriedades = new HashMap<PropriedadesEstoque, Double>();
            for(PropriedadesEstoque tipo : PropriedadesEstoque.values())
                propriedades.put(tipo, 0.0);
        }
        
        return propriedades;
    }

    public void addProduto(Produto prod) {
        getProdutos().add(prod);
        prod.addPropriedades(this);
    }

    public void addPropriedades(PropriedadesEstoque tipo, double valor) {
        getPropriedades().put(tipo, getPropriedades().get(tipo) + valor);
    }

    public double getTotal() {

        if(produtos.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;

        total += getPropriedades().get(PropriedadesEstoque.PRECO);
        total += getPropriedades().get(PropriedadesEstoque.CUSTOCLIENTE);
        total += getPropriedades().get(PropriedadesEstoque.CUSTOOFICINA);

        return total;

    }

    public double getCliente() {
        return getPropriedades().get(PropriedadesEstoque.CUSTOCLIENTE);
    }

    public double getOficina() {
        return getPropriedades().get(PropriedadesEstoque.CUSTOOFICINA);
    }

    private List<Produto> getProdutos() {
        if(produtos == null)
            produtos = new ArrayList<Produto>();
        return produtos;
    }



    
}
