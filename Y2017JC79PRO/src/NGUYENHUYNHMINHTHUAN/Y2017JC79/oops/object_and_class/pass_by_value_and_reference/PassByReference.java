package Teacher.Y2017JC79.oops.object_and_class.pass_by_value_and_reference;

public class PassByReference {
	public int data = 100;

	public void change(PassByReference obj) {
		obj.data = obj.data + 150;
		System.out.println("Inner: " + obj.data);
	}

	public static void main(String[] args) {
		PassByReference obj = new PassByReference();

		System.out.println("Before:" + obj.data);// 100
		obj.change(obj);
		System.out.println("After:" + obj.data);// 250
	}

}
