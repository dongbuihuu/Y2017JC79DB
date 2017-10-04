package JAVACORE_TRAINING.XMLMODULES.BAITOAN.MOD01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApps {
	public static void main(String[] args) {
		//1.  Khai báo đối tượng
		List<Student> lisStudent = new ArrayList<>();
		
		//2.
		String sExit = "";
		Scanner sc = null;
		int iCount = 0;
		do{
			sc = new Scanner(System.in);
			System.out.println("- Student: "+ (iCount+1));
			Student objStudent = new Student();
			
			System.out.println("- Id<Int>: ");
			objStudent.setId(sc.nextInt());
			
			System.out.println("- RollNo<String>: ");
			sc.nextLine();
			objStudent.setRollNo(sc.nextLine());
			
			System.out.println("- FullName<String>: ");
			objStudent.setFullName(sc.nextLine());
			
			System.out.println("- Mark<double>: ");			
			objStudent.setMark(sc.nextDouble());
			lisStudent.add(objStudent);
			iCount++;
			
			System.out.println(String.format("- Hiện có: %s Sinh viên trong danh sách!", 
																lisStudent.size()));
			
			System.out.println("- Bạn nhập đã chán chưa? Y/N");
			sc = new Scanner(System.in);
			sExit = sc.nextLine();
		}while(!sExit.toUpperCase().equals("Y"));
		System.out.println("- Tổng số có: "+ lisStudent.size());
	}
}
