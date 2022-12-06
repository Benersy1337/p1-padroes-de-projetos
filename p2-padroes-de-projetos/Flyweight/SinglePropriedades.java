package Flyweight;

public class SinglePropriedades implements Propriedades{
    
    private final String nome;

    public SinglePropriedades(String nome) {
        this.nome = nome;
    }

    public String get() {
        return "Propriedades: " + nome;
    }
}
