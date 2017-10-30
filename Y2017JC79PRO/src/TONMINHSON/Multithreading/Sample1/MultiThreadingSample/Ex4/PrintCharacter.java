package TONMINHSON.Multithreading.Sample1.MultiThreadingSample.Ex4;

public class PrintCharacter implements Runnable {
	private String character;
	private int times;

	public PrintCharacter(String character, int times) {
		super();
		this.character = character;
		this.times = times;
	}

	@Override
	public void run() {
		for (int i = 0; i < this.times; i++) {
			System.out.print(this.character + " ");
		}

	}

}
