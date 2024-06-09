package multiTreading.synchronization;
class BlockTable{
    void printTable(int n){
        synchronized (this){
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
}

class BlockMyThread1 extends Thread{
    BlockTable t;
    BlockMyThread1(BlockTable t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}

class  BlockMyThread2 extends Thread{
    BlockTable t;
    BlockMyThread2(BlockTable t){
        this.t=t;
    }
    public  void  run(){
        t.printTable(100);
    }
}
public class BlockSynchronization {
    public static void main(String[] args) {
       BlockTable t = new BlockTable();
       BlockMyThread1 t1 = new BlockMyThread1(t);
       BlockMyThread2 t2 = new BlockMyThread2(t);
       t1.start();
       t2.start();
    }
}
