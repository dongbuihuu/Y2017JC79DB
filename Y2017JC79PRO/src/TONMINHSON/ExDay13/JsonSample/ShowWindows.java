package TONMINHSON.ExDay13.JsonSample;

import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ShowWindows {
	public static void main(String[] args) {
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
			File file = fileChooser.getSelectedFile();
			String strPath = file.getAbsolutePath();
			System.out.println(strPath);
		}
	}
}
