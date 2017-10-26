package Teacher.ADVANCED_TOPICs.MULTITHREADING.THREAD_SYNCHRONIZATION.Java_Synchronized_Method;

public class SynchronizedMethod extends Object {
	private String objID;

	public SynchronizedMethod(String objID) {
		this.objID = objID;
	}

	public synchronized void doStuff(int val) {
		print("Entering do Stuff()");
		int num = val * 2 + objID.length();
		print("Local variable num=" + num);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException x) {
		}
		print("Leaving do Stuff()");
		System.out.println();
	}

	public void print(String msg) {
		threadPrint("objID=" + objID + " - " + msg);
	}

	public static void threadPrint(String msg) {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + ": " + msg);
	}

	public static void main(String[] args) {
		SynchronizedMethod objOnlyOne = new SynchronizedMethod("obj01");

		Runnable runA = new Runnable() {
			public void run() {
				objOnlyOne.doStuff(3);
			}
		};
		Thread threadA = new Thread(runA, "Thread A");
		threadA.start();

		try {
			Thread.sleep(200);
		} catch (InterruptedException x) {
		}

		Runnable runB = new Runnable() {
			public void run() {
				objOnlyOne.doStuff(7);
			}
		};
		Thread threadB = new Thread(runB, "Thread B");
		threadB.start();
	}
}
