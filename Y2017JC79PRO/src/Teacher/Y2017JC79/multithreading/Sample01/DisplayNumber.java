package BUIHUUDONG.multithreading.Sample01;

public class DisplayNumber implements Runnable {
	private int iTimes;

	public DisplayNumber(int t) {
		this.iTimes = t;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < this.iTimes; i++) {
				System.out.print(" " + i);

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
