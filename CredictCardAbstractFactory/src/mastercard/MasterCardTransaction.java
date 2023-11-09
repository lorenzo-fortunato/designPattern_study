package mastercard;

import creditcard.CreditCardTransaction;

public class MasterCardTransaction extends CreditCardTransaction {
    public MasterCardTransaction(int creditCardNumber, double amount) {
        super(creditCardNumber, amount);
    }
}
