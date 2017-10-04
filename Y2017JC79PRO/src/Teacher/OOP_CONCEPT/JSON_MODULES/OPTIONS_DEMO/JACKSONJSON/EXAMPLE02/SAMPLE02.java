package JAVACORE_TRAINING.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.EXAMPLE02;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class SAMPLE02 {

	public static void main(String[] args) {
		//1. Khai báo & khởi tạo ObjectMapper?
		ObjectMapper objMap = new ObjectMapper();
		
		//2. Tích hợp phần mã lệnh cho phép chúng ta có thể dễ dàng...
		JFileChooser objFile = new JFileChooser();
        objFile.setCurrentDirectory(new java.io.File("."));
        objFile.setDialogTitle("Chọn file: ");
        objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        String[] EXTENSION = new String[] { "json" };
        FileNameExtensionFilter filter = 
        			new FileNameExtensionFilter("JSON Database files", 
        								EXTENSION);
        objFile.setFileFilter(filter);
        objFile.setMultiSelectionEnabled(false);

        int returnVal = objFile.showOpenDialog(null);
        String ParentPath = "";
        String FileName = "";
        if (returnVal == JFileChooser.APPROVE_OPTION) {           
            FileName = objFile.getSelectedFile().getPath();
            
            //3. Khai báo & khởi tạo 1 Hashmap<Integer, List<Student>>?
            try {
				HashMap<Integer, List<Student>> objHash 
								= objMap.readValue(new File(FileName), 
								    new TypeReference<HashMap<Integer, 
								              List<Student>>>(){});			
				
				//4. Duyệt HashMap và hiển thị danh sách Sinh Viên?
				List<Student> lisStudent = objHash.get(0);
				
				//5. Sử dụng vòng lặp For hoặc ForEach để duyệt và hiển thị dữ liệu?
				for(Student objS : lisStudent){
					//JOptionPane.showMessageDialog(null, objS);
					System.out.println(objS);
				}
			} catch (Exception e) {
				System.out.println(":D");
			}
        }               
	}
}
