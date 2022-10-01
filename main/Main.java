package main;

import hookMethod.*;
// import nullObject.*;
// import observer.*;
// import state.*;
// import strategy.*;


// Sistema baseado em uma almoxarifado, aonde é gerenciado os produtos, locações e notas fiscais.

public class Main{

    public static void main(String[] args) {

        NotaFiscal tranorte = new NotaFiscalVenda(789, 500);

        NotaFiscal agroforte = new NotaFiscalTransferencia(521, 500);


        System.out.println("O imposto sob a NF" + tranorte.getNumNotaFiscal() + " de Venda" + " é " + tranorte.impostoTotal());

        System.out.println("O imposto sob a NF" + agroforte.getNumNotaFiscal() + " de Venda" + " é " + agroforte.impostoTotal());
        
    }
}

