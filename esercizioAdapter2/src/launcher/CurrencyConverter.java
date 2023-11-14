package launcher;

import money.CryptoEtherPaymentAdapter;
import money.PaymentEuroAdapter;
import money.PaymentTransaction;

public class CurrencyConverter {
    public static void main(String[] args) {
        PaymentTransaction payment = new PaymentTransaction(20003.3, "done");
        PaymentEuroAdapter adapter = new PaymentEuroAdapter(payment);
        CryptoEtherPaymentAdapter cryptoPayment = new CryptoEtherPaymentAdapter(payment);
        System.out.println("I exchange: " + payment.getAmount() + " for the following coins: " + cryptoPayment.getAmountOfCoins());

        System.out.println("The transaction was paid " + adapter.getAmount() + " EUROs");
    }
}
