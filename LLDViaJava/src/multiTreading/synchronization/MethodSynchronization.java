package multiTreading.synchronization;

class MethodTable{
    synchronized void  printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try {
              Thread.sleep(400);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
class MethodThread1 extends Thread{

    MethodTable t ;
    MethodThread1(MethodTable t){
        this.t= t;
    }
    public void  run(){
        t.printTable(5);
    }
}

class MethodThread2 extends Thread{
    MethodTable t;
    MethodThread2(MethodTable t){
        this.t= t;
    }
    public void run(){
        t.printTable(100);
    }
}
public class MethodSynchronization {
    public static void main(String[] args) {
      MethodTable obj = new MethodTable();
      MethodThread1 t1 = new MethodThread1(obj);
      MethodThread2 t2 = new MethodThread2(obj);
      t1.start();
      t2.start();
    }
}


