package strategy;

import java.util.List;

public class ResultadoEncomenda {
    
    private Cliente cliente;
    private Vendedor vendedor;
    private List<Double> encomendas;
    private InterfaceCalculoEncomenda calculoEncomendaFinal;


    public ResultadoEncomenda(Cliente cliente, Vendedor vendedor, List<Double> encomendas,
            InterfaceCalculoEncomenda calculoEncomendaFinal) {
        super();        
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.encomendas = encomendas;
        this.calculoEncomendaFinal = calculoEncomendaFinal;
    }


    public double calcularEncomendaFinal() {
        return calculoEncomendaFinal.calcular(encomendas);
    }


    public Cliente getCliente() {
        return cliente;
    }


    public Vendedor getVendedor() {
        return vendedor;
    }


    public List<Double> getEncomendas() {
        return encomendas;
    }


    public InterfaceCalculoEncomenda getCalculoEncomendaFinal() {
        return calculoEncomendaFinal;
    }


    public void setCalculoEncomendaFinal(InterfaceCalculoEncomenda calculoEncomendaFinal) {
        this.calculoEncomendaFinal = calculoEncomendaFinal;
    }

    

   
    

}
