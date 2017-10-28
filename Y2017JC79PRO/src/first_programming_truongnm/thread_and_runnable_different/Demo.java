package first_programming_truongnm.thread_and_runnable_different;

public class Demo {

	public static void main(String[] args) {
		AExtendsThread A1 = new AExtendsThread();
		Thread A2 = new Thread(new AImplementsRunnable());
		A1.start();
		A2.start();
		A1.run();
		A2.run();

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
