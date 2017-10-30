package TONMINHSON.Multithreading.Sample1.MultiThreadingSample.Ex4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolThread {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(new PrintCharacter("a", 5));
		executor.execute(new PrintCharacter("b", 3));
		executor.execute(new PrintCharacter("c", 2));
		executor.execute(new PrintNumber(4));

		executor.shutdown();
	}

}
