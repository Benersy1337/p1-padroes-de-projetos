package Flyweight;

import java.util.List;
import java.util.ArrayList;

public class Marca implements Propriedades{

    private String nomeMarca;
    private List<Propriedades> propriedades;

    public Marca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
        this.propriedades = new ArrayList<Propriedades>();
    }

    public void add(Propriedades p) {
        propriedades.add(p);
    }

    public String get(){

        String result = new String();

        for(Propriedades prop:propriedades){
            result = result.concat(prop.get()+"\n");
        }

        return result;
     }

     public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    
}
