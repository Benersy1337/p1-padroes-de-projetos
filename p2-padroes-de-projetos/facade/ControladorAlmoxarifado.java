package facade;

public class ControladorAlmoxarifado {
    private Almoxarifado fiscal;
    private Almoxarifado oficina;
    private Almoxarifado vendas;

    public ControladorAlmoxarifado() {
        fiscal = new Fiscal();
        oficina = new Oficina();
        vendas = new Vendas();
    }

    public void emitirNF(){
        fiscal.emitir();
    }

    public void emitirRequisiçãoOficina(){
        oficina.emitir();
    }

    public void emitirRequisiçãoVendas(){
        vendas.emitir();
    }

}
