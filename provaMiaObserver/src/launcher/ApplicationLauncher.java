package launcher;

import model.MoneyTransaction;
import model.TransactionStatus;
import notifier.BankNotifier;
import observers.IObserver;
import observers.TransactionObserver;

public class ApplicationLauncher {
    public static void main(String[] args) {
        MoneyTransaction moneyTransaction = new MoneyTransaction(1000, TransactionStatus.PENDING);
        IObserver<MoneyTransaction> anObserve = new TransactionObserver();
        BankNotifier notifier = new BankNotifier();


        notifier.subscribe(anObserve);
        notifier.getUpdateFromBank(moneyTransaction);
    }
}
