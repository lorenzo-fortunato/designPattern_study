import command.Command;
import command.LazerCommand;
import command.RoboticArmCommand;
import invoke.AssemblyDoorInvoker;

public class MainFunction {
    public static void main(String[] args) {

        // Create the concrete commands and associate them with the receiver
        Command lazerCommand = new LazerCommand();
        Command commandB = new RoboticArmCommand();

        // Execute the command
        AssemblyDoorInvoker invoker = new AssemblyDoorInvoker();
        invoker.setCommand(lazerCommand);
        invoker.executeCommand();

        // Change the command and execute again
        invoker.setCommand(commandB);
        invoker.executeCommand();
    }
}
