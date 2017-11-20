package first_programming_truongnm.lab03_io_in_java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileFromKeyboard {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("E:\\test.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			Scanner sc = new Scanner(System.in);
			System.out.print("Kindly input name of employee_01: ");
			bufferedWriter.write(sc.nextLine());
			System.out.print("Kindly input name of employee_02: ");
			bufferedWriter.write(sc.nextLine());
			bufferedWriter.flush();
			sc.close();
			bufferedWriter.close();
			System.out.println("Success...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
