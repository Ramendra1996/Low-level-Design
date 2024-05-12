package BehavioralDesignPattern.CommandPattern.commandclasses;

public class EngageBreakCommand implements Command{

    BreakMechanism breakMechanism;

    public  EngageBreakCommand(BreakMechanism mechanism){
        this.breakMechanism=mechanism;
    }
    @Override
    public void execute() {

    }
}
