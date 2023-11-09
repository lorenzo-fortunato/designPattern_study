package launcher;

import spaceship.SpaceshipFacade;

public class ApplicationLauncher {
    public static void main(String[] args) {
        // Use the facade design pattern to achieve:
        // -> launchSpaceship to destination
        // -> abortMission
        SpaceshipFacade spaceshipFacade = new SpaceshipFacade();
        spaceshipFacade.startSystems();
        spaceshipFacade.launch("Mars");
        spaceshipFacade.abortMission();
    }
}
