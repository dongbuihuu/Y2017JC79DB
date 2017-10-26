package BUIHUUDONG.multithreading.Thread_Synchronization.TheProblemSynWithLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
	private static Lock lock = new ReentrantLock();

	private double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		// double newBalance = this.getBalance() + amount;
		lock.lock();
		try {
			double newBalance = balance + amount;
			Thread.sleep(0);
			setBalance(newBalance);

		} catch (InterruptedException e) {
			// TODO: handle exception
		} finally {
			lock.unlock();

		}
	}

}
