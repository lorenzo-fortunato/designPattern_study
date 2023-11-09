package domain;

public class Car {
    private String model;
    private int year;
    private String color;
    private Engine engine;

    public Car(String model, int year, String color, Engine engine) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getInfo() {
        StringBuilder builder = new StringBuilder();    // anche nello stringBuilder viene utilizzato dietro le quinte il Design Pattern Builder
        builder.append("The car is:").append(this.model);
        builder.append(" The year is:").append(this.year);
        return builder.toString();   // unica differenza con Builder è che in questo punto si usa .toString() al posto di build()
    }
}
