package creationalDesignPattern.factorypattern.mainClass;

import creationalDesignPattern.factorypattern.Models.IBodyShell;
import creationalDesignPattern.factorypattern.Models.IEngine;
import creationalDesignPattern.factorypattern.Models.ScorpioBodyShell;
import creationalDesignPattern.factorypattern.Models.ScorpioEngine;

public class Scorpio {

    IEngine engine;
    IBodyShell bodyShell;

    public  void  makeScorpio(){
        System.out.println("Scorpio class me hu");
        this.engine = new ScorpioEngine();
        this.bodyShell = new ScorpioBodyShell();
    }
    public void driveCar(){
        makeScorpio();
        System.out.println("I am inside parent class");
    }
}
