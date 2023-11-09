package abstractFactory;

import creditcard.CreditCardNumberValidator;
import creditcard.CreditCardService;

public abstract class CreditCardAbstarctFactory {

    public abstract CreditCardService createCreditCardService(CreditCardNumberValidator validator);
    public abstract CreditCardNumberValidator creditCardNumberValidator();

    public static CreditCardAbstarctFactory createByType(String type) {
        if (type.equalsIgnoreCase("visa")) {
            return new VisaCreditCardFactory();
        }
        return new MasterCardFactory();
    }
}
