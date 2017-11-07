package first_programming_truongnm.lab01_package_and_interface;

import java.util.Scanner;

public class Student extends Person {

	private int mark;
	private String grade;

	public Student() {
		super();
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void calGrade() {
		if (this.getMark() >= 8) {
			this.setGrade("distinction");
		} else if (this.getMark() >= 7 && this.getMark() < 8) {
			this.setGrade("credit");
		} else if (this.getMark() >= 5 && this.getMark() < 7) {
			this.setGrade("pass");
		} else {
			this.setGrade("fail");
		}
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Kindly input student ID: ");
		super.setId(sc.nextLine());
		System.out.print("Kindly input student name: ");
		super.setName(sc.nextLine());
		System.out.print("Kindly input student age: ");
		super.setAge(sc.nextInt());
		System.out.print("Kindly input student mark: ");
		this.setMark(sc.nextInt());
		sc.close();
	}

	public void display() {
		System.out.print("Grade of the student " + getName() + " is: ");
		System.out.println(getGrade());
	}
}
