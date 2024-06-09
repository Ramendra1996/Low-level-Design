package java8Feature;

interface Drawable{
    public void draw();
}

public class LambdaExpressionExample {

    public static void main(String[] args) {
        int width=10;

        //without lambda, Drawable implementation using anonymous class
      //  creates an anonymous class that implements the Drawable interface.
        Drawable d=new Drawable(){
            public void draw(){System.out.println("Drawing "+width);}
        };
        d.draw();

        //with lambda
        Drawable d2=()->{
            System.out.println("Drawing "+width);
        };
        d2.draw();
    }
}
