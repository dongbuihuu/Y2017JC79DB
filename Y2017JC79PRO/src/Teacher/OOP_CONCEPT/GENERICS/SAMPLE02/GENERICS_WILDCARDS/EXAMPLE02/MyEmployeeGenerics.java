package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.GENERICS.SAMPLE02.GENERICS_WILDCARDS.EXAMPLE02;

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
