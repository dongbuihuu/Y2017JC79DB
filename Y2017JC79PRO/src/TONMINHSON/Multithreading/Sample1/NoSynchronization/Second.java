package TONMINHSON.Multithreading.Sample1.NoSynchronization;

public class Second implements Runnable {
	private Display disp;
	private String msg;

	public Second(Display disp, String msg) {
		super();
		this.disp = disp;
		this.msg = msg;
	}

	@Override
	public void run() {
		disp.display(msg);
	}

}
