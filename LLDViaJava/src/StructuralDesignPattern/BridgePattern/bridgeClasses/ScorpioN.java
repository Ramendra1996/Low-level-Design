package StructuralDesignPattern.BridgePattern.bridgeClasses;

public class ScorpioN extends AbstractScorpio {


    public ScorpioN(AbstractScorpioImpl scorpioImpl) {
        super(scorpioImpl);
    }

    @Override
    boolean isRightHanded() {
        return scorpioImpl.isRightHanded();
    }

    @Override
    void printSafetyReq() {
          scorpioImpl.printSafetyReq();
    }
}
