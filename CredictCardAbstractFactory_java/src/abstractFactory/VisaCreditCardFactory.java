package abstractFactory;

import creditcard.CreditCardNumberValidator;
import creditcard.CreditCardService;
import visa.VisaCreditCardNumberValidator;
import visa.VisaService;

public class VisaCreditCardFactory extends CreditCardAbstarctFactory {
    @Override
    public CreditCardService createCreditCardService(CreditCardNumberValidator validator) {
        return new VisaService(validator);
    }

    @Override
    public CreditCardNumberValidator creditCardNumberValidator() {
        return new VisaCreditCardNumberValidator();
    }
}
