package Teacher.ADVANCED_TOPICs.MULTITHREADING.THREAD_SYNCHRONIZATION.The_Problem_Without_Synchronization;

public class WithoutSynchronization extends Object {
	private String objID;

	public WithoutSynchronization(String objID) {
		this.objID = objID;
	}

	public void doStuff(int val) {
		print("Entering do Stuff()");
		int num = val * 2 + objID.length();
		print("Local variable num=" + num);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException x) {
		}
		print("Leaving do Stuff()");
	}

	public void print(String msg) {
		threadPrint("objID=" + objID + " - " + msg);
	}

	public static void threadPrint(String msg) {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + ": " + msg);
	}

	public static void main(String[] args) {
		WithoutSynchronization objOnlyOne = new WithoutSynchronization("obj01");

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
