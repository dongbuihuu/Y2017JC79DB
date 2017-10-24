package Teacher.Y2017JC79.oops.object_and_class.example;

//Đây chính là 1 lớp đối tượng đc khai báo phạm vi là public
public class Student {
	// 1. Biến đối tượng (instance variables) data field
	private int iRollNo;
	private String sFullName;
	private double dMark;

	// Hàm khởi tạo ko tham số
	Student() {
		// Sử dụng trong việc khởi tạo giá trị mặc định cho đối tượng
		iRollNo = -1;
		sFullName = "Example";

	}

	Student(int iRollNo, String sFullName, double dMark) {
		super();
		this.iRollNo = iRollNo;
		this.sFullName = sFullName;
		this.dMark = dMark;
	}

	@Override
	public String toString() {
		return iRollNo + "-" + sFullName + "-" + dMark;
	}

	public int getiRollNo() {
		return iRollNo;
	}

	public void setiRollNo(int iRollNo) {
		this.iRollNo = iRollNo;
	}

	public String getsFullName() {
		return sFullName;
	}

	public void setsFullName(String sFullName) {
		this.sFullName = sFullName;
	}

	public double getdMark() {
		return dMark;
	}

	public void setdMark(double dMark) {
		this.dMark = dMark;
	}
}
