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
		fileChooser.setFileFilter(new FileNameExtensionFilter("DataFile", "json"));

		// 2. Take dialog by interface
		int result = fileChooser.showSaveDialog(null);
		Scanner sc = new Scanner(System.in);
		String sExit = "";
		ArrayList<Student> lstStudent = new ArrayList<>();
		Student sv = new Student();
		do {

			System.out.print("Kindly input student's name: ");
			sv.setsName(sc.nextLine());
			System.out.print("Kindly input student's ID: ");
			sv.setiID(sc.nextInt());
			System.out.print("Kindly input student's mark: ");
			sv.setiMark(sc.nextDouble());
			System.out.print("Kindly input student's phone number: ");
			sv.setiPhoneNumber(sc.nextInt());
			System.out.print("Kindly input student's email: ");
			sv.setsEmail(sc.nextLine());
			sc.nextLine();

			lstStudent.add(sv);
			sc = new Scanner(System.in);
			System.out.println("Would you like to input new student? (Y/N): ");
			sExit = sc.nextLine();
		} while (sExit.toUpperCase().equals("Y"));

		if (result == JFileChooser.APPROVE_OPTION) {
			// File filePath = fileChooser.getSelectedFile();
			String stringFile = fileChooser.getSelectedFile().getAbsolutePath();

			try {
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

		// 3. Add students to old file

		System.out.println("Would you like to add new student? (Y/N)");
		Student sv1 = new Student();
		String sExit1 = "";
		sExit1 = sc.nextLine();
		if (sExit1.toUpperCase().equals("Y")) {
			do {

				System.out.print("Kindly input student's name: ");
				sv1.setsName(sc.nextLine());
				System.out.print("Kindly input student's ID: ");
				sv1.setiID(sc.nextInt());
				System.out.print("Kindly input student's mark: ");
				sv1.setiMark(sc.nextDouble());
				System.out.print("Kindly input student's phone number: ");
				sv1.setiPhoneNumber(sc.nextInt());
				System.out.print("Kindly input student's email: ");
				sv1.setsEmail(sc.nextLine());
				sc.nextLine();

				lstStudent.add(sv1);
				sc = new Scanner(System.in);
				System.out.println("Would you like to continue? (Y/N)");
				sExit = sc.nextLine();
			} while (sExit.toUpperCase().equals("Y"));

			if (result == JFileChooser.APPROVE_OPTION) {
				// File filePath = fileChooser.getSelectedFile();
				String stringFile = fileChooser.getSelectedFile().getAbsolutePath();

				try {
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
		} else {
			System.exit(result);
		}
		// 4. Remove n Student in Json file
		String sRemove = "";
		sc.nextLine();
		System.out.println("Would you like to remove any student? (Y/N)");
		sRemove = sc.nextLine();
		if (sRemove.toUpperCase().equals("Y")) {
			System.out.println("Kindly input object's index to remove?");
			lstStudent.remove(sc.nextInt());

			try {
				objtMapper.writeValue(new File(fileChooser.getSelectedFile().getAbsolutePath()), lstStudent);
				JOptionPane.showMessageDialog(null, "Saved");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.exit(result);
		}
		// 5. Update student's information
		Student sv2 = new Student();
		sc.nextLine();
		System.out.println("Would you like to update any student's information? (Y/N)");
		String sUpdate = "";
		sUpdate = sc.nextLine();
		if (sUpdate.toUpperCase().equals("Y")) {
			System.out.println("Firstly, you need remove student you wanna update");
			System.out.println("Secondly, you add new information at the index you just removed");
			System.out.println("Which index does you wanna remove?");
			lstStudent.remove(sc.nextInt());
			sc.nextLine();
			System.out.println("Kindly update student's information as below");

			System.out.print("Kindly input student's name: ");
			sv2.setsName(sc.nextLine());
			System.out.print("Kindly input student's ID: ");
			sv2.setiID(sc.nextInt());
			System.out.print("Kindly input student's mark: ");
			sv2.setiMark(sc.nextDouble());
			System.out.print("Kindly input student's phone number: ");
			sv2.setiPhoneNumber(sc.nextInt());
			System.out.print("Kindly input student's email: ");
			sv2.setsEmail(sc.nextLine());
			sc.nextLine();

			lstStudent.add(sc.nextInt(), sv2);
			try {
				objtMapper.writeValue(new File(fileChooser.getSelectedFile().getAbsolutePath()), lstStudent);
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
		} else {
			System.exit(result);
		}
	}
}
