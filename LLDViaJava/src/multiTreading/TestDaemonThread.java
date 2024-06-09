package multiTreading;

/**
 * Daemon thread in java is a service provider thread that provides service to
 * the user thread ,its life depend on the mercy of user threads
 * when all user thread dies , jvm terminates this thread automatically
 * there are many java daemon thread running automatically e.g-> gc ,finalizer etc
 *
 * points to remember for daemon thread
 * 1->it provides services to user thread for background supporting tasks ,it has no role
 * int life than no serve user thread
 *
 * 2->its life depends on users threads
 *
 * 3-> it is a low priority thread
 */

public class TestDaemonThread extends Thread{

    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread work");
        }else {
            System.out.println("user thread work");
        }
    }
    public static void main(String[] args) {

        TestDaemonThread t1 = new TestDaemonThread();
        TestDaemonThread t2 = new TestDaemonThread();
        TestDaemonThread t3 = new TestDaemonThread();

        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();

    }
}
