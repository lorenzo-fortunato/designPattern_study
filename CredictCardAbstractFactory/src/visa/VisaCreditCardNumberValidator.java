package visa;

import creditcard.CreditCardNumberValidator;

public class VisaCreditCardNumberValidator implements CreditCardNumberValidator {
    public boolean validate(int creditCardNumber) {
        return true;
    }
}
