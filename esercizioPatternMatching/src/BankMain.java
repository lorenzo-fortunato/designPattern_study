import java.util.ArrayList;
import java.util.List;

public class BankMain {

    private static List<BankTransaction> getSetOfData() {
        List<BankTransaction> list = new ArrayList<BankTransaction>();
        list.add(new BankTransaction(100, "The id 1231", Status.IN_PROGRESS));
        list.add(new BankTransaction(100, "The id 1231", Status.INITIATED));
        list.add(new BankTransaction(300, "The id 1231", Status.CLEARED));
        list.add(new BankTransaction(300, "The id 1231", Status.DONE));
        return list;
    }

    public static void main(String[] args) {
        List<BankTransaction> list = BankMain.getSetOfData();
        double amountInProgress = 0;
        double amountDone = 0;
        for (BankTransaction bankTransaction : list) {
            if (BankTransaction.isTransactionInFlight(bankTransaction.getStatus())) {
                amountInProgress += bankTransaction.getAmount();
            }
            if (BankTransaction.isTransactionInPaid(bankTransaction.getStatus())) {
                amountDone += bankTransaction.getAmount();
            }
        }
        System.out.println("Amount in progress: " + amountInProgress );
        System.out.println("Amount done and paied: " + amountDone );
    }
}
