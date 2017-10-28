package first_programming_truongnm.thread_implements_runnable_interface;

public class DisplayNumber implements Runnable {
	private int iLength;

	public DisplayNumber(int iLength) {
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
