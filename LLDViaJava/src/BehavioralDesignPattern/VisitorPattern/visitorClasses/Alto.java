package BehavioralDesignPattern.VisitorPattern.visitorClasses;

public class Alto  implements ICar {

    //important function for double dispatch

    @Override
    public void accept(ICarVisitor iCarVisitor) {
      iCarVisitor.visitAlto(this);
    }

}
