package domain;

public class Order {
    private int id;
    private double amount;
    private boolean validity;
    private Status status;

    public Order(int id, double amount, boolean validity, Status status) {
        this.id = id;
        this.amount = amount;
        this.validity = validity;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isValidity() {
        return validity;
    }

    public void setValidity(boolean validity) {
        this.validity = validity;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
