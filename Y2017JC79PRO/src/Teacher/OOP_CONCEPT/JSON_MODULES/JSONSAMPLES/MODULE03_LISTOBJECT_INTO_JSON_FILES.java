package Teacher.OOP_CONCEPT.JSON_MODULES.JSONSAMPLES;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.map.ObjectMapper;

public class MODULE03_LISTOBJECT_INTO_JSON_FILES {

	public static void main(String[] args) {
		// 1. Khai báo & khởi tạo danh sách Sinh Viên
		List<Student> lisStudent = new ArrayList<Student>();

		// 2. Khai báo & khởi tạo các đối tượng Sinh viên
		Student SV01 = new Student();
		Student SV02 = new Student();
		Student SV03 = new Student();

		// 3. Thiết lập đầy đủ thông tin cho 03 đối tượng SV
		SV01.setRollNo(1);
		SV01.setFullName("Hoàng Văn A");
		SV01.setMark(8.5);

		SV02.setRollNo(2);
		SV02.setFullName("Phạm Thị B");
		SV02.setMark(7.5);

		SV03.setRollNo(3);
		SV03.setFullName("Trần Thị C");
		SV03.setMark(9.5);

		// 4. Đưa các sinh viên vào trong danh sách sinh viên
		lisStudent.add(SV01);
		lisStudent.add(SV02);
		lisStudent.add(SV03);

		// 5. Sử dụng comps có sẵn để xuất hiện cửa sổ cho phép lưu files
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

			// 6. Thực thi ghi dữ liệu danh sách xuống files *.json
			ObjectMapper objMapper = new ObjectMapper();
			try {
				objMapper.writeValue(new File(FileName), lisStudent);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
