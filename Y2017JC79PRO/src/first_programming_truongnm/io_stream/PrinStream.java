package first_programming_truongnm.io_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrinStream {

	public static void main(String[] args) {
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("C:\\Users\\Dell Precision\\Desktop\\FileJson\\Text.txt");
			PrintStream pSt = new PrintStream(fout);
			pSt.println("Hello");
			pSt.print("Truong Dep Trai");
			pSt.println(2016);
			pSt.close();
			fout.close();
			System.out.println("Success...");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
