package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.GENERICS.SAMPLE02.GENERICS_WILDCARDS.EXAMPLE02;

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
