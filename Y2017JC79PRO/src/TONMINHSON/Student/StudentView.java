package TONMINHSON.Student;

public class StudentView {

	public static void main(String[] args) {
		StudentEntity student1 = new StudentEntity("Smith", 9.5);
		StudentEntity student2 = new StudentEntity("John", 8.0);
		StudentEntity student3 = new StudentEntity("Micheal", 7.5);
		StudentEntity student4 = new StudentEntity("Linda", 6.5);

		StudentEntity[] objListStudent = new StudentEntity[4];
		objListStudent[0] = student1;
		objListStudent[1] = student2;
		objListStudent[2] = student3;
		objListStudent[3] = student4;

		ArrayObjectEntity objArr = new ArrayObjectEntity();
		objArr.setObjStudent(objListStudent);
		objArr.setbOption((byte) 1);

		StudentController studentController = new StudentController();
		int[] result = studentController.FindIndex(objArr);
		for (int i : result) {
			System.out.print(String.format("%3d", i));
		}

	}

}
