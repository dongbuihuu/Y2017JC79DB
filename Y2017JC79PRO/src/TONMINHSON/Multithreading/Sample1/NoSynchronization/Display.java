package TONMINHSON.Multithreading.Sample1.NoSynchronization;

public class Display {
	public void display(String msg) {
		try {
			System.out.print("[" + msg + "]");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
