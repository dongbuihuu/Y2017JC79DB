package TONMINHSON.Multithreading.Sample1.WithSynchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public static void main(String[] args) {
		Account acc = new Account();
		ExecutorService executor = Executors.newCachedThreadPool();
		for (int i = 1; i <= 1000; i++) {
			executor.execute(new AddAmount(acc, 1));
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("Balance is: " + acc.getBalance());
	}

}
