package first_programming_truongnm.io_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SequenceInputStream {

	public static void main(String[] args) {

		try {
			FileInputStream fin1 = new FileInputStream("C:\\Users\\Dell Precision\\Desktop\\FileJson\\Output.txt");
			FileInputStream fin2 = new FileInputStream(
					"C:\\Users\\Dell Precision\\Desktop\\FileJson\\BufferedOutputStream.txt");
			FileOutputStream fout = new FileOutputStream(
					"C:\\Users\\Dell Precision\\Desktop\\FileJson\\SequenceOutputStream");
			java.io.SequenceInputStream sins = new java.io.SequenceInputStream(fin1, fin2);
			int i = 0;
			while ((i = sins.read()) != -1) {
				fout.write(i);
			}
			System.out.println("Success...");
			fin1.close();
			fin2.close();
			fout.close();
			sins.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
