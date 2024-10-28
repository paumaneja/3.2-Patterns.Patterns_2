package observer;

import java.util.ArrayList;
import java.util.List;

public class Agent_Subject {

    private List<Observer> observers = new ArrayList<>();
    private double marketValue;

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
        notifyAllObservers();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        observers.forEach(x -> x.update());
    }
}
