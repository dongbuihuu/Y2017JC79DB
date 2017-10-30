package TONMINHSON.Multithreading.Sample1.MultiThreadingSample.Ex4;

public class PrintNumber implements Runnable {
	private int iLength;

	public PrintNumber(int iLength) {
		super();
		this.iLength = iLength;
	}

	@Override
	public void run() {
		for (int i = 0; i < iLength; i++) {
			System.out.print(i + " ");
		}
	}

}
