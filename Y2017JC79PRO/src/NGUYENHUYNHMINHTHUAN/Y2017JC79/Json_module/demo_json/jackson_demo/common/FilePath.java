package NGUYENHUYNHMINHTHUAN.Y2017JC79.Json_module.demo_json.jackson_demo.common;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public final class FilePath {

	public static JFileChooser newInstanceJFile() {
		// 1. Khởi tạo lớp Chooser
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Chọn file");
		fileChooser.setCurrentDirectory(new File("."));
		fileChooser.setMultiSelectionEnabled(false);
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		String[] extensions = new String[] { "json", "xml" };
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Database files", extensions);
		fileChooser.setFileFilter(filter);

		return fileChooser;

	}

	public static File openFile() {
		JFileChooser fileChooser = newInstanceJFile();

		int resultOpenFile = fileChooser.showOpenDialog(null);
		if (resultOpenFile == JFileChooser.APPROVE_OPTION) {
			return fileChooser.getSelectedFile();

		} else {
			return null;
		}

	}

	public static File SaveFile() {
		JFileChooser fileChooser = newInstanceJFile();

		int resultOpenFile = fileChooser.showSaveDialog(null);
		if (resultOpenFile == JFileChooser.APPROVE_OPTION) {
			return fileChooser.getSelectedFile();

		} else {
			return null;
		}

	}

}
