package Teacher.Y2017JC79.arrays.dynamic_array.collectionframework.TheComparableAndIterableInterface.CloneableObject;

public class Person implements Cloneable {
	private String sName;
	private int age;

	public Person() {

	}

	public Person(String sName, int age) {
		this.age = age;
		this.sName = sName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		try {
			Person person = (Person) super.clone();
			return person;
		} catch (CloneNotSupportedException e) {
			return null;
		}

	}

}
