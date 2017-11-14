package first_programming_truongnm.io_stream;

import java.io.IOException;

public class FileInputStream {

	public static void main(String[] args) {

		try {
			java.io.FileInputStream fin = new java.io.FileInputStream(
					"C:\\Users\\Dell Precision\\Desktop\\FileJson\\Output.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();
		} catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
		}

	}

}
