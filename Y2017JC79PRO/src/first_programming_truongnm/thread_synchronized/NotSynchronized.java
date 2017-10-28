package first_programming_truongnm.thread_synchronized;

public class NotSynchronized extends Thread {
	public static void run1() {

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Finish " + Thread.currentThread().getName());
	}

}
