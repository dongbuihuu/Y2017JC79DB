package TONMINHSON.Multithreading.Sample1.MultiThreadingSample.Ex1;

public class Ex1Test {

	public static void main(String[] args) {
		Thread objT1 = new Thread(new ImplementRunnable());
		Thread objT2 = new Thread(new ImplementRunnable());
		Thread objT3 = new Thread(new ImplementRunnable());
		objT1.start();
		objT2.start();
		objT3.start();

	}

}
