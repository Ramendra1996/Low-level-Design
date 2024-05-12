package creationalDesignPattern.Singleton.singletonClass;

public class SingletonDCLocking {

    private volatile  static  SingletonDCLocking instance;

    private  SingletonDCLocking(){
        System.out.println("object created");
    }
    synchronized  public static  SingletonDCLocking getInstance(){
        //only instantiate the object when needed

        if(instance == null){
            synchronized (SingletonDCLocking.class){
                if(instance==null){
                    instance = new SingletonDCLocking();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonDCLocking obj1 = SingletonDCLocking.getInstance();
        SingletonDCLocking obj2 = SingletonDCLocking.getInstance();
        Thread th1 = new Thread(()->{SingletonDCLocking.getInstance();});
        Thread th2 = new Thread(()->{SingletonDCLocking.getInstance();});
        th1.start();
        th2.start();
    }
}
