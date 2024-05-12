package opps;

public class VehicelInheritance {

    public String name;
    public String model;
    public  int noOfTyres;
    VehicelInheritance(){
        this.name = "";
        this.model= "";
        this.noOfTyres = -1;
    }

    VehicelInheritance(String name, String model, int noOfTyres){
        this.name = name;
        this.model= model;
        this.noOfTyres = noOfTyres;
    }

    void startEngine(){
        System.out.printf("Engine  is starting  of %s : %s\n" , name, model);
    }
    void stopEngine(){
        System.out.printf("Engine  is stoping  of %s : %s\n" , name, model);
    }
}
