package Teacher.Y2017JC79.XML_module.XML_Demo.Demo_XML_with_Lib.READ;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import Teacher.Y2017JC79.XML_module.XML_Demo.CommonXML.Student;
import Teacher.Y2017JC79.XML_module.XML_Demo.Demo_XML_with_Lib.LibraryXML.XMLModel;

public class ReadData2 {

	public static void main(String[] args) {
		// 1. Khai báo & khởi tạo 1 list object
		List<Student> lisStudent = new ArrayList<Student>();

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
				System.out.println("- So sinh vien: " + lisStudent.size());
				for (Student student : lisStudent) {
					System.out.println(student);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
