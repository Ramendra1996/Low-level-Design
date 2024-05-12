package BehavioralDesignPattern.corPattern.corClasses;

public class PressureIssueHandler  extends AbstractHandler{

    public static  int code  =303;

    public PressureIssueHandler(AbstractHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(AbstractRequest request){
        if(request.getRequestCode() ==code){
            System.out.println("PressureHandler is handing request");
        }else{
            super.handleRequest(request);
        }
    }



}
