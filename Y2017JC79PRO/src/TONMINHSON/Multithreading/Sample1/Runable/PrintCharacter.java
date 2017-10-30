package TONMINHSON.Multithreading.Sample1.Runable;

public class PrintCharacter implements Runnable {
	private char itemPrint;
	private int times;

	public PrintCharacter(char itemPrint, int times) {
		super();
		this.itemPrint = itemPrint;
		this.times = times;
	}

	@Override
	public void run() {
		for (int i = 0; i < times; i++) {
			System.out.print(itemPrint + " ");
			Thread.yield();
		}

	}

}
