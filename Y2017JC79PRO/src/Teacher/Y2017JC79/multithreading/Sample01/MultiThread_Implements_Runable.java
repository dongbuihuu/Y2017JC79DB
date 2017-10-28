package Teacher.Y2017JC79.multithreading.Sample01;

public class MultiThread_Implements_Runable {
	public static void main(String[] args) {
		DisplayChar printA = new DisplayChar('a', 500);
		DisplayChar printB = new DisplayChar('b', 550);

		DisplayNumber printN = new DisplayNumber(500);

		Thread t1 = new Thread(printA);
		Thread t2 = new Thread(printB);
		Thread t3 = new Thread(printN);

		t1.start();
		t3.start();
		t2.start();

	}

}
