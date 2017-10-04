package JAVACORE_TRAINING.OBJECT_AND_CLASSES.XML_MODULES.XML_EXCERCISES.READ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import JAVACORE_TRAINING.OBJECT_AND_CLASSES.XML_MODULES.XML_EXCERCISES.SinhVienEntity;
import JAVACORE_TRAINING.OBJECT_AND_CLASSES.XML_MODULES.XML_EXCERCISES.StudentObject;
import JAVACORE_TRAINING.OBJECT_AND_CLASSES.XML_MODULES.XML_EXCERCISES.XMLController;
import JAVACORE_TRAINING.OBJECT_AND_CLASSES.XML_MODULES.XML_EXCERCISES.XMLModel;
import JAVACORE_TRAINING.OBJECT_AND_CLASSES.XML_MODULES.XML_EXCERCISES.XMLParams;

public class ReadData2 {

	public static void main(String[] args) {
		// 1. Khai báo & khởi tạo 1 list object
		List<SinhVienEntity> lisStudent = new ArrayList<SinhVienEntity>();
	
		// 2. Tích hợp components có sẵn để thực hiện việc lưu xuống file
		// ở 1 đường dẫn nào đó <tùy chọn của người dùng>.
		JFileChooser objFile = new JFileChooser();
		objFile.setCurrentDirectory(new java.io.File("."));
		objFile.setDialogTitle("Chọn file: ");
		objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		String[] EXTENSION = new String[] { "xml" };
		FileNameExtensionFilter filter = new FileNameExtensionFilter("XML Database files", EXTENSION);
		objFile.setFileFilter(filter);
		objFile.setMultiSelectionEnabled(false);

		int returnVal = objFile.showOpenDialog(null);
		String FileName = "";
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			FileName = objFile.getSelectedFile().getPath();
			
			try {
			   XMLModel objModel = new XMLModel();			   
			   lisStudent = objModel.DocDuLieuXML(FileName);		
			   System.out.println("- So sinh vien: "+ lisStudent.size());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
