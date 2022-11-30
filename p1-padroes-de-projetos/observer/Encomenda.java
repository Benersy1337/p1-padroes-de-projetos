package observer;

public class Encomenda implements Observer {

    private int numEncomenda;
    private boolean disponivel;

    public Encomenda(int numEncomenda, boolean disponivel) {
        this.numEncomenda = numEncomenda;
        this.disponivel = disponivel;
    }

    // IMPLEMENTAÇÃO DO PADRÃO OBSERVER

    public int getNumEncomenda() {
        return numEncomenda;
    }

    public void setNumEncomenda(int numEncomenda) {
        this.numEncomenda = numEncomenda;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public void notify(Observable observable, String message) {
        System.out.println(((ProdutoNotify) observable).getAlmoxarifado() + " para o setor de vendas "
                + this.numEncomenda + ": " + message);
    }

}
