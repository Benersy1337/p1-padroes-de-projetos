package facade;

public class Oficina implements Almoxarifado{

    @Override
    public void emitir() {
        System.out.println("Requisiçao da Oficina Emitida");
    }
}
