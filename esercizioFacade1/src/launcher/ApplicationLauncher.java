package launcher;

import domain.CPU;
import domain.ComputerFacade;
import domain.HardDrive;
import domain.Memory;

public class ApplicationLauncher {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startComputer();
        computerFacade.executeProgram(50);

        computerFacade.shutdown();
    }
}
