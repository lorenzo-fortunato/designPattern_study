import state.State;
import transaction.Transaction;

import java.util.ArrayList;
import java.util.List;

public class BankMain {
    public static void main(String[] args) {
        List<Transaction> transactionList = new ArrayList<Transaction>();
        Transaction transaction1 = new Transaction(State.IN_PROGRESS, 200);
        Transaction transaction2 = new Transaction(State.IN_PROGRESS, 200);
        Transaction transaction3 = new Transaction(State.REJECTED, 400);
        Transaction transaction4 = new Transaction(State.DONE, 100);
        transactionList.add(transaction1);
        transactionList.add(transaction2);
        transactionList.add(transaction3);
        transactionList.add(transaction4);

        double amountInProgress = 0;
        for (Transaction bankTransaction : transactionList) {
            if (Transaction.isTransactionInFlight(bankTransaction.getStatus())) {
                amountInProgress += bankTransaction.getAmount();
            }
        }
        System.out.println("Amount in progress: " + amountInProgress);
    }
}
