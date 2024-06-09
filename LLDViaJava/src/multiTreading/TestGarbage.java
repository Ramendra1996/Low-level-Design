package multiTreading;

/**
 * Garbage collection is process of reclaiming the runtime unused memory automatically .in order words,
 * it is a way to destroy the unused objects
 *
 * Advantage of Garbage Collection
 *
 * 1-> it makes java memory efficient because garbage collector removes the unreferenced
 * objects from heap memory
 *
 * 2-> it is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts
 */


public class TestGarbage {

    public void  finalize(){
        System.out.println("object is garbage collected");
    }
    public static void main(String[] args) {
        TestGarbage s1 = new TestGarbage();
        TestGarbage s2 = new TestGarbage();
        s1= null;
        s2 = null;
        System.gc();
    }
}
