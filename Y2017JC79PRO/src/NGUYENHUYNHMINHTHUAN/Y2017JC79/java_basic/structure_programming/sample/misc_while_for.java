package Teacher.Y2017JC79.java_basic.structure_programming.sample;

public class misc_while_for {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			for (int j = i; j > 1; j--)
				System.out.print(j + " ");
			System.out.println("****");
			i++;
		}

	}

}
