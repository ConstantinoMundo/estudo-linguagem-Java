package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account account = new Account(210876, "Adelia", 250000.00);
		
		Account account1 = new SavingsAccount(210877, "Paula", 300000.00, 0.02);
		
		Account account3 = new BusinessAccount(210878, "Ana", 210000.00, 150000.00);
		
		account.withdraw(200000.00);
		account1.withdraw(200000.00);
		account3.withdraw(40000.00);
		
		System.out.println(account.getBalance());
		System.out.println(account1.getBalance());
		System.out.println(account3.getBalance());

	}

}
