package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.XMLMODULES.BUOIHOC19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.XMLMODULES.XML_EXCERCISES.XMLController;
import JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.XMLMODULES.XML_EXCERCISES.XMLParams;

public class ReadData {
	public static void main(String[] args) {
		// --> Khai báo & khởi tạo 1 list object <StudentEntity>
		List<StudentEntity> lisStudent = new ArrayList<>();
		StudentEntity objStudent = new StudentEntity();
		lisStudent.add(objStudent);

		// --> Sử dụng công nghệ cao? <Ctrl + C & Ctrl + V>
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

			// Khai báo và khởi tạo đối tượng XML Parammetter
			XMLParams<StudentEntity> objXMLParam = new XMLParams<StudentEntity>();
			objXMLParam.lisField = lisStudent;
			objXMLParam.sElementNode = "Student";
			objXMLParam.sPathFile = FileName;

			XMLController<List<List<HashMap<String, String>>>> 
								objController = new XMLController<>();
			//5. Ủy quyền thực thi nghiệp vụ				
			List<List<HashMap<String, String>>> lisHashmap;
			try {
				lisHashmap = objController.XMLExecute(objXMLParam, (byte) 0);
				List<HashMap<String, String>> lisResult = lisHashmap.get(0);
				 for (HashMap<String, String> objHash : lisResult) {
					 System.out.println("+ Id: "+ objHash.get("Id"));
					 System.out.println("+ RollNo: "+ objHash.get("RollNo"));
					 System.out.println("+ FullName: "+ objHash.get("FullName"));
					 System.out.println("+ Mark: "+ objHash.get("Mark"));
					 Object objO =  objHash.get("Classes");
					 System.out.println();
				 }					 
			} catch (Exception e) { }
		}
	}
}
