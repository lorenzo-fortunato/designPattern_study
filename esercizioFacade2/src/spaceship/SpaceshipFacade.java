package spaceship;

public class SpaceshipFacade {
    public CommunicationSystem communicationSystem;
    public LifeSupportSystem lifeSupportSystem;
    public NavigationSystem navigationSystem;
    public PowerSystem powerSystem;

    public void startSystems() {      // qui hai deciso di creare un metodo per stanziare le classi, ma potevi istanziarle direttamente nel launch() oppure ancora proprio a livello degli attributi
        this.communicationSystem = new CommunicationSystem();
        this.lifeSupportSystem = new LifeSupportSystem();
        this.navigationSystem = new NavigationSystem();
        this.powerSystem = new PowerSystem();
    }
    public void launch(String destination) {
        powerSystem.powerOn();
        communicationSystem.initializeCommunication();
        navigationSystem.setDestination(destination);
        navigationSystem.startNavigation();
    }

    public void abortMission() {
        navigationSystem.problemDuringNavigation();
        lifeSupportSystem.activateLifeSupport();
        communicationSystem.sendMessage("SOS: we're in danger!");
        powerSystem.powerOff();
    }
}
