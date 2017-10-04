package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ConstructorDemo;

public class MainApps {
	public static void main(String[] args) {
		//1. Khai báo và khởi tạo đối tượng
		Student objS01 = new Student();
		Student objS02 = new Student(100, "Nguyễn Văn A", 8.5);
		Student objS03 = new Student();
		Student objS04 = new Student();
		
		objS01.setiRollNo(200);
		objS01.setsFullName(" Trần Thị B");
		objS01.setdMark(9.5);
		
		objS03.setiRollNo(300);
		objS03.setsFullName("Hoàng Văn C");
		objS03.setdMark(10.0);
		
		objS04.setiRollNo(400);
		objS04.setsFullName(" Mộng Thị Lung Linh Huyền Ảo Tuyệt Vời");
		objS04.setdMark(9.5);
		
		//2. Hiển thị thông tin của đối tượng
		System.out.println("------Sinh Viên 01----------");
		System.out.println("- RollNo: "+ objS01.getiRollNo());
		System.out.println("- FullName: "+ objS01.getsFullName());
		System.out.println("- Mark: "+ objS01.getdMark());
		
		System.out.println("------Sinh Viên 02----------");
		System.out.println(objS02);
	}
}
