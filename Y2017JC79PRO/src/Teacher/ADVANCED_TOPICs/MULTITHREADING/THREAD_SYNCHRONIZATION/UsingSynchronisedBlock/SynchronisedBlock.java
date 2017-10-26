package Teacher.ADVANCED_TOPICs.MULTITHREADING.THREAD_SYNCHRONIZATION.UsingSynchronisedBlock;

class First {
	public void display(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}

	public void HienThi(String msg) {
		System.out.print("{" + msg);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("}");
	}
}

class Second extends Thread {
	String msg;
	First fobj;

	Second(First fp, String str) {
		fobj = fp;
		msg = str;
		start();
	}

	public void run() {
		synchronized (fobj) // Synchronized block
		{
			fobj.display(msg);
		}
		synchronized (fobj) // Synchronized block
		{
			fobj.HienThi(msg);
		}
	}
}

public class SynchronisedBlock {
	public static void main(String[] args) {
		First fnew = new First();
		Second ss = new Second(fnew, "welcome");
		Second ss1 = new Second(fnew, "new");
		Second ss2 = new Second(fnew, "programmer");
	}
}
