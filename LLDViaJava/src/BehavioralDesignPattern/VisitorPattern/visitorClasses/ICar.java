package BehavioralDesignPattern.VisitorPattern.visitorClasses;

public interface ICar {

    //ye bhahut important function hai , double dispatch k point se

    public void accept(ICarVisitor iCarVisitor);


}
