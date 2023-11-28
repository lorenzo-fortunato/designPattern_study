package command;

public class RoboticArmCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Arm moving the door.");
    }
}
