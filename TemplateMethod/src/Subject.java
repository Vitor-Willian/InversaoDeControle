import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class Subject {
  
    private List<Observer> observers = new ArrayList<Observer>();
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObserversTemp() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
        Observer obs= it.next();
        obs.updateTemp(this); 
        }
    }

    public void notifyObserversUmi() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
        Observer obs= it.next();
        obs.updateUmi(this); 
        }
    }

    public void notifyObserversPH() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
        Observer obs= it.next();
        obs.updatePH(this); 
        }
    }
    
    }