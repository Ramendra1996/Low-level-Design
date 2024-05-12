package StructuralDesignPattern.BridgePattern.bridgeClasses;

public class Main {
    public static void main(String[] args) {

        AbstractScorpio scorpio = new ScorpioN(new ScorpioN_Impl_India());
        System.out.println(scorpio.isRightHanded());
    }
}
