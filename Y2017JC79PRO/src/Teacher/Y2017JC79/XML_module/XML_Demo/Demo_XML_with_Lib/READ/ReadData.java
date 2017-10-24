package Teacher.Y2017JC79.XML_module.XML_Demo.Demo_XML_with_Lib.READ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import Teacher.Y2017JC79.XML_module.XML_Demo.Demo_XML_with_Lib.LibraryXML.XMLController;
import Teacher.Y2017JC79.XML_module.XML_Demo.Demo_XML_with_Lib.LibraryXML.XMLParams;

public class ReadData {

	public static void main(String[] args) {
		// 1. Khai báo & khởi tạo 1 list object
		List<StudentObject> lisStudent = new ArrayList<StudentObject>();
		StudentObject objStudent = new StudentObject();
		lisStudent.add(objStudent);

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
				/*
				 * XMLExecute (objXMLParam, (byte) 0);
				 * 
				 * @param List T lisField
				 * 
				 * @param string sElementNode
				 * 
				 * @param string sPathFile
				 */
				// 3. Khai báo và khởi tạo đối tượng XML Parammetter
				XMLParams<StudentObject> objXMLParam = new XMLParams<StudentObject>();
				objXMLParam.lisField = lisStudent;
				objXMLParam.sElementNode = "Student";
				objXMLParam.sPathFile = FileName;

				// 4. Khai báo và khởi tạo đối tượng của XMLControllers
				XMLController<List<List<HashMap<String, String>>>> objController = new XMLController<>();

				// 5. Ủy quyền thực thi nghiệp vụ
				List<List<HashMap<String, String>>> lisHashmap = objController.XMLExecute(objXMLParam, (byte) 0);

				// 6. Lấy dữ liệu trong Hashmap ra
				// CÁCH 01:
				List<HashMap<String, String>> lisResult = lisHashmap.get(0);
				for (HashMap<String, String> objHash : lisResult) {
					System.out.println("+ Id: " + objHash.get("id"));
					System.out.println("+ RollNo: " + objHash.get("iRollNo"));
					System.out.println("+ FullName: " + objHash.get("sFullName"));
					System.out.println("+ Mark: " + objHash.get("dMark"));
					System.out.println();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
