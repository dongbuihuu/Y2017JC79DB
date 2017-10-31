package BUIHUUDONG.ExceptionHandling;

public class MaxLong {
	public static void main(String[] args) {
		try {
			long value = Long.MAX_VALUE;
			System.out.println(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

// -9223372036854775808
