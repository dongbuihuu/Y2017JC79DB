package Teacher.OOP_CONCEPT.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.EXAMPLE03;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.map.ObjectMapper;

public class SAMPLE01 {

	public static void main(String[] args) {
		// 1. Khai báo & khởi tạo 1 List<Student>?
		List<Student> lisStudent = new ArrayList<Student>();

		// 2. Khai báo & khởi tạo 03 đối tượng Sinh Viên
		// với đầy đủ thông tin.
		Student SV001 = new Student();
		SV001.setiRollNo(100);
		SV001.setsFullName("Nguyễn Văn A");
		SV001.setdMark(8.5);

		Student SV002 = new Student();
		SV002.setiRollNo(200);
		SV002.setsFullName(" Trần Thị B");
		SV002.setdMark(9.5);

		Student SV003 = new Student();
		SV003.setiRollNo(200);
		SV003.setsFullName(" Trần Thị B");
		SV003.setdMark(9.5);

		lisStudent.add(SV001);
		lisStudent.add(SV002);
		lisStudent.add(SV003);
		ObjectMapper objMap = new ObjectMapper();

		// 4. Tích hợp phần mã lệnh cho phép chúng ta có thể dễ dàng...
		JFileChooser objFile = new JFileChooser();
		objFile.setCurrentDirectory(new java.io.File("."));
		objFile.setDialogTitle("Chọn file: ");
		objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		String[] EXTENSION = new String[] { "json" };
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JSON Database files", EXTENSION);
		objFile.setFileFilter(filter);
		objFile.setMultiSelectionEnabled(false);

		int returnVal = objFile.showSaveDialog(null);
		String ParentPath = "";
		String FileName = "";
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			FileName = objFile.getSelectedFile().getPath();

			// 4. Ghi dữ liệu Object Java xuống files JSON
			// writeValue(<đường dẫn tới file đã khởi tạo>,
			// <dữ liệu nguồn cần ghi xuống files>);
			try {
				objMap.writeValue(new File(FileName), lisStudent);
				JOptionPane.showMessageDialog(null, "Đã ghi dữ liệu xuống files thành công!!!");
			} catch (Exception e) {
				System.out.println("Có lỗi xảy ra: " + e.getMessage());
			}
		}
	}
}
