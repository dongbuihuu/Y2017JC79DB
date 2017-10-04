package Teacher.Y2017JC79.oops.object_and_class;

public class demo_instance {
	public static void main(String[] args) {
		String name1 = new String("Dong");
		String name2 = new String("Dong");
		String name3 = name1;
		// name1 vs name2 có bằng nhau không?
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		System.out.println(name3 == name1);

	}

}
