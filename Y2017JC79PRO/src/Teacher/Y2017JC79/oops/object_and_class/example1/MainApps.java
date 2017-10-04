package Teacher.Y2017JC79.oops.object_and_class.example;

public class MainApps {

	public static void main(String[] args) {
		// 1. Khai báo ra các đối tượng
		// Cú pháp:
		// <Lớp đối tượng> <tên đối tượng>;
		Student objS01;
		Student objS02;
		Student objS03;
		Student objS04;

		// 2. Khởi tạo đối tượng Sinh Viên
		objS01 = new Student();
		objS02 = new Student();
		objS03 = new Student(100, "Mr A", 8.5);
		objS04 = new Student(200, "Mr B", 9.5);

		// 3. Thiết lập thông tin cho các đối tượng thông qua biến đối tượng
		objS01.setiRollNo(100);
		objS01.setsFullName("Nguyễn Văn A");
		objS01.setdMark(8.5);

		objS02.setiRollNo(200);
		objS02.setsFullName("Nguyễn Văn B");
		objS02.setdMark(9.5);

		objS03.setiRollNo(300);
		objS03.setsFullName("Nguyễn Văn C");
		objS03.setdMark(7.5);

		// 4. Hiển thị các thông tin trong các đối tượng ra ngoài
		System.out.println("---- Đối tượng 01 ----");
		System.out.println("+ RollNo: " + objS01.getiRollNo());
		System.out.println("+ FullName: " + objS01.getsFullName());
		System.out.println("+ Mark: " + objS01.getdMark());

		System.out.println("---- Đối tượng 02 ----");
		System.out.println(objS02);

		System.out.println("---- Đối tượng 03 ----");
		System.out.println(objS03);

		System.out.println("---- Đối tượng 04 ----");
		System.out.println(objS04);

		Teacher objT01 = new Teacher();
		Teacher objT02 = new Teacher();
		Teacher objT03 = new Teacher();
		objT01.getiRollNo();
	}
}
