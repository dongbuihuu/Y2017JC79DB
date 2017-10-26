package BUIHUUDONG.multithreading.Sample01;

public class Multithread_ExtendsThread {
	public static void main(String[] args) {

		TaskFirst task01 = new TaskFirst();
		TaskSecond task02 = new TaskSecond();

		task01.start();
		task02.start();

	}
}

class TaskFirst extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 500; i++) {
				System.out.print("a");

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}

class TaskSecond extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 500; i++) {
				System.out.print("b");

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
