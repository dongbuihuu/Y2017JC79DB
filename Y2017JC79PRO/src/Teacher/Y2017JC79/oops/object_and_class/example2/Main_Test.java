package Teacher.Y2017JC79.oops.object_and_class.example2;

import java.util.Scanner;

public class Main_Test {

	public static void main(String[] args) {
		String sTen;
		SinhVien sv1 = new SinhVien();
		Scanner sc = new Scanner(System.in);

		System.out.println("hãy nhập tên:");
		sTen = sc.nextLine();
		sc.close();
		sv1.setsTenSinhVien(sTen);
		sv1.setbTuoi((byte) 34);

		System.out.println("Ten sinh vien: " + sv1.getsTenSinhVien());

	}

}
