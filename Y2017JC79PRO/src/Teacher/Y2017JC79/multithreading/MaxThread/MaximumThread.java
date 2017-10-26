package BUIHUUDONG.multithreading.MaxThread;

public class MaximumThread extends Thread {
	private int numOfThread; // Số lượng thread cần đếm

	public MaximumThread(int numOfThread) {
		this.numOfThread = numOfThread;
	}

	@Override
	public void run() {
		if (shouldPrintMessage(numOfThread)) {
			System.out.println("Thread no. " + numOfThread + " started.");
		}
		try {
			Thread.sleep(Long.MAX_VALUE);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static boolean shouldPrintMessage(int i) {
		return i % 10000 == 0;
	}

}
