package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.EXCEPTION_HANDLING;

public class ExampleForUnreachableCatchBlock {

	public static void main(String[] args) {
		try {
			int arr[] = { 1, 2 };
			arr[2] = 3 / 0;
		} catch (Exception e) // This block handles all Exception
		{
			System.out.println("Generic exception");
		} catch (ArrayIndexOutOfBoundsException e) // This block is unreachable
		{
			System.out.println("array index out of bound exception");
		}
	}
}
