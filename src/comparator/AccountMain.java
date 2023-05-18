package comparator;

import java.util.Arrays;

public class AccountMain {

    public static void main(String[] args) {

        AccountManager manager = AccountManager.createAccountManager();

        String[][] data = {
                {"ADD", "1", "account1"},
                {"ADD", "2", "account2"},
                {"ADD", "3", "account3"},
                {"DEPOSIT", "4", "account1", "5000"},
                {"DEPOSIT", "5", "account2", "3500"},
                {"DEPOSIT", "6", "account3", "1200"},
                {"TRANSFER", "7", "account2", "account1", "2000"},
                {"TRANSFER", "8", "account2", "account3", "1500"},
                {"TRANSFER", "9", "account2", "account3", "1500"},
                {"SHOW", "10"},
        };

        String[] printed = new String[data.length];
        int i = 0;

        for(String[] row : data){
            switch (row[0]){
                case "ADD":
                    printed[i++] = manager.addAccount(row);
                    break;
                case "DEPOSIT":
                    printed[i++] = manager.depositAccount(row);
                    break;
                case "TRANSFER":
                    printed[i++] = manager.transferMoney(row);
                    break;
                case "SHOW":
                    printed[i++] = manager.getAccountsOrderByTransferAndName();
                    break;
            }
        }

        Arrays.asList(printed).forEach(System.out::println);

    }
}
