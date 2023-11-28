package launcher;

import model.MoneyTransaction;
import model.TransactionStatus;
import notifiers.BankTransactionNotifier;
import observers.IObserver;
import observers.MoneyTransferObserver;

public class ApplicationLauncher {
    public static void main(String[] args) {
        MoneyTransaction moneyTransaction = new MoneyTransaction(500, TransactionStatus.PENDING);
        BankTransactionNotifier bankTransactionNotifier = new BankTransactionNotifier();
        IObserver<MoneyTransaction> anObserver = new MoneyTransferObserver();

        bankTransactionNotifier.subscribe(anObserver);
        bankTransactionNotifier.gotUpdateFromBank(moneyTransaction);
        moneyTransaction.setStatus(TransactionStatus.DONE);
        bankTransactionNotifier.gotUpdateFromBank(moneyTransaction);
    }
}
