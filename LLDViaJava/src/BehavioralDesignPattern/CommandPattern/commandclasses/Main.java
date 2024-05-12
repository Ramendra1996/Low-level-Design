package BehavioralDesignPattern.CommandPattern.commandclasses;

public class Main {
    public static void main(String[] args) {

        BreakMechanism breakMechanism = new BreakMechanism();
        AirSuspensionMechanism airSuspensionMechanism = new AirSuspensionMechanism();
        EngageBreakCommand engageBreakCommand = new EngageBreakCommand(breakMechanism);
        AirSuspensionCommand airSuspensionCommand = new AirSuspensionCommand(airSuspensionMechanism);
        Panel btnPanel = new Panel();
        btnPanel.setCommands(0,airSuspensionCommand);
        btnPanel.setCommands(1,engageBreakCommand);

        //try different button
        btnPanel.liftSuspension();
    }
}
