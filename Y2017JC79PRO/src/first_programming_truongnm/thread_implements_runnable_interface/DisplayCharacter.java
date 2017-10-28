package first_programming_truongnm.thread_implements_runnable_interface;

public class DisplayCharacter implements Runnable {

	private char cChar;
	private int iTime;

	public DisplayCharacter(char cChar, int iTime) {
		super();
		this.cChar = cChar;
		this.iTime = iTime;
	}

	@Override
	public void run() {
		for (int i = 0; i < this.iTime; i++) {
			System.out.print(cChar + " ");
		}

	}

}
