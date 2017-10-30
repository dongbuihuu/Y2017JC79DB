package TONMINHSON.Multithreading.Sample1.WithSynchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AddAmount implements Runnable {
	private static Lock lock = new ReentrantLock();
	private Account acc;
	private double amount;

	public AddAmount(Account acc, double amount) {
		this.acc = acc;
		this.amount = amount;
	}

	@Override
	public void run() {
		// synchronized (acc) {
		// acc.deposit(amount);
		// }
		try {
			lock.lock();
			acc.deposit(amount);
		} catch (Exception e) {

		} finally {
			lock.unlock();
		}

	}

}
