package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.EXAMPLE01;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class SAMPLE02 {

	public static void main(String[] args) {
		//1. Khai báo và khởi tạo đối tượng thuộc ObjectMapper?
		ObjectMapper objMap = new ObjectMapper();
		
		//2. Tích hợp phần mã lệnh cho phép chúng ta có thể dễ dàng
	       //lưu được file hoặc đọc đc file *.json ở đâu đó.
		JFileChooser objFile = new JFileChooser();
        objFile.setCurrentDirectory(new java.io.File("."));
        objFile.setDialogTitle("Chọn file JSON: ");
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
            
            try {
				Student objStudent = objMap.readValue( new File(FileName), 
																	Student.class);
				JOptionPane.showMessageDialog(null, objStudent);
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
	}
}
