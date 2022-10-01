package hookMethod;

public class NotaFiscalVenda extends NotaFiscal {

    public NotaFiscalVenda(int numNotaFiscal, double valorNotaFiscal) {
        super(numNotaFiscal, valorNotaFiscal);
    }

    @Override
    protected double impostoAnual(){
        return this.getValorNotaFiscal() * 0.2;
    }
    
}
