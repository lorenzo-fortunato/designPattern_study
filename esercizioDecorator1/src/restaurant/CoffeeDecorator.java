package restaurant;

public class CoffeeDecorator implements CoffeeBeverage {

    protected CoffeeBeverage decoratedCoffee;

    public CoffeeDecorator(CoffeeBeverage decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
