package transaction;

import state.State;

public class Transaction {
    private State status;
    private double amount;

    public Transaction(State status, double amount) {
        this.status = status;
        this.amount = amount;
    }

    public State getStatus() {
        return status;
    }

    public void setStatus(State status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static boolean isTransactionInFlight(State transactionState) {
        switch(transactionState) {
            case INVIATED:
            case REJECTED:
            case DONE: {
                return false;
            }
            case IN_PROGRESS: {
                return true;
            }
            default: {
                throw new RuntimeException("Missing implementation");
            }
        }
    }
}
