package facade;

public class Oficina implements Almoxarifado{

    @Override
    public void emitir() {
        System.out.println("Requisição da Oficina Emitida");
    }
}
