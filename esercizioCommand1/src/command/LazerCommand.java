package command;

public class LazerCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Lazer got activated!");
    }
}
