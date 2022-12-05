package facade;

public class Fiscal implements Almoxarifado{

    @Override
    public void emitir() {
        System.out.println("Nota Fiscal Emitida");
    }
    
}
