package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.MULTITHREADING.THREAD_SYNCHRONIZATION.UsedSynchronization;

class First {
	public synchronized void display(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
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
		fobj.display(msg);
	}
}

public class WithSynchronizations {
	public static void main(String[] args) {
		First fnew = new First();
		Second ss = new Second(fnew, "Welcome");
		Second ss1 = new Second(fnew, "New");
		Second ss2 = new Second(fnew, "Programmer");
	}
}
