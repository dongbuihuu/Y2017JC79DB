package Teacher.Y2017JC79.ExceptionHandling.ThrowKeyword;

public class CreatingInstanceWithNewOperator {
	public static void main(String[] args) {
		try {
			throw new Exception("demo");
		} catch (Exception ex) {
			System.out.println(ex.toString());// Handling
		}
	}
}
