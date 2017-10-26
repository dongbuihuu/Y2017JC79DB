package BUIHUUDONG.multithreading.Sample04_SingleThreadPool;

public class Worker implements Runnable {
	private int iTask;

	public Worker(int iTask) {
		this.iTask = iTask;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start. task = " + iTask);
		processTask();
		System.out.println(Thread.currentThread().getName() + " End.");

	}

	private void processTask() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
