package TONMINHSON.Multithreading.Sample1.WithSynchronization;

public class Account {
	private double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
		this.setBalance(balance);
	}
}
