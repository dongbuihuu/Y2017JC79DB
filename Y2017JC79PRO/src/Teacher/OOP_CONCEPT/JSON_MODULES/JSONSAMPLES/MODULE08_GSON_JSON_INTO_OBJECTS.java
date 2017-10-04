package JAVACORE_TRAINING.OBJECT_AND_CLASSES.JSON_MODULES.JSONSAMPLES;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.google.gson.Gson;

public class MODULE08_GSON_JSON_INTO_OBJECTS {

    public static void main(String[] args) {
        // 1. Khai báo và khởi tạo đối tượng của Gson
        Gson objGson = new Gson();

        // 2. Sử dụng comps có sẵn để xuất hiện cửa sổ cho phép lưu files
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

            // 3. Đọc dữ liệu trong files JSon chuyển vào Object
            try {
                BufferedReader objBR = new 
                        BufferedReader(new FileReader(FileName));

                Student objStudent = objGson.fromJson(objBR, 
                                                                    Student.class);

                System.out.println("+ RollNo: " + objStudent.getRollNo());
                System.out.println("+ FullName: " + objStudent.getFullName());
                System.out.println("+ Mark: " + objStudent.getMark());

            } catch (Exception e) {
                System.out.println("Có lỗi xảy ra: " + e.getMessage());
            }
        }
    }
}
