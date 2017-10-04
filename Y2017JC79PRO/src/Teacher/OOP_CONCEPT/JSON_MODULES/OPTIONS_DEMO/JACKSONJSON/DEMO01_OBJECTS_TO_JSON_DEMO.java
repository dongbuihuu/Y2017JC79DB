package JAVACORE_TRAINING.OOPS_CONCEPTS.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.map.ObjectMapper;

/*
 * Sử dụng file thư viện Json Jackson - jackson-all-1.9.0.jar
 * */
public class DEMO01_OBJECTS_TO_JSON_DEMO {

    public static void main(String[] args) {
        // 1. Khai báo và khởi tạo đối tượng
        Students objStudent = new Students();
        objStudent.setRollNo(100);
        objStudent.setFullName("Nguyễn Văn A");
        objStudent.setMark(9.5);

        // 2. Khai báo và khởi tạo đối tượng ObjectMapper để có thể
        // Read và Write dữ liệu xuống files JSon.
        ObjectMapper objMaper = new ObjectMapper();

        // 3. Lấy đường dẫn tương đối đến Resources trong Solution đang phát
        // triển.
        JFileChooser objFile = new JFileChooser();
        objFile.setCurrentDirectory(new java.io.File("."));
        objFile.setDialogTitle("Chọn file: ");
        objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        String[] EXTENSION = new String[] { "xml" };
        FileNameExtensionFilter filter = new FileNameExtensionFilter("json Database files", EXTENSION);
        objFile.setFileFilter(filter);
        objFile.setMultiSelectionEnabled(false);

        int returnVal = objFile.showSaveDialog(null);
        String ParentPath = "";
        String FileName = "";
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            // ParentPath = objFile.getSelectedFile().getParent();
            FileName = objFile.getSelectedFile().getPath();

            // 4. Ghi dữ liệu Object Java xuống files JSON
            // writeValue(<đường dẫn tới file đã khởi tạo>, <dữ liệu nguồn cần
            // ghi
            // xuống files>);
            try {
                objMaper.writeValue(new File(FileName), objStudent);
                System.out.println("Đã ghi dữ liệu xuống files thành công!!!");
            } catch (Exception e) {
                System.out.println("Có lỗi xảy ra: " + e.getMessage());
            }
        }
    }
}
