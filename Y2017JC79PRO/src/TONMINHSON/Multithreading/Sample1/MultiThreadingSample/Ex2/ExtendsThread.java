package TONMINHSON.Multithreading.Sample1.MultiThreadingSample.Ex2;

public class ExtendsThread extends Thread {
	public ExtendsThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("i " + i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
