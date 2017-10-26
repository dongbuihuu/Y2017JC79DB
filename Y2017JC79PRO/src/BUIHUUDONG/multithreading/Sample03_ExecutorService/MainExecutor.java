package BUIHUUDONG.multithreading.Sample03_ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import BUIHUUDONG.multithreading.Sample01.DisplayChar;
import BUIHUUDONG.multithreading.Sample01.DisplayNumber;

public class MainExecutor {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);

		executor.execute(new DisplayChar('a', 100));
		executor.execute(new DisplayChar('b', 100));
		executor.execute(new DisplayNumber(100));

	}

}
