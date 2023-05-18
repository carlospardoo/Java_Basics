package comparator;

import java.util.Comparator;

public class AccountSortByTransferAndName implements Comparator<Account> {

    @Override
    public int compare(Account x, Account y) {

        int transferedCompare = Double.compare(y.getTransferredMoney(), x.getTransferredMoney());

        int nameCompare = x.getAccountName().compareTo(y.getAccountName());

        return (transferedCompare == 0) ? nameCompare : transferedCompare;

    }



}
