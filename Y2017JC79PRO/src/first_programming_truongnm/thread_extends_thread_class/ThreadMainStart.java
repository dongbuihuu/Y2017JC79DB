package first_programming_truongnm.thread_extends_thread_class;

public class ThreadMainStart {

	public static void main(String[] args) {
		DisplayCharacter cChar1 = new DisplayCharacter('A', 500);
		DisplayCharacter cChar2 = new DisplayCharacter('B', 500);
		DisplayNumber iNum = new DisplayNumber(500);
		// Extends Thread class doesn't need call Thread method like:
		// Thread c1 = new Thread(cChar1);
		// c1.start();
		cChar1.start();
		cChar2.start();
		iNum.start();
	}

}
