package observers;

import model.MoneyTransaction;

public class MoneyTransferObserver implements IObserver<MoneyTransaction>{
    @Override
    public void update(MoneyTransaction o) {
        System.out.println("There was an update in your Transaction: " + o.getAmount() + " with status: " + o.getStatus());
    }
}
