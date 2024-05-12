package BehavioralDesignPattern.corPattern.corClasses;

public class EngineIssueHandler  extends AbstractHandler{
    public static  int code  =302;

    public EngineIssueHandler(AbstractHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(AbstractRequest request){
        if(request.getRequestCode() ==code){
            System.out.println("EngineIssue is handing request");
        }else{
            super.handleRequest(request);
        }
    }
}
