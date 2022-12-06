package main;


import decoratorAndProxy.*;
import fluentInterfaces.*;
import staticFactoryAndSingleton.*;
import commands.*;
import facade.*;
import DoubleDispatch.*;
import DoubleDispatch.Produto;
import Flyweight.*;
import Flyweight.Marca;

public class Main{


    public static void main(String[] args) {


        // FLUENT INTERFACES

        // INFORMAÇÕES DE PRODUTOS E LOCALIZAÇÃO DO MESMO POR PRATELEIRAS

        System.out.println("\n Padrao FLUENT INTERFACES \n");

        System.out.println("=============================================================================================================");

        Prateleira a = new Prateleira().produtos("Correia").quantity(3).locacoes("A5B3");

        Prateleira b = new Prateleira().produtos("Parafuso M13").quantity(4).locacoes("B3C7");

        Prateleira c = new Prateleira().produtos("Filtro").quantity(7).locacoes("C4B3");

        System.out.println("Produto: " + a.getProduto() + " Com " + a.getQuantidade() + " unidades " + " está localizado em " + a.getLocacao());

        System.out.println("Produto: " + b.getProduto() + " Com " + b.getQuantidade() + " unidades " + " está localizado em " + b.getLocacao());

        System.out.println("Produto: " + c.getProduto() + " Com " + c.getQuantidade() + " unidades " + " está localizado em " + c.getLocacao());

        System.out.println("=============================================================================================================");


        // PROXY AND DECORATOR

        // VERIFICANDO SE UMA LOCACAO ESTÁ VAZIA, SE ESTIVER, ADICIONA PRODUTO

        System.out.println("\n Padrao PROXY AND DECORATOR \n");
        
    
        System.out.println("=============================================================================================================");

        System.out.println("\n");

        System.out.println("==================   LOCACAO A     ==================");

        ProdutoDAOInterface locacaoA = new ProdutoDAODecorator();

        System.out.println("\n Adicionando produto na Locacao A \n");

        try {
            locacaoA.addProduto("", "filtro");
        } catch (ProdutoException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\n Recuperando produto na Locacao A \n");

        try {
            locacaoA.getProduto("", "filtro");
        } catch (ProdutoException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\n");

        System.out.println("==================   LOCACAO B     ==================");

        ProdutoDAOInterface locacaoB = new ProdutoDAODecorator();

        System.out.println("\n Adicionando produto na Locacao B \n");

        try {
            locacaoB.addProduto("B2C4", "correia");
        } catch (ProdutoException e) {
            System.err.println("Locacao cheia");
            System.err.println(e.getMessage());
        }

        System.out.println("\n Recuperando produto na Locacao B \n");

        try {
            locacaoB.getProduto("B2C4", "correia");
        } catch (ProdutoException e) {
            System.err.println(e.getMessage());
        }


        System.out.println("\n");

        System.out.println("==================   LOCACAO C     ==================");

        ProdutoDAOInterface locacaoC = new ProdutoDAODecorator();

        System.out.println("\n Adicionando produto na Locacao C \n");

        try {
            locacaoC.addProduto("", "");
        } catch (ProdutoException e) {
            System.err.println("Locacao cheia");
            System.err.println(e.getMessage());
        }

        System.out.println("\n Recuperando produto na Locacao C \n");

        try {
            locacaoC.getProduto("", "");
        } catch (ProdutoException e) {
            System.err.println(e.getMessage());
        }


        System.out.println("=============================================================================================================");

        // STATIC FACTORY AND SINGLETON

        // PROPRIEDADES DE UM ROMANEIO 

        System.out.println("\n Padrao STATIC FACTORY AND SINGLETON \n");


        Romaneio A781 = Romaneio.newRomaneio("FILTRO","A2C2", "CQM20212");

        Romaneio A819 = Romaneio.newCodigoAndProduto("CORREIA","CQM2020");

        Romaneio C987 = Romaneio.newLocacaoAndProduto("OLEO","A3C2");

        System.out.println("No Romaneio A781 temos uma locacao " + A781.getLocacao() + " referente ao produto " + A781.getProduto() + " com o código " + A781.getCodigo());

        System.out.println("No Romaneio A819 temos um código " + A819.getCodigo() + " referente ao produto " + A819.getProduto());

        System.out.println("No Romaneio C987 temos uma locacao " + C987.getLocacao() + " referente ao produto " + C987.getProduto());

    
        System.out.println("=============================================================================================================");

        // COMMANDS

        // "ADICIONANDO" PRODUTO A LOCACAO POR COMANDOS

        System.out.println("\n Padrao COMMANDS \n");

        ExecutorComandos exec = new ExecutorComandos();

        String prateleira = "";

        System.out.println("Produto -> " + prateleira);

        prateleira = exec.fazer(new InserirProduto(prateleira, "FILTRO"));

        System.out.println("Produto -> " + prateleira);

        prateleira = exec.desfazer();

        System.out.println("Produto -> " + prateleira);

        prateleira = exec.refazer();

        System.out.println("Produto -> " + prateleira);

        System.out.println("=============================================================================================================");

        // FACADE

        // "EMISSÃO" DE DOCUMENTOS PELO ALMOXARIFE

        System.out.println("\n Padrao FACADE \n");
        
        
        ControladorAlmoxarifado executa = new ControladorAlmoxarifado();

        executa.emitirNF();

        executa.emitirRequisiçãoOficina();

        executa.emitirRequisiçãoVendas();


        System.out.println("=============================================================================================================");

        // FLYWEIGHT

        // PROPRIEDADES DE UMA MARCA

        System.out.println("\n Padrao FLYWEIGHT \n");


        Marca johndeere = new Marca("John Deere");
        

        johndeere.add(PropriedadesFactory.get("trator"));
        johndeere.add(PropriedadesFactory.get("verde"));
        johndeere.add(PropriedadesFactory.get("cervo"));


        System.out.println("Marca " +johndeere.getNomeMarca() + "\n");

        System.out.println(johndeere.get());

        System.out.println("====================== \n");

        Marca newholland = new Marca("New Holland");
        

        newholland.add(PropriedadesFactory.get("trator"));
        newholland.add(PropriedadesFactory.get("azul"));
        


        System.out.println("Marca " +newholland.getNomeMarca() + "\n");

        System.out.println(newholland.get());

        
        System.out.println("=============================================================================================================");

        // DOUBLEDISPATCH

        // CALCULANDO VALORES DE PRODUTOS DE DOIS SETORES DIFERENTES E ARMAZENANDO EM UM ESTOQUE

        System.out.println("\n Padrao DOUBLE DISPATCH \n");


        Produto of1 = new ProdutoOficina(567, 469);

        Produto cl1 = new ProdutoCliente(550, 769);

        Estoque es1 = new Estoque();
 
        es1.addProduto(of1);

        es1.addProduto(cl1);

        System.out.println("De acordo com os pedidos feitos, tanto na área de venda e oficina, o preço ficou: " + es1.getTotal());

        System.out.println("=============================================================================================================");

    }
}