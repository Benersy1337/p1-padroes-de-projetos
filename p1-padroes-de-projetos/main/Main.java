package main;

import hookMethod.*;
import nullObject.*;
import observer.*;
import state.*;
import strategy.*;


import java.util.ArrayList;
import java.util.List;



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


        // OBSERVER


        // Almoxarifado Notificando ao vendedor, se a encomenda do seu cliente já está dísponivel ou não.


        System.out.println("\n Padrão OBSERVER \n");


       
        Encomenda e1 = new Encomenda(789, true);
        Encomenda e2 = new Encomenda(123, true);
        Encomenda e3 = new Encomenda(456, false);

        ProdutoNotify prodNotify = new ProdutoNotify("ALMOX");

        prodNotify.addObserver(e1);
        prodNotify.addObserver(e2);
        prodNotify.addObserver(e3);

        Vendedor luan = new Vendedor("Luan");

        System.out.println("Vendedor: " + luan.getName() + "\nPesquisando por todas as Encomendas\n");

        prodNotify.notify(789, "Encomenda Pendente!");

        prodNotify.notify(123, "Encomenda Pendente!");

        prodNotify.notify(456, "Encomenda já entregue!\n");

        prodNotify.removeObserver(e3);

        System.out.println("Vendedor: " + luan.getName() + "\nPesquisando por todas as Encomendas Pendentes\n");

        prodNotify.notify(456,"Notificação Removida!");

        prodNotify.notify(789, "Encomenda Pendente!");

        prodNotify.notify(123, "Encomenda Pendente!");



        System.out.println("=============================================================================================================");



        // STRATEGY

        // Um cliente encomenda algum produto na loja, aonde a loja pode ter aquele item disponível no estoque ou não. Se tiver disponivel, o item vai ter o custo direto da fábrica e vendemos ao nosso preço de venda, 
        // se tiver indisponível, solicitamos a uma empresa tercerizada que tenha o item, porém pagamos o preço de venda dela para assim fazermos o nosso preço de venda, que consequentemente, mais caro que de fábrica.
        // Se a encomenda do produto for da fábrica, será apenas 20% a mais no valor de custo.
        // Se a encomenda do produto for de tercerizadas que também compram de fábrica, será 40% a mais no valor de custo.


        System.out.println("\n Padrão STRATEGY \n");


        Cliente joao = new Cliente("João", "12");

        Vendedor lucas = new Vendedor("Lucas");

        List<Double> encomendasFabrica = new ArrayList<Double>();

        List<Double> encomendasTercerizadas = new ArrayList<Double>();

        encomendasFabrica.add(343.54);
        encomendasFabrica.add(415.17);

        encomendasTercerizadas.add(218.19);
        encomendasTercerizadas.add(1012.18);

        ResultadoEncomenda com20 = new ResultadoEncomenda(joao, lucas, encomendasFabrica, new EncomendaFabrica());

        ResultadoEncomenda com40 = new ResultadoEncomenda(joao, lucas, encomendasTercerizadas, new EncomendaTercerizada());

        System.out.println("Vendedor: " + lucas.getName() + "\nCliente: " + joao.getNome() + "\n" + "\nSua busca pelos produtos ficaram com os seguintes valores abaixo" + "\n");
       
        System.out.println("De Fábrica com 20% " + com20.calcularEncomendaFinal());

        System.out.println("De Empresa Tercerizada com 40% " + com40.calcularEncomendaFinal());


        System.out.println("=============================================================================================================");
        
        


    }
}



