package money;

public class CryptoEtherPaymentAdapter implements CryptroPayment{

    private IPaymentTransaction theTransaction;

    public CryptoEtherPaymentAdapter(IPaymentTransaction theTransaction) {
        this.theTransaction = theTransaction;
    }

    @Override
    public int getAmountOfCoins() {
        return (int) this.theTransaction.getAmount() / 2000;
    }
}
