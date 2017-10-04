package JAVACORE_TRAINING.OOPS_CONCEPTS.JSON_MODULES.OPTIONS_DEMO.GOOGLE_JSON.EXAMPLE02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class SAMPLE02 {

	public static void main(String[] args) {
		// 1. Khai báo và khởi tạo đối tượng của Gson
		Gson objG = new Gson();

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
		String FileName = "";
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			FileName = objFile.getSelectedFile().getPath();
			
			// 3. Đọc dữ liệu trong files JSon chuyển vào List<T>
	        try {
	            BufferedReader objBR = new BufferedReader(
	            							new FileReader(FileName));
	            // C1: Tường minh từng bước xử lý
	            //--> import java.lang.reflect.Type;
	            //Type listType = new TypeToken<List<Students>>() { }.getType();
	            //List<Students> objList = objG.fromJson(objBR, listType);
	             
	            // C2:
	            List<Students> lisStudent = objG.fromJson(
	            					objBR, new TypeToken<List<Students>>()
	            								{}.getType());

	            // 4. Duyệt và hiển thị thông tin
	            for (Students objStudent : lisStudent) {	            
	                JOptionPane.showMessageDialog(null, objStudent);
	            }
	        } catch (Exception e) {
	            System.out.println("Có lỗi xảy ra: " + e.getMessage());
	        }
		}
	}
}
