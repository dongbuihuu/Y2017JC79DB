package first_programming_truongnm.thread_method;

public class SleepMain {

	public static void main(String[] args) {
		Thread obj1 = new Thread(new SleepMethod(), "Nguyen Manh Truong");
		Thread obj2 = new Thread(new SleepMethod(), "Tran Bich Tram");
		Thread obj3 = new Thread(new SleepMethod(), "Nguyen Thi Anh Thu");

		obj1.start();
		obj2.start();
		obj3.start();
		try {
			obj1.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			obj2.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
