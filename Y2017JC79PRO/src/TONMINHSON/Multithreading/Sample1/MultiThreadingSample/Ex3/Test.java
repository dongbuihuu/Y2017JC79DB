package TONMINHSON.Multithreading.Sample1.MultiThreadingSample.Ex3;

public class Test {

	public static void main(String[] args) {
		Thread test1 = new Thread(new ImplementWithThreadName(), "Thread 1");
		Thread test2 = new Thread(new ImplementWithThreadName(), "Thread 2");
		Thread test3 = new Thread(new ImplementWithThreadName(), "Thread 3");

		try {
			test1.start();
			test2.start();
			test3.start();
			test1.join();
			test2.join();
			test3.join();
			System.out.println("Finish");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
