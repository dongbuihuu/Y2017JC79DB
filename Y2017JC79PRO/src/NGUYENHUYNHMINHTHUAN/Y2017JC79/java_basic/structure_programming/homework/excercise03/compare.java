package Teacher.Y2017JC79.java_basic.structure_programming.homework.excercise03;

public class compare {

	public static void main(String[] args) {
		String s1;
		s1 = "Nguyen Van A"; // String s1 = new String("Nguyen Van A")

		String s2 = "Tran Thi C";

		// before
		System.out.println("Chuoi S1(truoc) la: " + s1);
		System.out.println("Chuoi S2(truoc) la: " + s2);
		swap(s1, s2);
		System.out.println("Chuoi S1(sau) la: " + s1);
		System.out.println("Chuoi S2(sau) la: " + s2);

	}

	public static void swap(String n1, String n2) {
		String temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("Chuoi S1(trong) la: " + n1);
		System.out.println("Chuoi S2(trong) la: " + n2);

	}
}
