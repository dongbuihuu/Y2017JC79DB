package first_programming_truongnm.io_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream(
					"C:\\Users\\Dell Precision\\Desktop\\FileJson\\BufferedOutputStream.txt");
			java.io.BufferedOutputStream bfout = new java.io.BufferedOutputStream(fout);
			String s = "This is a text line";
			byte b[] = s.getBytes();
			bfout.write(b);
			bfout.flush(); // Forced data from BufferStream to OutputStream
			bfout.close();
			fout.close();
			System.out.println("Success...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
