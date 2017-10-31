package BUIHUUDONG.ExceptionHandling.Demo;

public class DemoAge {
	public static void main(String[] args) {
		int age = 50;
		try {
			AgeUtils.checkAge(age);
		} catch (TooYoungException | TooOldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
