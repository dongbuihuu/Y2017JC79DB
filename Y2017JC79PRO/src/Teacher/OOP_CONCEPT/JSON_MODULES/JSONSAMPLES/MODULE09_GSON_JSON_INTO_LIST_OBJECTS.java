package JAVACORE_TRAINING.OBJECT_AND_CLASSES.JSON_MODULES.JSONSAMPLES;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MODULE09_GSON_JSON_INTO_LIST_OBJECTS {

    public static void main(String[] args) {
        // 1. Khai báo và khởi tạo đối tượng của Gson
        Gson objG = new Gson();

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

            // 3. Đọc dữ liệu trong files JSon chuyển vào List<T>
            try {
                BufferedReader objBR = new 
                        BufferedReader(new FileReader(FileName));

                // C1: Tường minh từng bước xử lý
                 //import java.lang.reflect.Type;
                 //Type listType = new TypeToken<List<Student>>() {}.getType(); 
                 //List<Student> objList = objG.fromJson(objBR, listType);
                 
                // C2:
                List<Student> objList = 
                        objG.fromJson(objBR, new TypeToken<List<Student>>(){}.getType());

                // 4. Duyệt và hiển thị thông tin
                for (int i = 0; i < objList.size(); i++) {                  
                    System.out.println("+ RollNo: " + objList.get(i).getRollNo());
                    System.out.println("+ FullName: " + objList.get(i).getFullName());
                    System.out.println("+ Mark: " + objList.get(i).getMark());
                }
            } catch (Exception e) {
                System.out.println("Có lỗi xảy ra: " + e.getMessage());
            }
        }
    }
}
