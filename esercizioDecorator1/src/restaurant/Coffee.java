package restaurant;

public final class Coffee implements CoffeeBeverage {     // con la keyword final impedisci che la classe possa essere estesa

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 1.0;
    }
}
