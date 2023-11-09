package milkyWay;

public class Star implements InfosToDisplay{
    public String name;
    public double cirumference;
    public double speed;
    public String scientificName;

    public Star(String name, double cirumference, double speed, String scientificName) {
        this.name = name;
        this.cirumference = cirumference;
        this.speed = speed;
        this.scientificName = scientificName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name +
                " Circumference: " + cirumference +
                " Speed: " + speed +
                " Scientific Name: " + scientificName);
    }
}
