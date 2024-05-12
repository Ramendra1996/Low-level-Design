package StructuralDesignPattern.Flyweight.flyweightClasses;

public class Main {
    public static void main(String[] args) {

        //int[][] locationTejas

        Tejas plane = new Tejas();
        for (int i=0;i<5;i++){
            //fetch src location from location array
            int srcX=5;
            int srcY =10;

            int descX=100;
            int descY = 515;
            int speed = 15;
            System.out.println("Time: "+plane.getTotalTimeToReachDestination(srcX,srcY,descX,descY,speed));

        }
    }
}
