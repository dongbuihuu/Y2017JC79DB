package Teacher.Y2017JC79.ExceptionHandling.Sample03_CheckedException;

import java.io.File;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) {
		File file = new File("C://files//Test.txt");
		try {
			FileReader fr = new FileReader(file);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Không tìm thấy file");
		}

	}

}
