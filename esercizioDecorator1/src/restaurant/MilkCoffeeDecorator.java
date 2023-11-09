package restaurant;

public class MilkCoffeeDecorator extends CoffeeDecorator {

    public MilkCoffeeDecorator(CoffeeBeverage decoratedCoffee) {
        super(decoratedCoffee);
    }
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }
    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }
}
