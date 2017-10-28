package first_programming_truongnm.thread_extends_thread_class;

public class DisplayNumber extends Thread {
	private int iLength;

	public DisplayNumber(int iLength) {
		super();
		this.iLength = iLength;
	}

	public void run() {
		for (int i = 0; i < this.iLength; i++) {
			System.out.print(i + " ");
		}
	}

}
