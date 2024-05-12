package BehavioralDesignPattern.VisitorPattern.visitorClasses;

public class Scorpio  implements ICar {

    @Override
    public void accept(ICarVisitor iCarVisitor) {
        //imp

        iCarVisitor.visitScorpio(this);
    }
}
