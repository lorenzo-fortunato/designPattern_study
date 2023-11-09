package domain;

import java.util.List;

public class Pizza {
    private String crust;
    private Sauce sauce;
    private List<String> toppings;

    public Pizza(String crust, Sauce sauce, List<String> toppings) {
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public String getCrust() {
        return crust;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public String InfoPizza() {
        StringBuilder builder = new StringBuilder();
        builder.append("The crust is: ").append(this.crust);
        builder.append(" The sauce is: ").append(this.sauce.getType());
        builder.append(" The toppings are:").append(this.toppings);
        return builder.toString();
    }
}
