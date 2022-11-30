package strategy;

import java.util.List;

public class EncomendaFabrica implements InterfaceCalculoEncomenda{
    
    public double calcular(List<Double> encomendas){

        double result = 0;

        for(Double encomenda : encomendas) {
            result += encomenda * 0.2;
            result += encomenda;
        }

        return result;

    }
}
