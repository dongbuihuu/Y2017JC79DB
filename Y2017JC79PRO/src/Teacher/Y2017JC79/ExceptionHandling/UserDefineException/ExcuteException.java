package Teacher.Y2017JC79.ExceptionHandling.UserDefineException;

public class ExcuteException {
	private int age;

	public ExcuteException() {

	}

	public ExcuteException(int age) throws InvalidAgeArmyException {
		this.setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws InvalidAgeArmyException {
		if (age < 18) {
			throw new InvalidAgeArmyException(age);
		}
		this.age = age;

	}

}
