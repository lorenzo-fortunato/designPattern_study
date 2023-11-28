package observers;

import model.MoneyTransaction;

public class MoneyTransferObserver implements IObserver<MoneyTransaction>{
    @Override
    public void update(MoneyTransaction e) {
        System.out.println("There was an update in your Transaction: " + e.getAmount() + " with status: " + e.getStatus());
    }
}
