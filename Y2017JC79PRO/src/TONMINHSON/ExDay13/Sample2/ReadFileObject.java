package TONMINHSON.ExDay13.Sample2;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.map.ObjectMapper;

import TONMINHSON.ExDay13.JsonSample.Student;

public class ReadFileObject {
	public static void main(String[] args) {
		// 0. Declare ObjectMapper of Jackson json
		ObjectMapper objMapper = new ObjectMapper();

		JFileChooser fileChooser = new JFileChooser(); // declare object class
		fileChooser.setDialogTitle("Open file"); // display title on dialog
		fileChooser.setCurrentDirectory(new File("C:\\Users\\DELL\\Desktop\\JsonFile"));
		fileChooser.setMultiSelectionEnabled(false);
		fileChooser.setFileSelectionMode(fileChooser.FILES_AND_DIRECTORIES);
		// filter file with extensions of Json and XML
		String[] extensions = new String[] { "json", "xml" };
		FileNameExtensionFilter filters = new FileNameExtensionFilter("DataBase files", extensions);
		fileChooser.setFileFilter(filters);

		// invoke dialog
		int result = fileChooser.showOpenDialog(null);

		if (result == JFileChooser.APPROVE_OPTION) {
			File filePath = fileChooser.getSelectedFile();
			String strPath = filePath.getAbsolutePath();
			// System.out.println(strPath);
			try {
				// objMapper.writeValue(new File(strPath), objStudent);
				Student objStudent = objMapper.readValue(new File(strPath), Student.class);
				JOptionPane.showMessageDialog(null, "Successfull Open");
				System.out.println("Student ID: " + objStudent.getRollNo());
				System.out.println("Student Full name: " + objStudent.getsFullName());
				System.out.println("Student Mark: " + objStudent.getdMark());
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
