package StructuralDesignPattern.AdaptorPattern.adaptorClasses;

public class Adaptor implements ICar{

    HotAirBalloon hotAirBalloon;

    public Adaptor(HotAirBalloon balloon){
        this.hotAirBalloon =balloon;
    }

    @Override
    public void start() {
      String gasToBeUsed = hotAirBalloon.gasUsed;
      hotAirBalloon.start(gasToBeUsed);
    }
}
