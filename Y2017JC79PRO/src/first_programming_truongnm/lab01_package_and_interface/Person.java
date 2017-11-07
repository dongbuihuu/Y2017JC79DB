package first_programming_truongnm.lab01_package_and_interface;

public class Person implements PersonExample {

	protected String id;
	protected String name;
	protected int age;

	public String getId() {
		return id;
	}

	public Person() {
		super();
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
