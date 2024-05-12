package BehavioralDesignPattern.corPattern.corClasses;

public  abstract class AbstractRequest {

    private int requestCode;

    AbstractRequest(int reqCode){
        this.requestCode=reqCode;
    }

    public int getRequestCode(){
        return this.requestCode;

    }
}
