package BUIHUUDONG.multithreading.Sample04_SingleThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainSingleThreadPool {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			Runnable worker = new Worker(i);
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}

}
