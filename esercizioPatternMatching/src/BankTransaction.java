public class BankTransaction {
    private double amount;
    private String id;
    private Status status;

    public BankTransaction(double amount, String id, Status status) {
        this.amount = amount;
        this.id = id;
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public String getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public static boolean isTransactionInFlight(Status transactionStatus) {
        switch (transactionStatus) {
            case DONE: {
                return false;
            }
            case CLEARED: {
                return false;
            }
            case GETTING_APPROVED_ON_TARGET_BANK: {
                return true;
            }
            case IN_PROGRESS: {
                return true;
            }
            case INITIATED: {
                return true;
            }
            case REJECTED: {
                return true;
            }
            case RETURNED: {
                return false;
            }
            default: {
                throw new RuntimeException("Missing implementation");
            }
        }
    }

    public static boolean isTransactionInPaid(Status transactionStatus) {
        switch (transactionStatus) {
            case DONE: {
                return true;
            }
            case CLEARED: {
                return true;
            }
            case GETTING_APPROVED_ON_TARGET_BANK: {
                return false;
            }
            case IN_PROGRESS: {
                return false;
            }
            case INITIATED: {
                return false;
            }
            case REJECTED: {
                return false;
            }
            case RETURNED: {
                return false;
            }
            default: {
                throw new RuntimeException("Missing implementation");
            }
        }
    }
}
