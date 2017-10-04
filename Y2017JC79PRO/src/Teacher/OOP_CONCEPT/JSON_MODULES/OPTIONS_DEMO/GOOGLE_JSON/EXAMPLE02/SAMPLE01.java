package JAVACORE_TRAINING.OOPS_CONCEPTS.JSON_MODULES.OPTIONS_DEMO.GOOGLE_JSON.EXAMPLE02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.google.gson.Gson;

public class SAMPLE01 {

    public static void main(String[] args) {
        // 1. Khai báo và khởi tạo List<Student>
        List<Students> lisStudent = new ArrayList<Students>();

        // 2. Khai báo và khởi tạo các đối tượng
        Students SV001 = new Students();
        Students SV002 = new Students();

        SV001.setiRollNo(100);
        SV001.setsFullName("Nguyễn Văn A");
        SV001.setdMark(8.5);

        SV002.setiRollNo(200);
        SV002.setsFullName("Hoàng Văn B");
        SV002.setdMark(9.5);
        
        // 3. Đưa các đối tượng Sinh Viên vào danh sách SV
        lisStudent.add(SV001);
        lisStudent.add(SV002);

        // 4. Khai báo và khởi tạo đối tượng của Gson
        Gson objG = new Gson();
        
        // 5. Chuyển dữ liệu trong List<T> --> thành format JSon
        String JSonString = objG.toJson(lisStudent); // [{"RollNo":"100",...},{"RollNo":"200",...}]
        
        // 6. Tích hợp components có sẵn để thực hiện việc lưu xuống file
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
		String FileName = "";
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			FileName = objFile.getSelectedFile().getPath();
			
			// 7. Sử dụng đối tượng FileWriter
	        FileWriter objFW;
	        try {
	            objFW = new FileWriter(new File(FileName));
	            objFW.write(JSonString);
	            objFW.close();
	            JOptionPane.showMessageDialog(null,
						String.format("Dữ liệu đã được ghi vào: [%s] thành công!!!",
											FileName));
	        } catch (IOException e) {
	            System.out.println("Có lỗi xảy ra: " + e.getMessage());
	        }
		}	
    }
}
