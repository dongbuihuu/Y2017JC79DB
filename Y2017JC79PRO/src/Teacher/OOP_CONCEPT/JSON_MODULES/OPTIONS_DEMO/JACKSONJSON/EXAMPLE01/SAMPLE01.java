package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.EXAMPLE01;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.map.ObjectMapper;

public class SAMPLE01 {

	public static void main(String[] args) {
		//1. Khai báo & khởi tạo ra 01 đối tượng Sinh Viên với đầy đủ
		 //thông tin.
		Student objStudent = new Student();
		objStudent.setiRollNo(100);
		objStudent.setsFullName("Nguyễn Văn A");
		objStudent.setdMark(8.5);
		
		//2. Khai báo và khởi tạo đối tượng thuộc của lớp đối tượng là ObjectMapper.
		ObjectMapper objMap = new ObjectMapper();
		
		//3. Tích hợp phần mã lệnh cho phép chúng ta có thể dễ dàng...
		JFileChooser objFile = new JFileChooser();
        objFile.setCurrentDirectory(new java.io.File("D:\\"));
        objFile.setDialogTitle("Chọn file: ");
        objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        String[] EXTENSION = new String[] { "json","xml"};
        FileNameExtensionFilter filter = 
        			new FileNameExtensionFilter("Database files",  EXTENSION);
        objFile.setFileFilter(filter);
        objFile.setMultiSelectionEnabled(false);

        int iOption = objFile.showSaveDialog(null);     
        String FileName = "";
        if (iOption == JFileChooser.APPROVE_OPTION) {           
            FileName = objFile.getSelectedFile().getPath();
          
            // 4. Ghi dữ liệu Object Java xuống files JSON
            // writeValue(<đường dẫn tới file đã khởi tạo>, 
            //<dữ liệu nguồn cần ghi xuống files>);
            try {
            	objMap.writeValue(new File(FileName), objStudent);            	
            	JOptionPane.showMessageDialog(null,
            				"Đã ghi dữ liệu xuống files thành công!!!");
            	//{"iRollNo":100, "sFullName": "Nguyễn Văn A", "dMark":8.5}            	
               
            } catch (Exception e) {
                System.out.println("Có lỗi xảy ra: " + e.getMessage());
            }
         }
	}
}
