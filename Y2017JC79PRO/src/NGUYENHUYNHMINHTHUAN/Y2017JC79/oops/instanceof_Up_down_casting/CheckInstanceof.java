package Teacher.Y2017JC79.oops.instanceof_Up_down_casting;

class SuperClass {
}

class SubClass1 extends SuperClass {
}

class SubClass2 extends SubClass1 {
}

public class CheckInstanceof {
	public static void main(String[] args) {
		SuperClass s = new SuperClass();
		SubClass1 s1 = new SubClass1();
		SubClass2 s2 = new SubClass2();

		System.out.println(s1 instanceof SuperClass);
		System.out.println(s2 instanceof SuperClass);
		System.out.println(s instanceof SubClass1);
		System.out.println(s instanceof SubClass2);

		s = s1;
		System.out.println(s instanceof SubClass1);
		System.out.println(s instanceof SubClass2);

		s = s2;
		System.out.println(s instanceof SubClass1);
		System.out.println(s instanceof SubClass2);

	}
}
