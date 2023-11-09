package launcher;

import builder.CarBuilder;
import domain.Car;
import domain.Engine;

public class ApplicationLauncher {
    public static void main(String[] args) {
       CarBuilder carBuilder = new CarBuilder();
       carBuilder.model("Seat Ibiza").year(2000).color("red");

       Car car = carBuilder.build();
       System.out.println(car.getInfo());
    }
}
