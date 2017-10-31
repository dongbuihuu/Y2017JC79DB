package first_programming_truongnm.user_define_exception;

//1. Xay dung chuong trinh xu ly loi
public class InvalidAgeArmyException extends Exception {
	private int iAge;

	public int getiAge() {
		return iAge;
	}

	public void setiAge(int iAge) {
		this.iAge = iAge;
	}

	// Constructor
	public InvalidAgeArmyException(int iAge) {
		super("Invalid Age for Army: " + iAge); // Truyen mo ta loi len cho lop cha (Throwable)
		this.iAge = iAge;
	}

}
