package hookMethod;

public class NotaFiscalTransferencia extends NotaFiscal{

    public NotaFiscalTransferencia(int numNotaFiscal, double valorNotaFiscal) {
        super(numNotaFiscal, valorNotaFiscal);
    }
    
    @Override
    protected double impostoAnual(){
        return this.getValorNotaFiscal() * 0.1;
    }

    
}
