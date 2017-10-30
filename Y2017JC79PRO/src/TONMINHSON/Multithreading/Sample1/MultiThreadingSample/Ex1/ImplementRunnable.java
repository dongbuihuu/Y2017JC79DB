package TONMINHSON.Multithreading.Sample1.MultiThreadingSample.Ex1;

public class ImplementRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				System.out.println("Times: " + i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}