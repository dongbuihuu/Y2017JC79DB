package Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.demojson01;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ShowWindows {
	public static void main(String[] args) {
		JFileChooser fileChooser = new JFileChooser(); // Khai bao lop doi tuong
		fileChooser.setDialogTitle("Open File"); // Hien thi tieu de cua hop thoai
		fileChooser.setCurrentDirectory(new File("C:\\Users\\dongbh\\Desktop\\FileJson")); // Thiet lap Duong dan thu
		fileChooser.setMultiSelectionEnabled(false); // muc default can mo
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		;// Cho hien thi ca thu muc va file
			// Chi muon loc ra cac file chi co duoi la *.json, *.XML...
		String[] extensions = new String[] { "json", "xml" };
		FileNameExtensionFilter filters = new FileNameExtensionFilter("DataBase files", extensions);
		fileChooser.setFileFilter(filters);

		// Goi hop thoai len (bang giao dien)
		int result = fileChooser.showSaveDialog(null);

		if (result == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			String strPath = file.getAbsolutePath();

			System.out.println(strPath);

		}

	}

}
