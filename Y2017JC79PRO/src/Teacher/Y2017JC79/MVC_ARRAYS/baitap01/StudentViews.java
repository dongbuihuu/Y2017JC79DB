package Teacher.Y2017JC79.MVC_ARRAYS.baitap01;

public class StudentViews {

	public static void main(String[] args) {

		// 1. Danh sach cac sinh Vien
		StudentEntity sv01 = new StudentEntity("Nguyen Van A", 12);
		StudentEntity sv02 = new StudentEntity("Nguyen Van B", 2);
		StudentEntity sv03 = new StudentEntity("Nguyen Van C", 7);
		StudentEntity sv04 = new StudentEntity("Nguyen Van D", 8);
		StudentEntity sv05 = new StudentEntity("Nguyen Van D", 2);
		StudentEntity sv06 = new StudentEntity("Nguyen Van D", 55);
		StudentEntity sv07 = new StudentEntity("Nguyen Van D", 2);
		StudentEntity sv08 = new StudentEntity("Nguyen Van D", 99);
		// 2. Dua mot mang cac sinh vien
		// 12, 2, 7, 8, 2, 55, 2, 99
		ArrayObjectEntity objArr = new ArrayObjectEntity();

		StudentEntity[] objListStudent = new StudentEntity[8];
		objListStudent[0] = sv01;
		objListStudent[1] = sv02;
		objListStudent[2] = sv03;
		objListStudent[3] = sv04;
		objListStudent[4] = sv05;
		objListStudent[5] = sv06;
		objListStudent[6] = sv07;
		objListStudent[7] = sv08;

		// 3. dua mang nay vao doi tuong
		objArr.setObjStudent(objListStudent);
		objArr.setbOption((byte) 0);

		StudentController svCon = new StudentController();
		int[] ketqua = svCon.FindIndex(objArr);

		// 4. In ra ngoai
		for (int i : ketqua) {
			System.out.print(String.format("%3d", i));
		}

	}

}
