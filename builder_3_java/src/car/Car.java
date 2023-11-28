package car;

public class Car {
    private CarType carType;
    private int seats;
    private String color;
    private int ageOfImmatricolation;
    private Engine engine;

    public Car(CarType carType, int seats, String color, int ageOfImmatricolation, Engine engine) {
        this.carType = carType;
        this.seats = seats;
        this.color = color;
        this.ageOfImmatricolation = ageOfImmatricolation;
        this.engine = engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAgeOfImmatricolation() {
        return ageOfImmatricolation;
    }

    public void setAgeOfImmatricolation(int ageOfImmatricolation) {
        this.ageOfImmatricolation = ageOfImmatricolation;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                ", ageOfImmatricolation=" + ageOfImmatricolation +
                ", engine=" + engine +
                '}';
    }
}
