package TONMINHSON.Multithreading.Sample1.PoolThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import TONMINHSON.Multithreading.Sample1.Runable.PrintCharacter;
import TONMINHSON.Multithreading.Sample1.Runable.PrintNumber;

public class DemoPoolThread {

	public static void main(String[] args) {
		// ExecutorService executor = Executors.newFixedThreadPool(3);
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(new PrintCharacter('a', 200));
		executor.execute(new PrintCharacter('b', 200));
		executor.execute(new PrintNumber(100));

		executor.shutdown();

	}

}
