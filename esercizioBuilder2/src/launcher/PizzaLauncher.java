package launcher;

import builder.PizzaBuilder;
import builder.SauceBuilder;
import domain.Pizza;
import domain.Sauce;

import java.util.ArrayList;
import java.util.List;

public class PizzaLauncher {
    public static void main(String[] args) {
        SauceBuilder sauceBuilder = new SauceBuilder();
        PizzaBuilder pizzaBuilder = new PizzaBuilder();

        List<String> top = List.of("Pepperoni", "Mushrooms");

        Sauce mySauce = sauceBuilder.type("BBQ")
                .isSpicy(true)
                .calories(200)
                .build();
        Pizza myPizza = pizzaBuilder.crust("hard")
                .sauce(mySauce)
                .toppings(top)
                .build();

        System.out.println(myPizza.InfoPizza());
    }
}
