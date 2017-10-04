package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.MVCMODEL.DESIGN_PATTERN_MVC;

import java.util.Scanner;

import javax.swing.JOptionPane;

//Bước 04
public class EmployeeView {

	public EmployeeView() {
	}

	public static void main(String[] args) {
		EmployeeEntity objEmpEntity = new EmployeeEntity();
		EmployeeController objEmpController = new EmployeeController();
		Scanner sc;

		// 1. Đưa ra yêu cầu nhập vào thông tin Sinh viên
		System.out.println("- Mời nhập thông tin SV");
		sc = new Scanner(System.in);
		System.out.println("- RollNo?");
		objEmpEntity.setiRollNo(sc.nextInt());
		System.out.println("- FullName?");
		sc = new Scanner(System.in);
		objEmpEntity.setsFullName(sc.nextLine());
		System.out.println("- Mark?");
		objEmpEntity.setdMark(sc.nextDouble());

		// 2. Khai báo đối tượng của Controller
		boolean isResult = objEmpController.insertEmployee(objEmpEntity);
		// 3.
		if (isResult)
			System.out.println("Thêm thành công!!!");
		else
			System.out.println("Thêm thất bại!!");
	}
}
