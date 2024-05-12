package creationalDesignPattern.factorypattern.mainClass;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

      //  wrong way to create object
      /*  ScorpioN obj = new ScorpioN();
        obj.driveCar();
        ScorpioClassic obj1 = new ScorpioClassic();
        obj1.driveCar();*/

//        ScorpioFactory factory = new ScorpioFactory();
//        Scorpio car1 = factory.crateScorpio('N');
//        car1.driveCar();

        Collection<Scorpio> list = new ArrayList<>();
        Scorpio car1 = new ScorpioN();
        Scorpio car2 = new ScorpioClassic();
        list.add(car1);
        list.add(car2);

        for (Scorpio car :list){
            car.driveCar();
        }
    }

}
