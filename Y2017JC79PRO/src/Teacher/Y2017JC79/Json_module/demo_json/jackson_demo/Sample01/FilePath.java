package Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.Sample01;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FilePath {

	private File file;

	public File getFile() {

		return file;
	}

	public void setOpenFile() {
		// 1. Khởi tạo lớp Chooser
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Chọn file");
		fileChooser.setCurrentDirectory(new File("C:\\Users\\dongbh\\Desktop\\FileJson"));
		fileChooser.setMultiSelectionEnabled(false);
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		String[] extensions = new String[] { "json" };
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Database files", extensions);
		fileChooser.setFileFilter(filter);

		int resultOpenFile = fileChooser.showOpenDialog(null);
		if (resultOpenFile == JFileChooser.APPROVE_OPTION) {
			this.file = fileChooser.getSelectedFile();

		} else {
			this.file = null;
		}

	}

	public void setSaveFile() {
		// 1. Khởi tạo lớp Chooser
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Chọn file");
		fileChooser.setCurrentDirectory(new File("C:\\Users\\dongbh\\Desktop\\FileJson"));
		fileChooser.setMultiSelectionEnabled(false);
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		String[] extensions = new String[] { "json" };
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Database files", extensions);
		fileChooser.setFileFilter(filter);

		int resultOpenFile = fileChooser.showSaveDialog(null);
		if (resultOpenFile == JFileChooser.APPROVE_OPTION) {
			this.file = fileChooser.getSelectedFile();

		} else {
			this.file = null;
		}

	}

}
