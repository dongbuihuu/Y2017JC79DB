package Teacher.ADVANCED_TOPICs.MULTITHREADING.SAMPLE01;

public class ThreadImpl extends Thread {
	public ThreadImpl(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("number i = " + i);
		}
	}

	public static void main(String[] str) {
		ThreadImpl objT = new ThreadImpl("Thread Demo");

		System.out.println("Name: " + objT.getName());
		System.out.println("Uu tien: " + objT.getPriority());
		objT.start();
	}
}
