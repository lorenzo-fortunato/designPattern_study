package creditcard;

public class CreditCardTransaction {
    protected int creditCardNumber;
    protected double amount;

    public CreditCardTransaction(int creditCardNumber, double amount) {
        this.creditCardNumber = creditCardNumber;
        this.amount = amount;
    }

    public String getTransactionInformation() {
        return "The transaction for credit card: " + this.creditCardNumber + " with the smount: " + this.amount;
    }
}
