package Flyweight;

import java.util.HashMap;

import java.util.Map;

public class PropriedadesFactory {
    
    private static Map<String, SinglePropriedades> props;

    private static void init() {

        props = new HashMap<String, SinglePropriedades>();

        props.put("verde", new SinglePropriedades("Verde"));
        props.put("trator", new SinglePropriedades("Trator"));
        props.put("cervo", new SinglePropriedades("Cervo"));

        props.put("azul", new SinglePropriedades("Azul"));
       

    }

    public static SinglePropriedades get(String nome) {
        if(props == null)
            init();
        
        return props.get(nome);
    }
}
