package Teacher.Y2017JC79.oops.generics.wildcardgeneric.example02;

public class MainAppWildCardsViews {

	public static void main(String a[]) {
		A objA = new A("Mr A", 20000);
		B objB = new B("Mr B", 30000);
		A objC = new A("Mr C", 20000);

		MyEmployeeGenerics<A> empA = new MyEmployeeGenerics<A>(objA);
		MyEmployeeGenerics<B> empB = new MyEmployeeGenerics<B>(objB);
		MyEmployeeGenerics<A> empC = new MyEmployeeGenerics<A>(objC);

		System.out.println("Kết quả? " + empA.isSalaryEqual(empB));
		System.out.println("Kết quả? " + empA.isSalaryEqual(empC));
	}

}
