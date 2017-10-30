package TONMINHSON.Multithreading.Sample1.Runable;

public class MainTest {

	public static void main(String[] args) {
		// Define tasks to do
		PrintCharacter task1 = new PrintCharacter('a', 100);
		PrintCharacter task2 = new PrintCharacter('b', 100);
		PrintNumber task3 = new PrintNumber(100);

		// run all tasks simultanously
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		Thread t3 = new Thread(task3);

		// start all tasks
		t1.start();
		t2.start();
		t3.start();

		// run procedural process
		// t1.run();
		// t2.run();
		// t3.run();
	}

}
