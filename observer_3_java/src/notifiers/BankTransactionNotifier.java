package notifiers;

import model.MoneyTransaction;
import observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class BankTransactionNotifier implements INotifier<IObserver<MoneyTransaction>>{
    private List<IObserver<MoneyTransaction>> listOfObserver;

    public BankTransactionNotifier() {
        this.listOfObserver = new ArrayList<IObserver<MoneyTransaction>>();
    }

    @Override
    public void subscribe(IObserver<MoneyTransaction> observer) {
       listOfObserver.add(observer);
    }

    @Override
    public void unsubscribe(IObserver<MoneyTransaction> observer) {
        listOfObserver.remove(observer);
    }

    public void gotUpdateFormBank(MoneyTransaction moneyTransaction) {
        for (IObserver<MoneyTransaction> iObserver : listOfObserver) {
            iObserver.update(moneyTransaction);
        }
    }
}
