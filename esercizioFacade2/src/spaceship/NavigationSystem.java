package spaceship;

public class NavigationSystem {
    public void initialize() {
        System.out.println("Navigation System: Initializing...");
    }

    public void setDestination(String destination) {
        System.out.println("Navigation System: Setting destination to " + destination);
    }

    public void startNavigation() {
        System.out.println("Navigation System: Starting navigation...");
    }

    public void problemDuringNavigation() {
        System.out.println("Navigation System: Emergency during navigation...");
    }
}
