package model.entities;

import model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;

	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amout) {
		balance += amout;
	}

	public void withdraw(Double amout) {
		balance -= amout;
		if (amout > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}

		if (balance < 0.00) {
			throw new DomainException(" Not enough balance");
		}
	}

	@Override
	public String toString() {
		return "New balance: " + String.format("%.2f", balance);
	}

}
