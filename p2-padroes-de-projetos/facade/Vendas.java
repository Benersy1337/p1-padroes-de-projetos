package facade;

public class Vendas implements Almoxarifado{

    @Override
    public void emitir() {
        System.out.println("Requisiçao de Venda Emitida");
    }

}
