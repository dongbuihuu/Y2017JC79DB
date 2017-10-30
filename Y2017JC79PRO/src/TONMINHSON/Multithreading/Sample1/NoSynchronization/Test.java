package TONMINHSON.Multithreading.Sample1.NoSynchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(new Second(new Display(), "Thread 1"));
		executor.execute(new Second(new Display(), "Thread 2"));
		executor.execute(new Second(new Display(), "Thread 3"));
		executor.execute(new Second(new Display(), "Thread 4"));
		executor.execute(new Second(new Display(), "Thread 5"));
		executor.shutdown();
	}

}
