package BehavioralDesignPattern.VisitorPattern.visitorClasses;

public class InsurancePriceVisitor implements ICarVisitor {

    //multiple visit funcation specific to car type  present below

    public void  visitScorpio(Scorpio scorpio){
        System.out.println("I am visiting scorpio");
    }
    public void visitAlto(Alto alto){
        System.out.println("I am visiting alto");
    }
}
