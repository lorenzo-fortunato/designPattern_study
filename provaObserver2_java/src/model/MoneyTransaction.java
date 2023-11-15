package model;

public class MoneyTransaction {
    private double amount;
    private TransactionStatus status;

    public MoneyTransaction(double amount, TransactionStatus status) {
        this.amount = amount;
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }
}
