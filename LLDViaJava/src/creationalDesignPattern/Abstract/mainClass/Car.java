package creationalDesignPattern.Abstract.mainClass;

import creationalDesignPattern.Abstract.models.IEngine;

public class Car {
    IEngine engine;

    IVehicleFactory carFactory;
    Car(IVehicleFactory factory){
       this.carFactory = factory;
    }

    public  void  driveCar(){
        engine=carFactory.createEngine();
        System.out.println("mill gyi car ");
    }
}
