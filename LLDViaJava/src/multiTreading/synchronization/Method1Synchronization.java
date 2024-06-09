package multiTreading.synchronization;

/**
    program of synchronization method by using anonymous class
 */
class Method1Table{
    synchronized void printTable(int n){
      for (int i=1;i<=5;i++){
          System.out.println(n*i);
          try {
              Thread.sleep(400);
          }catch (Exception ex){
              ex.printStackTrace();
          }
      }
    }
}

public class Method1Synchronization {
    public static void main(String[] args) {
        Method1Table obj = new Method1Table();
        Thread t1 = new Thread(){
            public void run(){
             obj.printTable(5);
            }
        };

        Thread t2 = new Thread(){
          public void run(){
              obj.printTable(100);
          }
        };
        t1.start();
        t2.start();
    }
}
