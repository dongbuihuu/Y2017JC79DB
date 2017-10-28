package first_programming_truongnm.thread_extends_thread_class;

public class DisplayCharacter extends Thread {
	private char cChar;
	private int iNumber;

	public DisplayCharacter(char cChar, int iNumber) {
		super();
		this.cChar = cChar;
		this.iNumber = iNumber;
	}

	public void run() {
		for (int i = 0; i < this.iNumber; i++) {
			System.out.print(cChar + " ");
		}
	}

}
