package first_programming_truongnm.lab03_io_in_java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteObjectToFile {

	public static void main(String[] args) {
		Information emp1 = new Information();
		Information emp2 = new Information();
		Information emp3 = new Information();
		Scanner sc = new Scanner(System.in);

		System.out.print("Employee 01_ID: ");
		emp1.setEmployeeID(sc.nextInt());
		sc.nextLine();
		System.out.print("Employee 01_Name: ");
		emp1.setEmployeeName(sc.nextLine());
		System.out.print("Employee 01_Age: ");
		emp1.setEmployeeAge(sc.nextInt());
		System.out.print("Employee 01_Salary: ");
		emp1.setEmployeeSalary(sc.nextFloat());

		System.out.print("Employee 02_ID: ");
		emp2.setEmployeeID(sc.nextInt());
		sc.nextLine();
		System.out.print("Employee 02_Name: ");
		emp2.setEmployeeName(sc.nextLine());
		System.out.print("Employee 02_Age: ");
		emp2.setEmployeeAge(sc.nextInt());
		System.out.print("Employee 02_Salary: ");
		emp2.setEmployeeSalary(sc.nextFloat());

		System.out.print("Employee 03_ID: ");
		emp3.setEmployeeID(sc.nextInt());
		sc.nextLine();
		System.out.print("Employee 03_Name: ");
		emp3.setEmployeeName(sc.nextLine());
		System.out.print("Employee 03_Age: ");
		emp3.setEmployeeAge(sc.nextInt());
		System.out.print("Employee 03_Salary: ");
		emp3.setEmployeeSalary(sc.nextFloat());
		sc.close();

		ArrayList<Information> arr = new ArrayList<>();
		arr.add(emp1);
		arr.add(emp2);
		arr.add(emp3);
		System.out.println(arr);

		try {

			FileOutputStream fout = new FileOutputStream("E:\\employee.dat");
			ObjectOutputStream objOut = new ObjectOutputStream(fout);
			objOut.writeObject(arr);
			// objOut.flush();
			objOut.close();
			fout.close();
			System.out.println("Success...");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
