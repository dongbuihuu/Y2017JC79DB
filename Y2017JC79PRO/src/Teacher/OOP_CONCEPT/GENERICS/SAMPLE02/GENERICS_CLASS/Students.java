package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.GENERICS.SAMPLE02.GENERICS_CLASS;

public class Students {
    private int RollNo;
    private String FullName;
    private int Age;
    private double Mark;

    public Students(int rollNo, String fullName, int age, double mark) {
        super();
        RollNo = rollNo;
        FullName = fullName;
        Age = age;
        Mark = mark;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getMark() {
        return Mark;
    }

    public void setMark(double mark) {
        Mark = mark;
    }
}
