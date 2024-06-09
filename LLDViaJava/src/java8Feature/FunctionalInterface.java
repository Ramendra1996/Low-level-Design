package java8Feature;

import java.util.function.BiConsumer;

@java.lang.FunctionalInterface
interface sayable{
    void say(String msg);

    default  void print(){
        System.out.println("print ");
    }
}
public class FunctionalInterface implements sayable {


    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    @Override
    public void print() {
        sayable.super.print();


    }

    public static void main(String[] args) {
        FunctionalInterface fun= new FunctionalInterface();
        fun.say("hello");
        fun.print();
    }
  /*  //with Lambda
    BiConsumer<Integer,Integer> biConsumer=(a,b)-> System.out.println(a+b);*/



}
