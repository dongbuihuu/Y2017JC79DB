package TONMINHSON.Practice;

public class UniMembersView {

	public static void main(String[] args) {
		Student student1 = new Student("Micheal", "ST012345", 9.8, (byte) 23, "Transportation");
		Student student2 = new Student("Linda", "ST012645", 7.8, (byte) 22, "IT");
		Student student3 = new Student("Troky", "ST090345", 9.9, (byte) 21, "Business");
		Student student4 = new Student("Tomas", "ST090845", 6.2, (byte) 24, "Design");
		Student student5 = new Student("Jana", "ST012625", 4.9, (byte) 26, "Biology");
		Student student6 = new Student("Francois", "ST012945", 6.7, (byte) 23, "Medical");
		Student student7 = new Student("Samo", "ST064045", 3.7, (byte) 26, "Chemical");
		Student student8 = new Student("Laco", "ST064325", 9.2, (byte) 26, "Chemical");
		Student student9 = new Student("Vincent", "ST064095", 7.4, (byte) 26, "Business");
		Student student10 = new Student("Samo", "ST064045", 3.7, (byte) 28, "IT");

		Student[] studentList = new Student[10];
		studentList[0] = student1;
		studentList[1] = student2;
		studentList[2] = student3;
		studentList[3] = student4;
		studentList[4] = student5;
		studentList[5] = student6;
		studentList[6] = student7;
		studentList[7] = student8;
		studentList[8] = student9;
		studentList[9] = student10;

		Students studentsArray = new Students();
		studentsArray.setStudents(studentList);

		Lecturer lecturer1 = new Lecturer("Colin", "L012345", "Very good", (byte) 56, "Transportation");
		Lecturer lecturer2 = new Lecturer("Radka", "L045695", "Good", (byte) 47, "Transportation");
		Lecturer lecturer3 = new Lecturer("Hogen", "L012325", "Bad", (byte) 35, "IT");
		Lecturer lecturer4 = new Lecturer("England", "L013325", "Very bad", (byte) 40, "Chemical");
		Lecturer lecturer5 = new Lecturer("Honik", "L013465", "Very bad", (byte) 42, "Chemical");

		Lecturer[] lecturerList = new Lecturer[5];
		lecturerList[0] = lecturer1;
		lecturerList[1] = lecturer2;
		lecturerList[2] = lecturer3;
		lecturerList[3] = lecturer4;
		lecturerList[4] = lecturer5;

		Lecturers lecturersArray = new Lecturers();
		lecturersArray.setLecturers(lecturerList);

		UniMembersController controller = new UniMembersController();
		UniMembers uniMembers = new UniMembersController();
		uniMembers.setbMemberType((byte) 0);
		controller.setbOption((byte) 1);

		System.out.println(controller.findBestOrWorstMark(studentList));
		System.out.println(controller.findNumberOfBestWorstStudentsLecturers(studentList));
		System.out.println(controller.findNumbersOfBestWorstStudentsLecturersInDepartments(studentList));
		System.out.println(controller.findBestWorstStudentsLecturers(studentList));
		System.out.println(controller.findDepartmentsWithBestOrWorstStudentsLecturers(studentList));
	}

}
