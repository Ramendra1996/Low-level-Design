package BehavioralDesignPattern.ObserverPattern.observerClasses;

public interface ISubject {
    void addObservers(IObserver iObserver);
    void removeObservers(IObserver iObserver);
    void notifyObservers();


}

