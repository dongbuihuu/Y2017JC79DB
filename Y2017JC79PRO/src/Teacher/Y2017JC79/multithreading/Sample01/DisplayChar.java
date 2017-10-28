package Teacher.Y2017JC79.multithreading.Sample01;

public class DisplayChar implements Runnable {

	private char charToDisplay;
	private int times;

	public DisplayChar(char c, int t) {
		this.charToDisplay = c;
		this.times = t;

	}

	@Override
	public void run() {
		for (int i = 0; i < times; i++) {
			System.out.print(charToDisplay);
		}

	}

}
