package notifier;

import model.MoneyTransaction;
import observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class BankNotifier {
    private List<IObserver<MoneyTransaction>> listOfObservers;

    public BankNotifier() {
        this.listOfObservers = new ArrayList<IObserver<MoneyTransaction>>();
    }

    public void subscribe(IObserver<MoneyTransaction> observer) {
        this.listOfObservers.add(observer);
    }

    public void unsubscribe(IObserver<MoneyTransaction> observer) {
        this.listOfObservers.remove(observer);
    }

    public void getUpdateFromBank(MoneyTransaction moneyTransaction) {
        for (IObserver<MoneyTransaction> iObserver : listOfObservers) {
            iObserver.update(moneyTransaction);
        }
    }
}
