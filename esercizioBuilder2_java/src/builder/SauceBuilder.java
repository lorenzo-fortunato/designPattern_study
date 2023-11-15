package builder;

import domain.Sauce;

public class SauceBuilder {
    private String type;
    private boolean isSpicy;
    private int calories;

    public SauceBuilder type(String type) {
        this.type = type;
        return this;
    }

    public SauceBuilder isSpicy(boolean isSpicy) {
        this.isSpicy = isSpicy;
        return this;
    }

    public SauceBuilder calories(int calories) {
        this.calories = calories;
        return this;
    }

    public Sauce build() {
        return new Sauce(type, isSpicy, calories);
    }
}
