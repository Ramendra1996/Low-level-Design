package BehavioralDesignPattern.corPattern.corClasses;

public class Main {
    public static void main(String[] args) {

        //sbse phele chain create krdo

        AbstractHandler pressureHandler = new PressureIssueHandler(null);
        EngineIssueHandler  engineIssueHandler= new EngineIssueHandler(pressureHandler);

        //request ready kro

        PressureIssueRequest pressureIssueRequest = new PressureIssueRequest();
        engineIssueHandler.handleRequest(pressureIssueRequest);
    }
}
