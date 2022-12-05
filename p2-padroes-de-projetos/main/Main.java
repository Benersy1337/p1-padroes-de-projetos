package main;


import decoratorAndProxy.*;
import fluentInterfaces.*;
import staticFactoryAndSingleton.*;
import commands.*;
import facade.*;

public class Main{


    public static void main(String[] args) {


        // FLUENT INTERFACES

        // INFORMAÇÕES DE PRODUTOS E LOCALIZAÇÃO DO MESMO POR PRATELEIRAS

        System.out.println("\n Padrão FLUENT INTERFACES \n");

        System.out.println("=============================================================================================================");

        Prateleira a = new Prateleira().produtos("Correia").quantity(3).locacoes("A5B3");

        Prateleira b = new Prateleira().produtos("Parafuso M13").quantity(4).locacoes("B3C7");

        Prateleira c = new Prateleira().produtos("Filtro").quantity(7).locacoes("C4B3");

        System.out.println("Produto: " + a.getProduto() + " Com " + a.getQuantidade() + " unidades " + " está localizado em " + a.getLocacao());

        System.out.println("Produto: " + b.getProduto() + " Com " + b.getQuantidade() + " unidades " + " está localizado em " + b.getLocacao());

        System.out.println("Produto: " + c.getProduto() + " Com " + c.getQuantidade() + " unidades " + " está localizado em " + c.getLocacao());

        System.out.println("=============================================================================================================");


        // PROXY AND DECORATOR

        // VERIFICANDO SE UMA LOCAÇÃO ESTÁ VAZIA, SE ESTIVER, ADICIONA PRODUTO

        System.out.println("\n Padrão PROXY AND DECORATOR \n");
        
    
        System.out.println("=============================================================================================================");

        System.out.println("\n");

        System.out.println("==================   LOCAÇÃO A     ==================");

        ProdutoDAOInterface locacaoA = new ProdutoDAODecorator();

        System.out.println("\n Adicionando produto na Locação A \n");

        try {
            locacaoA.addProduto("", "filtro");
        } catch (ProdutoException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\n Recuperando produto na Locação A \n");

        try {
            locacaoA.getProduto("", "filtro");
        } catch (ProdutoException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\n");

        System.out.println("==================   LOCAÇÃO B     ==================");

        ProdutoDAOInterface locacaoB = new ProdutoDAODecorator();

        System.out.println("\n Adicionando produto na Locação B \n");

        try {
            locacaoB.addProduto("B2C4", "correia");
        } catch (ProdutoException e) {
            System.err.println("Locação cheia");
            System.err.println(e.getMessage());
        }

        System.out.println("\n Recuperando produto na Locação B \n");

        try {
            locacaoB.getProduto("B2C4", "correia");
        } catch (ProdutoException e) {
            System.err.println(e.getMessage());
        }


        System.out.println("\n");

        System.out.println("==================   LOCAÇÃO C     ==================");

        ProdutoDAOInterface locacaoC = new ProdutoDAODecorator();

        System.out.println("\n Adicionando produto na Locação C \n");

        try {
            locacaoC.addProduto("", "");
        } catch (ProdutoException e) {
            System.err.println("Locação cheia");
            System.err.println(e.getMessage());
        }

        System.out.println("\n Recuperando produto na Locação C \n");

        try {
            locacaoC.getProduto("", "");
        } catch (ProdutoException e) {
            System.err.println(e.getMessage());
        }


        System.out.println("=============================================================================================================");

        // STATIC FACTORY AND SINGLETON

        // VERIFICANDO 

        System.out.println("\n Padrão STATIC FACTORY AND SINGLETON \n");


        Romaneio A781 = Romaneio.newRomaneio("A2C2","FILTRO", "CQM20212");

        Romaneio A819 = Romaneio.newCodigoAndProduto("CQM2020","CORREIA");

        Romaneio C987 = Romaneio.newLocacaoAndProduto("C8B7","ÓLEO");

        System.out.println("No Romaneio temos uma locação " + A781.getLocacao() + " referente ao produto " + A781.getProduto() + " com o código " + A781.getCodigo());

        System.out.println("No Romaneio temos um código " + A819.getCodigo() + " referente ao produto " + A819.getProduto());

        System.out.println("No Romaneio temos uma locação " + C987.getLocacao() + " referente ao produto " + C987.getProduto());

    
        System.out.println("=============================================================================================================");

        // COMMANDS

        // "ADICIONANDO" PRODUTO A LOCAÇÃO POR COMANDOS

        System.out.println("\n Padrão COMMANDS \n");

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

        System.out.println("\n Padrão FACADE \n");
        
        
        ControladorAlmoxarifado executa = new ControladorAlmoxarifado();

        executa.emitirNF();

        executa.emitirRequisiçãoOficina();

        executa.emitirRequisiçãoVendas();


        System.out.println("=============================================================================================================");

        // FLYWEIGHT

        // 

        System.out.println("\n Padrão FLYWEIGHT \n");



















        
        System.out.println("=============================================================================================================");

        // DOUBLEDISPATCH

        // 

        System.out.println("\n Padrão DOUBLE DISPATCH \n");
    }
}