package opps;

public class MainClassInheritance {
    public static void main(String[] args) {
//        Car c = new Car("Maruti","800",4,5,"Auto");
//        c.startEngine();
//        c.startAc();
//        c.stopEngine();

        MotorCycle mc = new MotorCycle("splender","Xline",2,"U","soft");
        mc.startEngine();
        mc.wheelie();
        mc.stopEngine();
    }
}
