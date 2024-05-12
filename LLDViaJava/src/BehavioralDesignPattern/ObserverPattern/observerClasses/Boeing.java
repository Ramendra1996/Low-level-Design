package BehavioralDesignPattern.ObserverPattern.observerClasses;

public class Boeing  implements  IAircraft ,IObserver{

    ISubject tower;

   public Boeing(ISubject iSubject){
       this.tower=iSubject;
    }

    @Override
    public void fly() {
       tower.addObservers(this);
        System.out.println("Boeing flying");
    }

    @Override
    public void land() {
     //land krne ke baad unsubscribe the subject
        tower.removeObservers(this);
    }

    @Override
    public void proceed(Object newState) {
        //custom logic
        System.out.println("I am executing the proceed method of aircraft");
    }
}
