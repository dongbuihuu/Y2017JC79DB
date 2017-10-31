package BUIHUUDONG.demo;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// AExtendsThread A1 = new AExtendsThread();
		// Thread A2 = new Thread(new AImplementsRunnable());
		// A1.start();
		// A2.start();
		// A1.run();
		// A2.run();
		AImplementsRunnable ur = new AImplementsRunnable();
		Thread t1 = new Thread(ur);
		Thread t2 = new Thread(ur);
		Thread t3 = new Thread(ur);

		t1.start();
		Thread.sleep(1000);
		t2.start();
		Thread.sleep(1000);
		t3.start();

		AExtendsThread task1 = new AExtendsThread();
		task1.start();
		Thread.sleep(1000);
		AExtendsThread task2 = new AExtendsThread();
		task2.start();

	}

}

class AExtendsThread extends Thread {

	private int counter = 0;

	public void run() {
		counter++;
		System.out.println("Extends Thread: counter = " + counter);
	}
}

class AImplementsRunnable implements Runnable {

	private int counter = 0;

	public void run() {
		counter++;
		System.out.println("Implements Runnable: counter = " + counter);
	}
}
