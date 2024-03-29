package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account account = new Account(20876, "Mundo", 20000.00);
		BusinessAccount businessAccount = new BusinessAccount(01, "Mateus", 0.00, 5000.00);
		SavingsAccount savingsAccount = new SavingsAccount(02, "Lucas", 0.00, 0.02);

		// Upcasting

		Account account1 = businessAccount;
		Account account2 = new BusinessAccount(03, "Joz", 0.00, 1000.00);
		Account account3 = savingsAccount;

		// Downcasting

		BusinessAccount businessAccount1 = (BusinessAccount) account2;
		businessAccount.loan(250.00);

		// Instanceof
		
		if(account3 instanceof BusinessAccount) {
			BusinessAccount businessAccount2 = (BusinessAccount)account3;
			businessAccount2.loan(3000.00);
			System.out.println("Loan");
		}
		if(account3 instanceof SavingsAccount) {
			SavingsAccount savingsAccount1 = (SavingsAccount)account3;
			savingsAccount.updateBalance();
			System.out.println("Update balance");
		}
	}

}
