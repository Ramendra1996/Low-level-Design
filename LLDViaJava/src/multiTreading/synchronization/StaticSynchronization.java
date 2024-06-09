package multiTreading.synchronization;

/**
 * if you make any static method as synchronization ,
 * the lock will be on the class not on object
 */

class StaticTable{
    synchronized static  void printTable(int n){
        for (int i=1; i<=5;i++){
            System.out.println(n*i);
            try {
               Thread.sleep(400);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
class StaticMyThread1 extends Thread{
    public void run(){
        StaticTable.printTable(1);
    }
}
class StaticMyThread2 extends  Thread{
    public void run(){
        StaticTable.printTable(10);
    }
}
class StaticMyThread3  extends Thread{
    public void run(){
        StaticTable.printTable(100);
    }
}

class StaticMyThread4 extends  Thread{
    public void run(){
        StaticTable.printTable(1000);
    }
}


public class StaticSynchronization {
    public static void main(String[] args) {
        StaticMyThread1 t1 = new StaticMyThread1();
        StaticMyThread2 t2 = new StaticMyThread2();
        StaticMyThread3 t3 = new StaticMyThread3();
        StaticMyThread4 t4 = new StaticMyThread4();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
