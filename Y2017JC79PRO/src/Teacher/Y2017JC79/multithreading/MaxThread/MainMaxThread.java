package BUIHUUDONG.multithreading.MaxThread;

public class MainMaxThread {

	public static void main(String[] args) {
		int maxValue = 1000000;
		long startTime = System.currentTimeMillis();
		int i = 0;
		try {
			for (i = 0; i < maxValue; i++) {
				if (MaximumThread.shouldPrintMessage(i)) {
					System.out
							.println("Creating thread " + i + " (" + (System.currentTimeMillis() - startTime) + "ms)");
				}
				new MaximumThread(i).start();
			}

		} catch (Throwable e) {
			System.out.println("Error thrown when creating thread " + i);
			e.printStackTrace();

		}
	}

}
