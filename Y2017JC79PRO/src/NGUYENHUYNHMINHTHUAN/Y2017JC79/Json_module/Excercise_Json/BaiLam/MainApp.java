package NGUYENHUYNHMINHTHUAN.Y2017JC79.Json_module.Excercise_Json.BaiLam;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import Teacher.OOP_CONCEPT.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.EXAMPLE05.StudentMetaData;
import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.FilePath;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<EntityStudent> listStudent = new ArrayList<>();
		StudentMetaData listMeta = new StudentMetaData();
		String sExit = " ";
		Scanner input = new Scanner(System.in);
		do {
			EntityStudent sv = new EntityStudent();

			System.out.print("MSSV: ");
			sv.setMSSV(input.nextInt());
			input = new Scanner(System.in);
			System.out.println("Full Name:");
			sv.setsFullName(input.nextLine());

			System.out.println("Email: ");
			sv.setsEmail(input.nextLine());

			System.out.println("Phone Number:");
			sv.setsPhoneNumber(input.nextLine());

			System.out.println("Mark= ");
			sv.setdMark(input.nextDouble());

			listStudent.add(sv);
			input = new Scanner(System.in);
			System.out.println("Do you want to add student ? (Y/N)");
			sExit = input.nextLine();
		} while (sExit.toUpperCase().equals("Y"));

		File file = FilePath.saveFile();

		if (file != null) {
			String strFile = file.getAbsolutePath();

			ObjectMapper objMapper = new ObjectMapper();

			try {
				objMapper.writeValue(new File(strFile), listStudent);
				JOptionPane.showMessageDialog(null, "Lưu file json thành công");

			} catch (JsonGenerationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
