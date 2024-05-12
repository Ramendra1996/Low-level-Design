package BehavioralDesignPattern.IteratorPattern.iteratorClasses;


import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

//        ArrayList<String> companyList = new ArrayList<>();
//        companyList.add("MS");
//        companyList.add("Amazon");
//
//        Iterator<String>itr = companyList.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        AirForce airForce = new AirForce();
        CustomIterator allPlanes = airForce.createIterator();

        while (allPlanes.hasNext()){
            System.out.println(allPlanes.next());
        }
    }
}
