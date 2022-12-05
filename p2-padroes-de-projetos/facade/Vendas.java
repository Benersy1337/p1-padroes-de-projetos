package facade;

public class Vendas implements Almoxarifado{

    @Override
    public void emitir() {
        System.out.println("Requisição de Venda Emitida");
    }

}
