package Teacher.Y2017JC79.ExceptionHandling.UserDefineException;

public class TestHandleAgeException {

	public static void main(String[] args) {
		try {
			new ExcuteException(17);
		} catch (RuntimeException e) {

			System.out.println("Co loi la " + e.getMessage()); // Handle
		} catch (InvalidAgeArmyException e) {

			System.out.println("Co loi la " + e.getMessage()); // Handle
		}
		System.out.println("Du tuoi vao quan doi");

	}

}
