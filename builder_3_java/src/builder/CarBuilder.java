package builder;

import car.Car;
import car.CarType;
import car.Engine;

public class CarBuilder {

    private CarType carType;
    private int seats;
    private String color;
    private int ageOfImmatricolation;
    private Engine engine;

    public CarBuilder setCarType(CarType type) {
        this.carType = type;
        return this;
    }

    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setAgeOfImmatricolation(int age) {
        this.ageOfImmatricolation = age;
        return this;
    }

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public Car build() {
        return new Car(carType, seats, color, ageOfImmatricolation, engine);
    }
}
