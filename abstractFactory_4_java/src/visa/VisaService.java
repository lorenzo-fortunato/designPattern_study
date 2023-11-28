package visa;

import creditcard.CreditCardNumberValidator;
import creditcard.CreditCardService;
import creditcard.CreditCardTransaction;

public class VisaService extends CreditCardService {

    public VisaService(CreditCardNumberValidator creditCardNumberValidator) {
        super(creditCardNumberValidator);
    }

    public CreditCardTransaction pay(int creditCardNumber, double amount) {
        if(amount > 50000) {
            throw new VisaLimitException();
        }
        this.validator.validate(creditCardNumber);
        System.out.println("Paying: " + amount + " For credit card: " + creditCardNumber + " with VISA");
        return new VisaTransaction(creditCardNumber, amount);
    }
}
