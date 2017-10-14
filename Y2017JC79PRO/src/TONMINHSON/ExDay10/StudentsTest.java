package TONMINHSON.ExDay10;

import java.util.ArrayList;
import java.util.List;

public class StudentsTest {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student("Nguyen Van A", 8.5));
		students.add(new Student("Nguyen Van C", 5.5));
		students.add(new Student("Nguyen Van B", 4.5));

		// invoke students
		Students stds = new Students();
		stds.setStudents(students);
		int i = 1;
		for (Student student : students) {
			System.out.println("Student " + i + ": " + student.getsFullName() + ", " + student.getdMark());
			i++;
		}

	}

}
