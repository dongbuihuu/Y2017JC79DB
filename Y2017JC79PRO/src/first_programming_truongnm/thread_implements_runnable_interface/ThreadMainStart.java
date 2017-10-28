package first_programming_truongnm.thread_implements_runnable_interface;

public class ThreadMainStart {

	public static void main(String[] args) {
		DisplayCharacter cChar1 = new DisplayCharacter('A', 100);
		DisplayCharacter cChar2 = new DisplayCharacter('B', 200);
		DisplayNumber iLength = new DisplayNumber(500);
		// Implements Runnable interface must call Thread class as below
		Thread c1 = new Thread(cChar1);
		Thread c2 = new Thread(cChar2);
		Thread i1 = new Thread(iLength);

		// c1.run();
		// c2.run();
		// i1.run();

		c1.start();
		c2.start();
		i1.start();

	}

}
