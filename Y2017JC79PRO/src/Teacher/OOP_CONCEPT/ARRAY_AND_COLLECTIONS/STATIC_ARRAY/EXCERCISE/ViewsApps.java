package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.STATIC_ARRAY.EXCERCISE;

public class ViewsApps {
	public static void main(String[] args) {
		// 1. Khai báo mảng đối tượng Sinh Viên
		cStudentEntity[] arrStudent;

		// 2. Khởi tạo mảng đối tượng
		arrStudent = new cStudentEntity[3];

		// 3. Tạo ra các đối tượng Sinh Viên
		cStudentEntity objS01 = new cStudentEntity();
		cStudentEntity objS02 = new cStudentEntity();
		cStudentEntity objS03 = new cStudentEntity();

		// 4. Thiết lập các thông tin đầy đủ cho 03 đối tượng SV nói trên
		objS01.setiRollNo(100);
		objS01.setsFullName("Nguyễn Văn A");
		objS01.setdMark(9.5);

		objS02.setiRollNo(200);
		objS02.setsFullName("Trần Thị B");
		objS02.setdMark(7.5);

		objS03.setiRollNo(300);
		objS03.setsFullName("Hoàng Văn C");
		objS03.setdMark(8.5);

		// 5. Đưa 03 đối tượng Sinh viên vào trong mảng đối tượng SV
		arrStudent[0] = objS01;
		arrStudent[1] = objS02;
		arrStudent[2] = objS03;

		//6. Khai báo và khởi tạo controllers
		StudentController objController = new StudentController();
		objController.SortOf(arrStudent, (byte)0);

		// 7. Hiển thị toàn bộ thông tin của Sinh Viên
		for (cStudentEntity objStudent : arrStudent) {
			System.out.println(objStudent);
		}
	}
}
