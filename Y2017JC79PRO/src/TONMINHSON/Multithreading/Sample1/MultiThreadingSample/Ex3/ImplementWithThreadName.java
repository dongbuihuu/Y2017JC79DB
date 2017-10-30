package TONMINHSON.Multithreading.Sample1.MultiThreadingSample.Ex3;

public class ImplementWithThreadName implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Thread start: " + Thread.currentThread().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thread end: " + Thread.currentThread().getName());

	}

}
