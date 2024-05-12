package creationalDesignPattern.Abstract.mainClass;

import creationalDesignPattern.Abstract.models.DefenderEngine;
import creationalDesignPattern.Abstract.models.IEngine;

public class DefenderFactory  implements  IVehicleFactory{
    @Override
    public IEngine createEngine() {
        System.out.println("Defender ka Engine bana rha hu");
        return  new DefenderEngine();
    }
}
