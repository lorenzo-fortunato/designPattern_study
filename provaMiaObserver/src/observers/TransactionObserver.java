package observers;

import model.MoneyTransaction;

public class TransactionObserver implements IObserver<MoneyTransaction>{
    @Override
    public void update(MoneyTransaction moneyTransaction) {
        System.out.println("Amount: " + moneyTransaction.getAmount() + " status: " + moneyTransaction.getStatus());
    }
}
