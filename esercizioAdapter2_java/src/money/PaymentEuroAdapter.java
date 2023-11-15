package money;

public class PaymentEuroAdapter implements IPaymentTransaction{

    private PaymentTransaction aPaymentTransaction;

    public PaymentEuroAdapter(PaymentTransaction aPaymentTransaction) {
        this.aPaymentTransaction = aPaymentTransaction;
    }


    @Override
    public double getAmount() {
        return aPaymentTransaction.getAmount() * 1.2;
    }
}
