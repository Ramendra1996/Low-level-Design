package multiTreading;

public class TestSleepMethod  extends Thread{

    public  void run(){
        for (int i=0; i<5;i++){
            try {
                Thread.sleep(500);
                System.out.println(i);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {

        TestSleepMethod t1 = new TestSleepMethod();
        TestSleepMethod t2 = new TestSleepMethod();
        t1.start();
        t2.start();
    }
}
