package mastercard;

import creditcard.CreditCardNumberValidator;
import creditcard.CreditCardService;
import creditcard.CreditCardTransaction;

public class MasterCardService extends CreditCardService {

    public MasterCardService(CreditCardNumberValidator creditCardNumberValidator) {
        super(creditCardNumberValidator);
    }

    @Override
    public CreditCardTransaction pay(int creditCardNumber, double amount) {
        if (amount > 10000 || creditCardNumber < 100000) {
            throw new MasterCardValidation();
        }
        System.out.println("We are paying with mastercard");
        return new MasterCardTransaction(creditCardNumber, amount);
    }
}
