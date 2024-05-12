package BehavioralDesignPattern.ObserverPattern.observerClasses;

import java.util.ArrayList;
import java.util.List;

public class ATCTower implements  ISubject {

    List<IObserver> observers = new ArrayList<>();


    @Override
    public void addObservers(IObserver iObserver) {
        System.out.println("adding observer in tower");
       observers.add(iObserver);
    }

    @Override
    public void removeObservers(IObserver iObserver) {
        System.out.println("removing observer in tower");
        observers.remove(iObserver);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer:observers){
            //apply some logic and condition
            observer.proceed(this);
        }
    }
}
