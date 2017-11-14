package first_programming_truongnm.io_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamPlusEnumeration {

	public static void main(String[] args) {
		try {
			FileInputStream fin1 = new FileInputStream("C:\\Users\\Dell Precision\\Desktop\\FileJson\\Output.txt");
			FileInputStream fin2 = new FileInputStream(
					"C:\\Users\\Dell Precision\\Desktop\\FileJson\\BufferedOutputStream.txt");
			FileInputStream fin3 = new FileInputStream(
					"C:\\Users\\Dell Precision\\Desktop\\FileJson\\SequenceOutputStream");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Dell Precision\\Desktop\\FileJson\\Final.txt");
			Vector v = new Vector<>();
			v.add(fin1);
			v.add(fin2);
			v.add(fin3);

			Enumeration e = v.elements();
			SequenceInputStream sis = new SequenceInputStream(e);
			int i = 0;
			while ((i = sis.read()) != -1) {
				fout.write(i);
			}
			System.out.println("Success...");
			fout.close();
			sis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
