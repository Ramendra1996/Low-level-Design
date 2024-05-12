package BehavioralDesignPattern.ObserverPattern.observerClasses;

public class Main {
    public static void main(String[] args) {

        ATCTower atcTower = new ATCTower();
        Boeing boeing = new Boeing(atcTower);

        boeing.fly();
    }
}
