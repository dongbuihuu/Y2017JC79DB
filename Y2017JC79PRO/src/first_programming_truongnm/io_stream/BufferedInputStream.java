package first_programming_truongnm.io_stream;

import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream(
					"C:\\Users\\Dell Precision\\Desktop\\FileJson\\BufferedOutputStream.txt");
			java.io.BufferedInputStream bfin = new java.io.BufferedInputStream(fin);
			int i = 0;
			while ((i = bfin.read()) != -1) {
				System.out.print((char) i);
			}
			bfin.close();
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
