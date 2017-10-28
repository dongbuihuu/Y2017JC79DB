package first_programming_truongnm.jasonmodule;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ShowWindow {

	public static void main(String[] args) {
		// Khai bao lop doi tuong
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Open File"); // Hien thi tieu de cua hop thoai
		fileChooser.setCurrentDirectory(new File("C:\\Users\\Dell Precision\\Desktop\\FileJson"));// Thiet lap duong dan
																									// thu muc default
																									// can mo
		fileChooser.setMultiSelectionEnabled(false);// Thiet lap chon 01 file
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);// Cho hien thi ca thu muc va file
		// Chi muon loc ra cac file chi co duoi *.Json, *.XML
		String[] extensions = new String[] { "json", "XML" };
		FileNameExtensionFilter filters = new FileNameExtensionFilter("DataBase files", extensions);
		fileChooser.setFileFilter(filters);

		// GOi hop thoai bang giao dien

		int result = fileChooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			String strPath = file.getAbsolutePath();
			System.out.println(strPath);
		}

	}

}
