package first_programming_truongnm.lab02_exception_handling;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Student std = new Student();
		Scanner sc = new Scanner(System.in);

		System.out.println("Vui long nhap thong tin sinh vien: ");
		System.out.print("Ho ten: ");
		std.setHoTen(sc.nextLine());
		System.out.print("MSSV: ");
		std.setMaSV(sc.nextInt());
		System.out.print("Diem: ");
		std.setDiem(sc.nextDouble());
		std.setXepLoai();
		System.out.println(std);
		sc.close();
	}

}
