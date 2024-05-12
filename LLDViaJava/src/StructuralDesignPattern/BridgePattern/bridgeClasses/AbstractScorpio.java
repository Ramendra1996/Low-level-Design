package StructuralDesignPattern.BridgePattern.bridgeClasses;

public  abstract class AbstractScorpio {
    //bridge
    AbstractScorpioImpl scorpioImpl;

    public  AbstractScorpio(AbstractScorpioImpl sc){
        this.scorpioImpl = sc;
    }

    abstract boolean isRightHanded();
    abstract  void  printSafetyReq();

}
