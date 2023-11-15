package domain;

public class Engine {
    private String alimentation;
    private int power;

    public Engine(String alimentation, int power) {
        this.alimentation = alimentation;
        this.power = power;
    }

    public String getAlimentation() {
        return alimentation;
    }

    public void setAlimentation(String alimentation) {
        this.alimentation = alimentation;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
