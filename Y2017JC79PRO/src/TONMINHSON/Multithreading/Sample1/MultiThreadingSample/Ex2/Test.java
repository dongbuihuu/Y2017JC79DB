package TONMINHSON.Multithreading.Sample1.MultiThreadingSample.Ex2;

public class Test {

	public static void main(String[] args) {
		ExtendsThread test1 = new ExtendsThread("Demo1");
		ExtendsThread test2 = new ExtendsThread("Demo1");
		ExtendsThread test3 = new ExtendsThread("Demo1");

		test1.start();
		test2.start();
		test3.start();

	}

}
