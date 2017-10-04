package JAVACORE_TRAINING.JSON_MODULES.JSONSAMPLES;

import java.io.File;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class MODULE04_JSON_FILES_INTO_LISTOBJECT {

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

            // 3. Thực thi đọc dữ liệu từ files JSON --> danh sách sinh viên trong java?
            try {
                List<Student> lisStudent = 
                        objMapper.readValue(new File(FileName), 
                                new TypeReference<List<Student>>() {});
                
                //4. Duyệt dữ liệu & hiển thị ra bên ngoài màn hình
                for(Student objS : lisStudent){
                    System.out.println("+ RollNo: "+ objS.getRollNo());
                    System.out.println("+ FullName: "+ objS.getFullName());
                    System.out.println("+ Mark: "+ objS.getMark());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
