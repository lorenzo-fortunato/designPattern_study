package builder;

import domain.Pizza;
import domain.Sauce;

import java.util.List;

public class PizzaBuilder {
    private String crust;
    private Sauce sauce;
    private List<String> toppings;

    public PizzaBuilder crust(String crust) {
        this.crust = crust;
        return this;
    }

    public PizzaBuilder sauce(Sauce sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder toppings(List<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    public Pizza build() {
        return new Pizza(crust, sauce, toppings);
    }
}
