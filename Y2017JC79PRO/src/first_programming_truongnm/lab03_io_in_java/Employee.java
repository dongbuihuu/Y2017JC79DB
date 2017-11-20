package first_programming_truongnm.lab03_io_in_java;

import java.io.Serializable;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Information inf = new Information();
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly input employee's information as below guidance: ");
		System.out.print("ID: ");
		inf.setEmployeeID(sc.nextInt());
		sc.nextLine();
		System.out.print("Name: ");
		inf.setEmployeeName(sc.nextLine());
		System.out.print("Age: ");
		inf.setEmployeeAge(sc.nextInt());
		System.out.print("Salary: ");
		inf.setEmployeeSalary(sc.nextFloat());
		sc.close();
		System.out.println(inf);
	}

}

class Information implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int employeeID;
	private String employeeName;
	private int employeeAge;
	private float employeeSalary;

	public int getEmployeeID() {
		return employeeID;
	}

	public Information() {
		super();
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override

	public String toString() {
		return String.format("ID: %s - Name: %s - Age: %s - Salary: %s ", employeeID, employeeName, employeeAge,
				employeeSalary);

	}

}
