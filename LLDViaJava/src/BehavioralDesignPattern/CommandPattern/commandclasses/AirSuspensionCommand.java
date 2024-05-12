package BehavioralDesignPattern.CommandPattern.commandclasses;

public class AirSuspensionCommand implements Command{

    AirSuspensionMechanism  airSuspensionMechanism;

    public  AirSuspensionCommand(AirSuspensionMechanism mechanism ){

        this.airSuspensionMechanism=mechanism;
    }
    @Override
    public void execute() {
        airSuspensionMechanism.liftSuspension();
    }
}
