package observer;

import java.util.ArrayList;
import java.util.List;

public class ProdutoNotify implements Observable{

    private String almoxarifado;
    private List<Observer> observers = new ArrayList<Observer>();
   

    public ProdutoNotify(String almoxarifado) {
        super();
        this.almoxarifado = almoxarifado;
        
    }

    public String getAlmoxarifado() {
        return almoxarifado;
    }


    public void setAlmoxarifado(String almoxarifado) {
        this.almoxarifado = almoxarifado;
    }

    public List<Observer> getObservers(){
        return observers;
    }

    @Override
    public void notify(int numEncomenda, String message) {

        for(Observer o : observers){
            if(((Encomenda)o).getNumEncomenda() == numEncomenda){
                o.notify(this, message);
            }
        }
    }

    @Override
    public void addObserver(Observer observer) {
        getObservers().add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        getObservers().remove(observer);
    }

   

    
    

}
