package StructuralDesignPattern.BridgePattern.bridgeClasses;

public class ScorpioN_Impl_India  extends  AbstractScorpioImpl{


    @Override
    boolean isRightHanded() {
        return true;
    }

    @Override
    void printSafetyReq() {
        System.out.println("safety req for Indian region");
    }
}
