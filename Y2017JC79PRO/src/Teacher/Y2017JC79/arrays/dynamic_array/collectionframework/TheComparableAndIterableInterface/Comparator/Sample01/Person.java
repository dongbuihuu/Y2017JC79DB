package Teacher.Y2017JC79.arrays.dynamic_array.collectionframework.TheComparableAndIterable.Comparator.Sample01;

public class Person {
	private String sName;
	private short age;

	public Person() {

	}

	public Person(String sName, short age) {
		this.sName = sName;
		this.age = age;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	@Override
	public String toString() {

		return String.format("FullName: %s - age: %s", this.getsName(), this.getAge());
	}
}
