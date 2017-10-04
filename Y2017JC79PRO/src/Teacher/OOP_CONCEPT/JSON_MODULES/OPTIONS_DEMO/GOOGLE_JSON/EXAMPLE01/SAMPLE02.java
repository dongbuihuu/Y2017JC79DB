package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.JSON_MODULES.OPTIONS_DEMO.GOOGLE_JSON.EXAMPLE01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.google.gson.Gson;

public class SAMPLE02 {

	public static void main(String[] args) {
		// 1. Khai báo và khởi tạo đối tượng của Gson
		Gson objGson = new Gson();

		// 2. Tích hợp components có sẵn để thực hiện việc lưu xuống file
		// ở 1 đường dẫn nào đó <tùy chọn của người dùng>.
		JFileChooser objFile = new JFileChooser();
		objFile.setCurrentDirectory(new java.io.File("."));
		objFile.setDialogTitle("Chọn file: ");
		objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		String[] EXTENSION = new String[] { "json" };
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JSON Database files", EXTENSION);
		objFile.setFileFilter(filter);
		objFile.setMultiSelectionEnabled(false);

		int returnVal = objFile.showOpenDialog(null);
		String ParentPath = "";
		String FileName = "";
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			FileName = objFile.getSelectedFile().getPath();

			// 3. Đọc dữ liệu trong files JSon chuyển vào Object
			try {
				BufferedReader objBR = new BufferedReader(
											new FileReader(FileName));
				Students objStudent = objGson.fromJson(objBR, Students.class);
				JOptionPane.showMessageDialog(null, objStudent);
			} catch (Exception e) {
				System.out.println("Có lỗi xảy ra: " + e.getMessage());
			}
		}
	}
}
