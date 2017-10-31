package first_programming_truongnm.user_define_exception;

//3. Thuc thi ham main, goi den "ExecuteException"
public class TestHandleException {

	public static void main(String[] args) {
		try {
			new ExecuteException(17);
		} catch (InvalidAgeArmyException e) {
			System.out.println("Co loi la: " + e.getMessage());
		}
		System.out.println("Du tuoi vao quan doi");
	}

}
