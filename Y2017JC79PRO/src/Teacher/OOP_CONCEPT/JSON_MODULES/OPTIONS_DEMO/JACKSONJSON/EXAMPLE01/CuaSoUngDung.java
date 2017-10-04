package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.EXAMPLE01;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CuaSoUngDung {
	public static void main(String[] args) {
		 JFileChooser objFile = new JFileChooser();
	        objFile.setCurrentDirectory(new java.io.File("."));
	        objFile.setDialogTitle("Chọn file: ");
	        objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	        String[] EXTENSION = new String[] { "json" };
	        FileNameExtensionFilter filter = new FileNameExtensionFilter("JSON files", EXTENSION);
	        objFile.setFileFilter(filter);
	        objFile.setMultiSelectionEnabled(false);

	        int returnVal = objFile.showOpenDialog(null);
	        String ParentPath = "";
	        String FileName = "";
	        if (returnVal == JFileChooser.APPROVE_OPTION) {
	            // ParentPath = objFile.getSelectedFile().getParent();
	            FileName = objFile.getSelectedFile().getPath();
	         }
	}
}
