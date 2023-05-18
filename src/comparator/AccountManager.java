package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AccountManager {

    private List<Account> accountList;

    private static AccountManager accountManager;

    private AccountManager() {

    }

    public String addAccount(String[] accountRow){

        boolean existAccount = existAccount(accountRow[2]);

        if(existAccount)
            return "false";

        Account account = new Account(accountRow[2]);

        boolean addedAccount = accountList.add(account);

        if (addedAccount)
            return "true";
        else return "false";

    }

    public String depositAccount(String[] accountRow){

        boolean existAccountOrigin = existAccount(accountRow[2]);

        if(!existAccountOrigin)
            return "false";

        Account account = getAccount(accountRow[2]);
        double deposit = account.deposit(Double.parseDouble(accountRow[3]));

        return String.valueOf(account.getBalance());

    }

    public String transferMoney(String[] accountRow){
        boolean existAccountOrigin = existAccount(accountRow[2]);
        boolean existAccountDestiny = existAccount(accountRow[3]);

        if(!existAccountOrigin || !existAccountDestiny)
            return "false";

        Account origin = getAccount(accountRow[2]);
        Account target = getAccount(accountRow[3]);

        if(origin.getAccountName().equals(target.getAccountName()))
            return "false";

        double originMoney = origin.transferMoney(Double.parseDouble(accountRow[4]));
        if(originMoney == Account.NOT_ENOUGH_MONEY)
            return "false";

        target.deposit(Double.parseDouble(accountRow[4]));
        return String.valueOf(target.getBalance());
    }

    public String getAccountsOrderByTransferAndName(){

        Comparator<Account> c = (x, y) -> {
            int transferedCompare = Double.compare(y.getTransferredMoney(), x.getTransferredMoney());

            int nameCompare = x.getAccountName().compareTo(y.getAccountName());

            return (transferedCompare == 0) ? nameCompare : transferedCompare;
        };

        List<Account> auxAccountList = accountList;
        auxAccountList.sort(c);
//        new AccountSortByTransferAndName()

        String result = auxAccountList.stream()
                .map( x -> x.getAccountName() + "(" + x.getBalance() + ")" )
                .collect(Collectors.joining(", "));

        return result;

    }

    public boolean existAccount(String accountName){
        boolean existAccount = accountList.stream()
                .anyMatch( x -> x.getAccountName().equals(accountName) );

        return existAccount;
    }

    public Account getAccount(String accountName){
        return accountList.stream()
                .filter( x -> x.getAccountName().equals(accountName) )
                .findFirst()
                .get();
    }

    public static AccountManager createAccountManager(){
        if(AccountManager.accountManager == null ){
            AccountManager.accountManager = new AccountManager();
            AccountManager.accountManager.accountList = new ArrayList<>();
        }
        return AccountManager.accountManager;
    }

}
