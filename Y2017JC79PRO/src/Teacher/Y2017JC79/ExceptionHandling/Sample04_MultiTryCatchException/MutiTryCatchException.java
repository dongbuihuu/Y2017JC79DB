package Teacher.Y2017JC79.ExceptionHandling.Sample04_MultiTryCatchException;

public class MutiTryCatchException {
	public static void main(String[] args) {
		try {
			int arr[] = { 1, 2 };
			arr[2] = 3 / 0;
		} catch (Exception e) // This block handles all Exception
		{
			System.out.println("Generic exception");
		} catch (ArrayIndexOutOfBoundsException ex) // This block is unreachable
		{
			System.out.println("array index out of bound exception");
		}
	}
}
