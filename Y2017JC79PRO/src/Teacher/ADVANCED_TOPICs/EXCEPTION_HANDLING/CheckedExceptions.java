package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.EXCEPTION_HANDLING;

import java.io.File;
import java.io.FileReader;

public class CheckedExceptions {

	public static void main(String[] args) {
		File file = new File("D://file.txt");
		FileReader fr = new FileReader(file);
		
		/*unreported exception FileNotFoundException; must be caught or declared to be thrown
		 * */
	}
}
