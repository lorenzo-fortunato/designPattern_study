package builder;

import domain.Car;
import domain.Engine;

public class CarBuilder {
    private String model;
    private int year;
    private String color;
    private String engineType;

    // chiamati metodi a catena (deriva dal linguaggio C)
    // questo viene fatto al posto dei getter e setter quando viene usato il Design Pattern Builder
    public CarBuilder model(String model) {
        this.model = model;
        return this;    // ogni volta viene ritornato this, che è sempre questo oggetto (questo ti permetterà di concatenare nel main)
    }

    public CarBuilder year(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder engineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public Car build() {
        return new Car(model, year, color, new Engine(engineType, 200));
    }
}
