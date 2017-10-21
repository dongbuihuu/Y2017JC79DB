package Teacher.OOP_CONCEPT.JSON_MODULES.JSONSAMPLES;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.map.ObjectMapper;

public class MODULE01_OBJECT_INTO_JSON {

	public static void main(String[] args) {

		// 1. Khai báo & khởi tạo 1 đối sinh viên
		Student objStudent = new Student();
		objStudent.setRollNo(100);
		objStudent.setFullName("Nguyễn Văn A");
		objStudent.setMark(8.5);

		// 2. Sử dụng comps có sẵn để xuất hiện cửa sổ cho phép lưu files
		// ở 1 thư mục bất kỳ (ctrl + c --> ctrl + v)
		JFileChooser objFile = new JFileChooser();
		objFile.setCurrentDirectory(new java.io.File("."));
		objFile.setDialogTitle("Chọn file: ");
		objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		String[] EXTENSION = new String[] { "json" };
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JSON files", EXTENSION);
		objFile.setFileFilter(filter);
		objFile.setMultiSelectionEnabled(false);

		int returnVal = objFile.showSaveDialog(null);
		String ParentPath = "";
		String FileName = "";
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			// ParentPath = objFile.getSelectedFile().getParent();
			FileName = objFile.getSelectedFile().getPath();

			// 3. Khai báo & khởi tạo đối tượng Objectmapper
			ObjectMapper objMapper = new ObjectMapper();

			// 4. Thực thi chuyển đối tượng trong Java thành format JSON
			// --> ghi dữ liệu đó xuống files
			try {
				objMapper.writeValue(new File(FileName), objStudent);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
