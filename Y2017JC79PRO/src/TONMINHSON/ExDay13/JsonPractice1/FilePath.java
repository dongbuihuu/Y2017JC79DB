package TONMINHSON.ExDay13.JsonPractice1;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public final class FilePath {
	public static JFileChooser newInstanceJFile() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Select File");
		fileChooser.setCurrentDirectory(new File("C:\\Desktop\\JsonFile"));
		fileChooser.setMultiSelectionEnabled(true);
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		String[] extensions = new String[] { "json", "xml" };
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Databse files", extensions);
		fileChooser.setFileFilter(filter);
		return fileChooser;
	}

	public static File saveFile() {
		JFileChooser fileChooser = newInstanceJFile();

		int resultOpenFile = fileChooser.showSaveDialog(null);
		if (resultOpenFile == JFileChooser.APPROVE_OPTION) {
			return fileChooser.getSelectedFile();
		} else {
			return null;
		}
	}
}
