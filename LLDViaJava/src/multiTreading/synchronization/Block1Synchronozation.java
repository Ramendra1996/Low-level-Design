package multiTreading.synchronization;

class Sender{
    public void SenderMsg(String msg){
        System.out.println("\nSending a Message: "+msg);
        try {
            Thread.sleep(800);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("\n"+msg+ " sent");
    }
}
//A sender class for sending a message using Threads

class SenderWThreads extends Thread{
    private String msg;
    Sender sd;
    //Receiver method to receive a message object and a message to be sent
    SenderWThreads(String m, Sender obj){
        msg =m;
        sd=obj;
    }
    public void run(){
        //checks that only one thread sends a message at a time
        synchronized (sd){
            sd.SenderMsg(msg);
        }
    }
}

public class Block1Synchronozation {
    public static void main(String[] args) {

        Sender sender = new Sender();
        SenderWThreads sender1 = new SenderWThreads("hola",sender);
        SenderWThreads sender2 = new SenderWThreads("Welcome to javatpoint website",sender);
        sender1.start();
        sender2.start();

        try {
           sender1.join();
           sender2.join();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
