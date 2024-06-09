package java8Feature;

//write a program to multiply 2 no's using functional interface

public class MultiplyTwoNumber {
    public static void main(String[] args) {
        //lambda expression
        Finterface total =(a,b)->a*b;
        System.out.println(total.multiply(10,5));
    }
}
