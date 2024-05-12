package StructuralDesignPattern.BridgePattern.bridgeClasses;

public class ScorpioN_Impl_USA extends AbstractScorpioImpl{

    @Override
    boolean isRightHanded() {
        return false;
    }

    @Override
    void printSafetyReq() {
        System.out.println("safety req for US region");
    }
}
