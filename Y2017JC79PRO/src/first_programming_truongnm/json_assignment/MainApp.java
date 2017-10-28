package first_programming_truongnm.json_assignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class MainApp {

	public static void main(String[] args) {
		// Declare to initialize an object of ObjectMapper of Jackson Json: to READ or
		// WRITE
		ObjectMapper objtMapper = new ObjectMapper();
		// 1. Display dialog choosing where is to save
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Open File");// Display title of dialog
		fileChooser.setCurrentDirectory(new File("C:\\Users\\Dell Precision\\Desktop\\FileJson"));// Default path

		fileChooser.setMultiSelectionEnabled(false);// Choose 01 file only
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);// Display both file and directory

		// Filter files have extensions *.json, *.xml
		// FileNameExtensionFilter filter = new FileNameExtensionFilter("Datafile",
		// "json", "XML");
		fileChooser.setFileFilter(new FileNameExtensionFilter("DataFile", "json", "XML"));

		// Take dialog by interface
		int result = fileChooser.showSaveDialog(null);
		Scanner sc = new Scanner(System.in);
		String sExit = "";
		ArrayList<Student> lstStudent = new ArrayList<>();
		Student sv = new Student();
		do {

			System.out.println("Kindly input student's name");
			sv.setsName(sc.nextLine());
			System.out.println("Kindly input student's ID");
			sv.setiID(sc.nextInt());
			System.out.println("Kindly input student's mark");
			sv.setiMark(sc.nextInt());
			System.out.println("Kindly input student's phone number");
			sv.setiPhoneNumber(sc.nextInt());
			System.out.println("Kindly input student's email");
			sv.setsEmail(sc.nextLine());
			sc.nextLine();

			lstStudent.add(sv);
			sc = new Scanner(System.in);
			System.out.println("Would you like to input new student? (Y/N)");
			sExit = sc.nextLine();
		} while (sExit.toUpperCase().equals("Y"));
		sc.close();
		if (result == JFileChooser.APPROVE_OPTION) {
			File filePath = fileChooser.getSelectedFile();
			String stringFile = filePath.getAbsolutePath();

			try {
				objtMapper.writeVa
				objtMapper.writeValue(new File(stringFile), lstStudent);
				JOptionPane.showMessageDialog(null, "Saved");
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
