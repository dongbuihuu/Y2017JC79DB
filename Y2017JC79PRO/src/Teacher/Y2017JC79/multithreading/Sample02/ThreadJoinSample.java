package BUIHUUDONG.multithreading.Sample02;

public class ThreadJoinSample {
	public static void main(String[] str) {
		Thread T01 = new Thread(new ImpleRunable(), "Thread01");
		Thread T02 = new Thread(new ImpleRunable(), "Thread02");
		Thread T03 = new Thread(new ImpleRunable(), "Thread03");

		try {
			T01.start();
			T02.start();
			T03.start();

			T02.join();
			T03.join();
			System.out.println("Xử lý xong toàn bộ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
