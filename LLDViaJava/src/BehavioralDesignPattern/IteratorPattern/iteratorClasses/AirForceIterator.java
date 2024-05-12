package BehavioralDesignPattern.IteratorPattern.iteratorClasses;

import java.util.LinkedList;
import java.util.List;

public class AirForceIterator  implements CustomIterator {

    //main logic  yaha rahega k kaise different type of data
    //joki airforce k ander hai usko same iterator se traverse kiya ja sake

    List<IAircraft> jets;
    IAircraft[] helis;
    LinkedList<Boeing>cargo;
    int jetsPos =0;
    int helisPos= 0;
    int cargoPos = 0;

    public  AirForceIterator(AirForce airForce){
        jets =airForce.getJets();
        helis= airForce.getHelis();
        cargo= airForce.getCargo();
    }


    @Override
    public IAircraft next() {
        if(helisPos<helis.length){
            return helis[helisPos++];
        }
        if (jetsPos<jets.size()){
            return jets.get(jetsPos++);
        }

        if (cargoPos<cargo.size()){
            return cargo.get(cargoPos++);
        }
        //next element not available
        throw new RuntimeException(" no more element");
    }

    @Override
    public boolean hasNext() {
      return helis.length>helisPos|| jets.size()>jetsPos || cargo.size()>cargoPos;
    }
}
