package creationalDesignPattern.factorypattern.mainClass;

import creationalDesignPattern.factorypattern.Models.ScorpioClassicBodyShell;
import creationalDesignPattern.factorypattern.Models.ScorpioClassicEngine;

public class ScorpioClassic  extends Scorpio {

    @Override
    public void makeScorpio() {
        System.out.println("ScorpioClassic class me hu");
        this.engine = new ScorpioClassicEngine();
        this.bodyShell = new ScorpioClassicBodyShell();
    }

    public  void  driveCar(){
        makeScorpio();
        System.out.println("I am driving scorpioClassic");
    }
}
