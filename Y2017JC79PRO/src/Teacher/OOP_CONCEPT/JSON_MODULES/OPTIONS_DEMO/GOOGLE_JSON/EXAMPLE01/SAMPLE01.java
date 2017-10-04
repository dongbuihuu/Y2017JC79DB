package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.JSON_MODULES.OPTIONS_DEMO.GOOGLE_JSON.EXAMPLE01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.google.gson.Gson;

public class SAMPLE01 {

	public static void main(String[] args) {
		// 1. Khai báo và khởi tạo 1 đối tượng Sinh Viên?
		Students objStudent = new Students();
		objStudent.setiRollNo(100);
		objStudent.setsFullName("Nguyễn Văn A");
		objStudent.setdMark(8.5);

		// 2. Khai báo và khởi tạo đối tượng của Gson?
		Gson objGson = new Gson();

		// 3. Tích hợp components có sẵn để thực hiện việc lưu xuống file
		// ở 1 đường dẫn nào đó <tùy chọn của người dùng>.
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

			// 4. Chuyển dữ liệu từ Object của Java --> thành format JSon
			String JSonString = objGson.toJson(objStudent);
			// {"RollNo":"100",...}

			// 5. Sử dụng đối tượng FileWriter
			FileWriter objFW;
			try {
				objFW = new FileWriter(new File(FileName));
				objFW.write(JSonString);
				objFW.close(); // Giải phóng luồng dữ liệu
				JOptionPane.showMessageDialog(null,
						String.format("Dữ liệu đã được ghi vào: [%s] thành công!!!",
											FileName));
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}
}
