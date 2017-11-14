package first_programming_truongnm.io_stream;

import java.io.IOException;

public class FileOutputStream {

	public static void main(String[] args) {
		try {
			java.io.FileOutputStream fout = new java.io.FileOutputStream(
					"C:\\Users\\Dell Precision\\Desktop\\FileJson\\Output.txt");
			String s = "Please kindly close this file";
			byte[] b = s.getBytes(); // Casting a string to bytes array
			fout.write('B'); // Write a byte to file
			fout.write(' ');
			fout.write(b); // Write a array to file
			fout.close();
			System.out.println("Success...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
