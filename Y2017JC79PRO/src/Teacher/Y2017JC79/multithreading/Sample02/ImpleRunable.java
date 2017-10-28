package Teacher.Y2017JC79.multithreading.Sample02;

public class ImpleRunable implements Runnable {

	public void run() {
		System.out.println("Thread started" + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread ended" + Thread.currentThread().getName());
	}

	public static void main(String[] str) {
		Thread objT = new Thread(new ImpleRunable(), " Example 03");
		objT.start();
	}
}
