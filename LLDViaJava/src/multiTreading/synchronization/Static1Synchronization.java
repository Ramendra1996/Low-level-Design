package multiTreading.synchronization;

class Static1Table{
    synchronized static void printTable(int n){
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

public class Static1Synchronization {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                Static1Table.printTable(1);
            }
        };

        Thread t2 = new Thread(){
          public void run(){
              Static1Table.printTable(10);
          }
        };

        Thread t3 = new Thread(){
          public void run(){
              Static1Table.printTable(100);
          }
        };

        Thread t4 = new Thread(){
          public void run(){
              Static1Table.printTable(1000);
          }
        };
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
