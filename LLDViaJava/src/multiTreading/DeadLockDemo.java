package multiTreading;

/**
 * DeadLock in java is a part of multiThreading. DeadLock can occur in a situation
 * when a thread is waiting for an object lock,
 * that is acquired by another thread and second thread is waiting
 * for an object lock that is acquired by first thread since,both threads are waiting for each
 * other to release the lock ,the condition is called deadlock
 */
public class DeadLockDemo {
    public static void main(String[] args) {
        final  String resource1 ="ratan jaiswal";
        final  String resource2 ="vimal jaiswal";
        //t1 tries to lock resource1 then resource2
        Thread t1 = new Thread(){
            public void run(){
                synchronized (resource1){
                    System.out.println("Thread1: locked resource1");
                    try {
                        Thread.sleep(100);
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                    synchronized (resource2){
                        System.out.println("Thread1 : locked resource2");
                    }
                }
            }
        };
        //t2 tries to lock resource2 then resource1
        Thread t2 = new Thread(){
            public void run(){
                synchronized (resource2){
                    System.out.println("Thread2; locked resource2");

                    try {
                        Thread.sleep(100);
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }

                    synchronized (resource1){
                        System.out.println("Thread2: locked resource 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
