package Teacher.Y2017JC79.oops.object_and_class.pass_by_value_and_reference;

public class PassByValue {

	public int iCount = 100;// Biến đối tượng

	public void change(int iCount) {// Là biến local của hàm change
		iCount = iCount + 500;
		System.out.println("Inner:" + iCount);
		//

	}

	public static void main(String[] args) {
		PassByValue obj = new PassByValue();
		int x = 500;

		System.out.println("Before:" + obj.iCount);// 100
		obj.change(x);
		System.out.println("After:" + obj.iCount);// 1000//500/600

	}

}
