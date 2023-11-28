package milkyWay;

public class Planet implements InfosToDisplay{
    private String name;
    private double cirumference;
    private double speed;
    private String composition;

    public Planet(String name, double cirumference, double speed, String composition) {
        this.name = name;
        this.cirumference = cirumference;
        this.speed = speed;
        this.composition = composition;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name +
                " Circumference: " + cirumference +
                " Speed: " + speed +
                " Composition: " + composition);
    }
}
