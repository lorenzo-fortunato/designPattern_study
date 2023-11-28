import abstractFactory.CreditCardAbstarctFactory;
import creditcard.CreditCardNumberValidator;
import creditcard.CreditCardService;
import visa.VisaCreditCardNumberValidator;
import visa.VisaService;

public class MainApplication {
    public static void main(String[] args) {
        String creditCardType = args.length > 0 ? args[0] : "Visa";
        CreditCardAbstarctFactory factory = CreditCardAbstarctFactory.createByType(creditCardType);
        CreditCardNumberValidator validator = factory.creditCardNumberValidator();
        CreditCardService service = factory.createCreditCardService(validator);
        service.pay(233232574, 10222);
    }
}
