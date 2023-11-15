package domain;

public class Sauce {
    private String type;
    private boolean isSpicy;
    private int calories;

    public Sauce(String type, boolean isSpicy, int calories) {
        this.type = type;
        this.isSpicy = isSpicy;
        this.calories = calories;
    }

    public String getType() {
        return type;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public int getCalories() {
        return calories;
    }
}
