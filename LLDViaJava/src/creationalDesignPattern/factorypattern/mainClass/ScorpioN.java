package creationalDesignPattern.factorypattern.mainClass;

import creationalDesignPattern.factorypattern.Models.ScorpioNBodyShell;
import creationalDesignPattern.factorypattern.Models.ScorpioNEngine;

public class ScorpioN  extends Scorpio {

    @Override
    public void makeScorpio() {
        System.out.println("ScorpioN class me hu");
        this.engine = new ScorpioNEngine();
        this.bodyShell = new ScorpioNBodyShell();
    }

    public void driveCar(){
        makeScorpio();
        System.out.println("I am driving a scorpioN");
    }
}
