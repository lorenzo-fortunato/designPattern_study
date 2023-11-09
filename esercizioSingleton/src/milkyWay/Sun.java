package milkyWay;

public class Sun extends Star{
    private static Sun instance;

    private Sun(String name, int cirumference, double speed, String scientificName) {
        super(name, cirumference, speed, scientificName);
    }

    public static Sun getInstance() {
        if (instance == null) {
            instance = new Sun("Sun", 696342, 1.989e30, "G-type");
        }
        return instance;
    }

}
