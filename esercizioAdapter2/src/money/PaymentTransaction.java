package money;

public class PaymentTransaction implements IPaymentTransaction{
    private double usdDollarAmount;
    private String state;

    public PaymentTransaction(double usdDollarAmount, String state) {
        this.usdDollarAmount = usdDollarAmount;
        this.state = state;
    }

    @Override
    public double getAmount() {
        return usdDollarAmount;
    }
}
