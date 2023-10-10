package application;

import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		
		BusinessAccount account = new BusinessAccount(8010, "Constantino Mundo", 200000.00, 250.0);
		
		System.out.println(account.getBalance());
	}

}
