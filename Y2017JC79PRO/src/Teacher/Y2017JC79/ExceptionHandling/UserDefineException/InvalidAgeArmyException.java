package Teacher.Y2017JC79.ExceptionHandling.UserDefineException;

public class InvalidAgeArmyException extends Exception {
	private int iAge;

	public int getiAge() {
		return iAge;
	}

	public InvalidAgeArmyException(int Age) {
		super("Invalid Age for Army: " + Age); // Truyen mo ta loi len cho Lop cha (Throwable)
		this.iAge = Age;
	}
}
