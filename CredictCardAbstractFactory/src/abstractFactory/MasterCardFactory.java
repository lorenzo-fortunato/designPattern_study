package abstractFactory;

import creditcard.CreditCardNumberValidator;
import creditcard.CreditCardService;
import mastercard.MasterCardService;

public class MasterCardFactory extends CreditCardAbstarctFactory {
    @Override
    public CreditCardService createCreditCardService(CreditCardNumberValidator validator) {
        return new MasterCardService(validator);
    }

    @Override
    public CreditCardNumberValidator creditCardNumberValidator() {
        return null;
    }
}
