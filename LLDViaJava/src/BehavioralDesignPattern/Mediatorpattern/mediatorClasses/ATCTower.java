package BehavioralDesignPattern.Mediatorpattern.mediatorClasses;

import java.util.ArrayList;
import java.util.List;

public class ATCTower {
    //beforehand data hona chahiye saare aurcarft ka

    List<IAircraft> queueForLanding = new ArrayList<>();

    synchronized public void   requestToLand(IAircraft aircraft){
//        queueForLanding.add(aircraft);
//        System.out.println("inside ATCTower");
//
//        if (queueForLanding.size()==0){
//            aircraft.land();
//        }else {
//            queueForLanding.add(aircraft);
//        }
        aircraft.land();
    }
}
