package main;

import hookMethod.*;
import nullObject.*;
// import observer.*;
// import state.*;
// import strategy.*;
import state.Produto;



// Sistema baseado em uma almoxarifado, aonde é gerenciado as prateleiras que contém produtos e locações também as notas fiscais desses produtos.

public class Main{


    public static void main(String[] args) {

        // HOOK METHOD

        // IMPOSTO SOBRE TIPO DE NOTA FISCAL

        System.out.println("\n Padrão HOOK METHOD \n");

        System.out.println("=============================================================================================================");

        NotaFiscal tranorte = new NotaFiscalVenda(789, 500);

        NotaFiscal agroforte = new NotaFiscalTransferencia(521, 500);


        System.out.println("O imposto sob a NF" + tranorte.getNumNotaFiscal() + " de Venda" + " é " + tranorte.impostoTotal());

        System.out.println("O imposto sob a NF" + agroforte.getNumNotaFiscal() + " de Transferência" + " é " + agroforte.impostoTotal());

        System.out.println("=============================================================================================================");


        // NULL OBJECT

        // SIMULAÇÃO DE RECUPERAÇÃO DE DADOS NO "DATABASE", ATRAVÉS DA CLASSE DAO, PORÉM É UMA SIMULAÇÃO PORQUE APENAS UTILIZAMOS UM VETOR.

        System.out.println("\n Padrão NULL OBJECT \n");
        
    
        System.out.println("=============================================================================================================");

        AbstractPrateleira a = PrateleiraDAO.getPrateleira("correia");
        AbstractPrateleira b = PrateleiraDAO.getPrateleira("barra de corte");
        AbstractPrateleira c = PrateleiraDAO.getPrateleira("junta");
        AbstractPrateleira d = PrateleiraDAO.getPrateleira("dedo da faca");

        System.out.println("Produto: " + a.getProduto() + "\nEstá na Locação:" + a.getLocacoes() + "\nPrateleira:" + "A" + a.getLocacoes());
        System.out.println("=============================================================================================================");
        System.out.println("Produto: " + b.getProduto() + "\nEstá na Locação:" + b.getLocacoes() + "\nPrateleira:" + "B" + b.getLocacoes());
        System.out.println("=============================================================================================================");
        System.out.println("Produto: " + c.getProduto() + "\nEstá na Locação:" + c.getLocacoes() + "\nPrateleira:" + "C" + c.getLocacoes());
        System.out.println("=============================================================================================================");
        System.out.println("Produto: " + d.getProduto() + "\nEstá na Locação:" + d.getLocacoes() + "\nPrateleira:" + "D" + d.getLocacoes());

        System.out.println("=============================================================================================================");


        // STATE

        // VERIFICAÇÃO DE QUAL SITUAÇÃO ATUAL O PRODUTO SE ENCONTRA, MUDANDO SEUS ESTADOS

        

        System.out.println("\n Padrão STATE \n");

        Produto produto = new Produto();

        produto.disponivel();
        produto.state();
        produto.requisitado();
        produto.state();
        produto.perdido();
        produto.state();
        produto.perdido();
        produto.state();

        System.out.println("=============================================================================================================");



    }
}

