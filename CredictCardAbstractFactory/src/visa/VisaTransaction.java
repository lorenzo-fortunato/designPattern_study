package visa;

import creditcard.CreditCardTransaction;

public class VisaTransaction extends CreditCardTransaction {
    public VisaTransaction(int creditCardNumber, double amount) {
        super(creditCardNumber, amount);
    }
}
