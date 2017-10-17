package Teacher.Y2017JC79.oops.generics.wildcardgeneric.example02;

public class MyEmployeeGenerics<T extends Employee> {
	private final T objEmp;

	public MyEmployeeGenerics(T obj) {
		objEmp = obj;
	}

	public double getSalary() {
		return objEmp.getSalary();
	}

	public boolean isSalaryEqual(MyEmployeeGenerics<?> otherEmp) {
		if (objEmp.getSalary() == otherEmp.getSalary()) {
			return true;
		}
		return false;
	}
}
