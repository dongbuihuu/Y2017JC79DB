package JAVACORE_TRAINING.OBJECT_AND_CLASSES.JSON_MODULES.JSONSAMPLES;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.codehaus.jackson.map.ObjectMapper;

public class MODULE02_JSON_INTO_OBJECTS {
	
    public static void main(String[] args) {
    	
        //1. Khai báo & khởi tạo đối tượng ObjectMapper
        ObjectMapper objMapper = new ObjectMapper();
        
         // 2. Sử dụng comps có sẵn để xuất hiện cửa sổ cho phép lưu files
        // ở 1 thư mục bất kỳ (ctrl + c --> ctrl + v)
        JFileChooser objFile = new JFileChooser();
        objFile.setCurrentDirectory(new java.io.File("."));
        objFile.setDialogTitle("Chọn file: ");
        objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        String[] EXTENSION = new String[] { "json" };
        FileNameExtensionFilter filter = 
        			new FileNameExtensionFilter("JSON files", EXTENSION);
        objFile.setFileFilter(filter);
        objFile.setMultiSelectionEnabled(false);

        int returnVal = objFile.showOpenDialog(null);
        String ParentPath = "";
        String FileName = "";
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            // ParentPath = objFile.getSelectedFile().getParent();
            FileName = objFile.getSelectedFile().getPath();
            
            //3. Thực thi đọc dữ liệu từ files * .json
            try {            	
                Student objStudent = objMapper.readValue(new File(FileName), 
                				Student.class);
                System.out.println("+ RollNo: "+ objStudent.getRollNo());
                System.out.println("+ FullName: "+ objStudent.getFullName());
                System.out.println("+ Mark: "+ objStudent.getMark());                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
