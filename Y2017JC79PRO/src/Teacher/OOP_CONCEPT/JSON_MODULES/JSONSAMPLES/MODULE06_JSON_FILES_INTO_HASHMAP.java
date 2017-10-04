package JAVACORE_TRAINING.OBJECT_AND_CLASSES.JSON_MODULES.JSONSAMPLES;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class MODULE06_JSON_FILES_INTO_HASHMAP {

    public static void main(String[] args) {

        // 1. Sử dụng comps có sẵn để xuất hiện cửa sổ cho phép lưu files
        // ở 1 thư mục bất kỳ (ctrl + c --> ctrl + v)
        JFileChooser objFile = new JFileChooser();
        objFile.setCurrentDirectory(new java.io.File("."));
        objFile.setDialogTitle("Chọn file: ");
        objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        String[] EXTENSION = new String[] { "json" };
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JSON files", EXTENSION);
        objFile.setFileFilter(filter);
        objFile.setMultiSelectionEnabled(false);

        int returnVal = objFile.showOpenDialog(null);
        String ParentPath = "";
        String FileName = "";
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            // ParentPath = objFile.getSelectedFile().getParent();
            FileName = objFile.getSelectedFile().getPath();

            // 2. khai báo & khởi tạo đối tượng
            ObjectMapper objMapper = new ObjectMapper();

            // 3. Thực thi đọc dữ liệu từ files JSON --> danh sách sinh viên
            // trong java?
            try {
                HashMap<Integer, List<Student>> objHashStudent =  
                        objMapper.readValue(new File(FileName), 
                                new TypeReference<HashMap<Integer, List<Student>>>() {});
                
                //4. Duyệt dữ liệu & hiển thị ra bên ngoài màn hình
                //C1:
                for(int i = 0;i<objHashStudent.size();i++){
                    List<Student> lisStudent = objHashStudent.get(i);
                    for(Student objS : lisStudent){
                        System.out.println("+ RollNo: "+ objS.getRollNo());
                        System.out.println("+ FullName: "+ objS.getFullName());
                        System.out.println("+ Mark: "+ objS.getMark());
                    }
                }                
                //C2: List<Student> lisStudent = objHashStudent.get(0);         
		                /*for(Student objS : lisStudent){
		                    System.out.println("+ RollNo: "+ objS.getRollNo());
		                    System.out.println("+ FullName: "+ objS.getFullName());
		                    System.out.println("+ Mark: "+ objS.getMark());
		                }*/
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
