package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Account> accountList = new ArrayList<>();

        accountList.add(new BusinessAccount(001, "Samuel",120000.00, 30000.00 ));
        accountList.add(new SavingsAccount(002, "Tino", 2300.00, 0.3));
        accountList.add(new BusinessAccount(003, "Romeo",140000.00, 20000.00 ));
        accountList.add(new SavingsAccount(004, "Cino", 3300.00, 0.1));

        double sum = 0.0;
        for(Account account : accountList){
            sum += account.getBalance();
        }

        for(Account account : accountList){
            account.deposit(1000.00);
        }

        System.out.println("Total soma: " + sum);

        for(Account account : accountList){
            System.out.printf("Update balance for account %s: %.2f%n ", account.getHolder(), account.getBalance() );
        }

    }

}
