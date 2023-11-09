package mastercard;

import creditcard.CreditCardNumberValidator;

public class MasterCreditCardNumberValidator implements CreditCardNumberValidator {
    @Override
    public boolean validate(int creditCardNumber) {
        return false;
    }
}
