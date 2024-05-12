package opps;

public class PloyMain {
    public static void main(String[] args) {
        CirclePoly c = new CirclePoly();
        c.drow();

        doDrowingShap(new ShapePoly());
        doDrowingShap(c);

    }
    public static  void doDrowingShap(ShapePoly s){
        s.drow();
    }
}
