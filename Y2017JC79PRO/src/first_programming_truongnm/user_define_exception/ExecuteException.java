package first_programming_truongnm.user_define_exception;

//2. Xay dung chuong trinh chay cu the
public class ExecuteException {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws InvalidAgeArmyException {
		if (age < 18) {
			throw new InvalidAgeArmyException(age);
		}
		this.age = age;
	}

	// Constructor
	public ExecuteException(int age) throws InvalidAgeArmyException {
		super();
		this.setAge(age);
	}

}
