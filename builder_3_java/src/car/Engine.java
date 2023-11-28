package car;

public class Engine {
    private double volume;
    private double km;
    private String alimentation;

    public Engine(double volume, double km, String alimentation) {
        this.volume = volume;
        this.km = km;
        this.alimentation = alimentation;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public String getAlimentation() {
        return alimentation;
    }

    public void setAlimentation(String alimentation) {
        this.alimentation = alimentation;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", km=" + km +
                ", alimentation='" + alimentation + '\'' +
                '}';
    }
}
