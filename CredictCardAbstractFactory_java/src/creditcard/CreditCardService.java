package creditcard;

import visa.VisaTransaction;

public abstract class CreditCardService {
    protected CreditCardNumberValidator validator;

    public CreditCardService(CreditCardNumberValidator creditCardNumberValidator) {
        this.validator = creditCardNumberValidator;
    }

    public abstract CreditCardTransaction pay(int creditCardNumber, double amount);
}
