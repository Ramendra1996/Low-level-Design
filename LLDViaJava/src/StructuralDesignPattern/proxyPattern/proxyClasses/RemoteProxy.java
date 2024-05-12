package StructuralDesignPattern.proxyPattern.proxyClasses;

public class RemoteProxy  implements ICar{

    RCScorpio scorpio = new RCScorpio();
    @Override
    public void turnLeft() {
        System.out.println("I am inside turnLeft in remote Class");
        scorpio.turnLeft();
    }

    @Override
    public void turnRight() {
        System.out.println("I am inside turnRight in scorpio Class");
        scorpio.turnRight();
    }

    @Override
    public void goStraight() {
        System.out.println("I am inside go Straight in scorpio Class");
        scorpio.goStraight();
    }
}
