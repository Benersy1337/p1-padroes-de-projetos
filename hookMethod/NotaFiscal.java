package hookMethod;

// HOOK METHOD - IMPOSTO SOBRE TIPO DE NOTA FISCAL

public abstract class NotaFiscal {

    private int numNotaFiscal;
    private double valorNotaFiscal;

    public NotaFiscal(int numNotaFiscal, double valorNotaFiscal) {
        super();
        this.numNotaFiscal = numNotaFiscal;
        this.valorNotaFiscal = valorNotaFiscal;
    }

    public double impostoTotal(){
        return impostoAnual() * 12;
    }

    // HOOK METHOD
    protected abstract double impostoAnual();
    

    public int getNumNotaFiscal() {
        return numNotaFiscal;
    }

    public void setNumNotaFiscal(int numNotaFiscal) {
        this.numNotaFiscal = numNotaFiscal;
    }

    public double getValorNotaFiscal() {
        return valorNotaFiscal;
    }

    public void setValorNotaFiscal(double valorNotaFiscal) {
        this.valorNotaFiscal = valorNotaFiscal;
    }

}
