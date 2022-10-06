package strategy;

import java.util.List;

public class EncomendaTercerizada implements InterfaceCalculoEncomenda{

    public double calcular(List<Double> encomendas){

        double result = 0;

        for(Double encomenda : encomendas) {
            result += encomenda * 0.4;
            result += encomenda;
        }

        return result;

    }
    
}
