package first_programming_truongnm.threadpooldemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import first_programming_truongnm.multithreadingextendrunable.PrintCharacter;
import first_programming_truongnm.multithreadingextendrunable.PrintNumber;

public class DemoPoolThread {

	public static void main(String[] args) {
		// ExecutorService executor = Executors.newFixedThreadPool(3);
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(new PrintCharacter('a', 200));
		executor.execute(new PrintCharacter('b', 200));
		executor.execute(new PrintNumber(200));
		executor.shutdown();

	}

}
