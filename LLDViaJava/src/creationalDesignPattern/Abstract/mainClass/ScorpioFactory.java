package creationalDesignPattern.Abstract.mainClass;

import creationalDesignPattern.Abstract.models.IEngine;
import creationalDesignPattern.Abstract.models.ScorpipoEngine;

public class ScorpioFactory  implements  IVehicleFactory{

    public IEngine createEngine(){
        System.out.println("Scorpio ka engine bana rha hu");

        return new ScorpipoEngine();
    }
}
