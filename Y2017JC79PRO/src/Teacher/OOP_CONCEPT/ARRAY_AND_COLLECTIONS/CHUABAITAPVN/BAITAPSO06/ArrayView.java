package Teacher.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.CHUABAITAPVN.BAITAPSO06;

public class ArrayView {
	public static void main(String[] args) {
		// 1. Khai báo mảng đối tượng SV
		StudentEntity[] arrStudent = new StudentEntity[3];
		StudentEntity objS01 = new StudentEntity();
		objS01.setiRollNo(100);
		objS01.setsFullName("Nguyễn Văn A");
		objS01.setdMark(9.5);

		StudentEntity objS02 = new StudentEntity();
		objS02.setiRollNo(200);
		objS02.setsFullName(" Trần Thị B");
		objS02.setdMark(9.5);

		StudentEntity objS03 = new StudentEntity();
		objS03.setiRollNo(300);
		objS03.setsFullName(" Hoàng Văn C");
		objS03.setdMark(9.5);

		// 2. Đưa các đối tượng vào mảng đối tượng
		arrStudent[0] = objS01;
		arrStudent[1] = objS02;
		arrStudent[2] = objS03;

		// 3. Khai báo đối tượng Controller
		ArrayController objController = new ArrayController();
		ArrayEntity objEntity = new ArrayEntity();
		objEntity.setArrStudent(arrStudent);
		objEntity.setbOption((byte) 0);

		int[] arrIndex = objController.FindIndex(objEntity);

		// 4. Duyệt kq và hiển thị
		for (int i : arrIndex) {
			System.out.println("- i = " + i);
		}
	}

}
