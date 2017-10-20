package Teacher.Y2017JC79.oops.generics.wildcardgeneric.example02;

public class Employee {
	private String name;
	private double salary;

	public Employee(String name, double sal) {
		this.name = name;
		this.salary = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
