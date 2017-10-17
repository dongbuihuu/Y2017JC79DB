package Teacher.Y2017JC79.CloneableObject;

public class MainTest {

	public static void main(String[] args) {
		Person ps = new Person("Dong", 36);
		Person ps3 = ps;
		try {
			Person ps2 = (Person) ps.clone();
			System.out.println(ps2.getsName());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(ps.getsName());

	}

}
