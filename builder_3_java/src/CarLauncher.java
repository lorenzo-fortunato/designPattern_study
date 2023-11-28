import builder.CarBuilder;
import builder.EngineBuilder;
import car.Car;
import car.CarType;
import car.Engine;

public class CarLauncher {
    public static void main(String[] args) {
        EngineBuilder engineBuilder = new EngineBuilder();
        Engine myEngine = engineBuilder.setKm(40000)
                .build();
        CarBuilder carBuilder = new CarBuilder();
        Car myCar = carBuilder.setCarType(CarType.SPORTS_CAR)
                .setColor("red")
                .setEngine(myEngine)
                .build();

        System.out.println("Car type: " + myCar.getCarType() + "\n" +
                "Color: " + myCar.getColor() + "\n" +
                "Engine km: " + myEngine.getKm());
        // come puoi vedere non hai avuto bisogno di definire tutti gli argomenti delle due classi (Car e Engine), ma hai potuto costrurne le istanze passo passo con ciò che ti serviva
    }
}
