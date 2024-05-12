package StructuralDesignPattern.proxyPattern.proxyClasses;

public class RCScorpio implements ICar{

    @Override
    public void turnLeft() {
        System.out.println("I am inside turnLeft in scorpio Class");
    }

    @Override
    public void turnRight() {
        System.out.println("I am inside turnRight in scorpio Class");
    }

    @Override
    public void goStraight() {
        System.out.println("I am inside goStraight in scorpio Class");
    }
}
