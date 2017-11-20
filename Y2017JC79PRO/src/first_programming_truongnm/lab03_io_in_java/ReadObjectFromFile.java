package first_programming_truongnm.lab03_io_in_java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjectFromFile {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("E:\\Employee.dat");
			ObjectInputStream objInput = new ObjectInputStream(fin);
			ArrayList<Information> arrInput = (ArrayList<Information>) objInput.readObject();
			for (Information information : arrInput) {
				System.out.println(information);
			}
			objInput.close();
			fin.close();

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
