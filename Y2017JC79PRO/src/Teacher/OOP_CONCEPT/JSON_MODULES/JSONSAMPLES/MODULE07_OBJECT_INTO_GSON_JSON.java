package JAVACORE_TRAINING.OBJECT_AND_CLASSES.JSON_MODULES.JSONSAMPLES;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.google.gson.Gson;

public class MODULE07_OBJECT_INTO_GSON_JSON {

    public static void main(String[] args) {
        // 1. Khai báo và khởi tạo List<đối tượng>
        List<Student> lisStudent = new ArrayList<Student>();

        // 2. Khai báo và khởi tạo các đối tượng
        Student objA = new Student();
        Student objB = new Student();

        objA.setRollNo(100);
        objA.setFullName("Nguyễn Văn A");
        objA.setMark(8.5);

        objB.setRollNo(200);
        objB.setFullName("Hoàng Văn B");
        objB.setMark(9.5);

        lisStudent.add(objA);
        lisStudent.add(objB);

        // 3. Sử dụng comps có sẵn để xuất hiện cửa sổ cho phép lưu files
        // ở 1 thư mục bất kỳ (ctrl + c --> ctrl + v)
        JFileChooser objFile = new JFileChooser();
        objFile.setCurrentDirectory(new java.io.File("."));
        objFile.setDialogTitle("Chọn file: ");
        objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        String[] EXTENSION = new String[] { "json" };
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JSON files", EXTENSION);
        objFile.setFileFilter(filter);
        objFile.setMultiSelectionEnabled(false);

        int returnVal = objFile.showSaveDialog(null);
        String ParentPath = "";
        String FileName = "";
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            // ParentPath = objFile.getSelectedFile().getParent();
            FileName = objFile.getSelectedFile().getPath();

            // 4. Khai báo và khởi tạo đối tượng của Gson
            Gson objG = new Gson();

            // 5. Chuyển dữ liệu trong List<T> --> thành format JSon
            String JSonString = objG.toJson(lisStudent); // {"RollNo":"100",...}

            // 6. Sử dụng đối tượng FileWriter
            FileWriter objFW;
            try {
                objFW = new FileWriter(new File(FileName));
                objFW.write(JSonString);
                objFW.close();
            } catch (Exception e) {
                System.out.println("Có lỗi xảy ra: " + e.getMessage());
            }
        }
    }
}
