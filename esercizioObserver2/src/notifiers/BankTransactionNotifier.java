package notifiers;

import model.MoneyTransaction;
import observers.IObserver;
import observers.MoneyTransferObserver;

import java.util.ArrayList;
import java.util.List;

public class BankTransactionNotifier {
    private List<IObserver<MoneyTransaction>> listOfObserver;

    public BankTransactionNotifier() {
        this.listOfObserver = new ArrayList<IObserver<MoneyTransaction>>();
    }

    public void subscribe(IObserver<MoneyTransaction> observer) {
        this.listOfObserver.add(observer);
    }

    public void unsubscribe(IObserver<MoneyTransaction> observer) {
        this.listOfObserver.remove(observer);
    }
    
    public void gotUpdateFromBank(MoneyTransaction moneyTransaction) {
        for (IObserver<MoneyTransaction> iObserver : listOfObserver) {
            iObserver.update(moneyTransaction);
        }
    }
}
