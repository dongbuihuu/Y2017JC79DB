package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ConstructorDemo;

public class Student {
	//1. Biến đối tượng
	private int iRollNo;
	private String sFullName;
	private double dMark;
	
	//2. Hàm khởi tạo ko tham số
	public  Student(){
		//Khởi tạo giá trị mặc định cho đối tượng
		iRollNo = -1;
		sFullName = "Example";
		dMark = -1;
	}
	
	public Student(int pRollNo, String sFullName, double dMark){
		//<Biến đối tượng> = <tham số>;
		iRollNo = pRollNo;
		this.sFullName = sFullName;
		this.dMark  = dMark;
	}
	
	//3. Thuộc tính của đối tượng
	/*- Là thành phần cho phép chúng ta dễ dàng tùy biến thông tin cho đối
     * tượng.
     * - Tùy biến ở đây có nghĩa là chúng ta có thể thiết lập thông tin cho đối 
     * tượng qua thuộc tính, có thể lấy các thông tin của đối tương về qua 
     * thuộc tính đó.	 * 
	 * */
	public int getiRollNo(){
		return iRollNo;
	}
	
	public void setiRollNo(int pRollNo){
		iRollNo = pRollNo;
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
	
	@Override
	public String toString() {
		System.out.println("- RollNo: "+ getiRollNo());
		System.out.println("- FullName: "+ getsFullName());
		System.out.println("- Mark: "+ getdMark());
		return "";
	}
}
