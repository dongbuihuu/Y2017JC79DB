package first_programming_truongnm.thread_method;

public class SleepMethod implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread start: " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Thread end: " + Thread.currentThread().getName());
	}

}
