package JAVACORE_TRAINING.OOPS_CONCEPTS.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAYS.COLLECTIONFRAMEWORK.TreeSetExample.NaturalOrderOfCustomClasses;

public class Employee implements Comparable<Employee>{
	private int EmpId;
	private String FullName;
	private double Salary;
	
	public Employee(int EmpId, String FullName, double Salary){
		this.EmpId = EmpId;
		this.FullName = FullName;
		this.Salary = Salary;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return EmpId +" - "+ FullName + " - "+ Salary;
	}	

	@Override
	public int compareTo(Employee o) {
		return this.FullName.compareTo(o.FullName);
	}
}
