package JAVACORE_TRAINING.ADVANCED_TOPICs.SERIZABLES;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VIEWS {
    public static void main(String[] args) {
        // 1. Khai báo và khởi tạo List<Object>
        List<Student> lisStudent = new ArrayList<Student>();

        // 2. Khai báo các object
        Student sv01 = new Student();
        sv01.setiRollNo(1);
        sv01.setsFullName("Nguyễn Văn A");
        sv01.setdMark(8.5);

        Student sv02 = new Student();
        sv02.setiRollNo(2);
        sv02.setsFullName("Trần Thị B");
        sv02.setdMark(9.5);

        lisStudent.add(sv01);
        lisStudent.add(sv02);

        // 3. Khai báo và khởi tạo controller
        CONTROLLERS objController = new CONTROLLERS();

        // 4. Ủy quyền thực thi Ghi files
        try {
            // a. Ghi dữ liệu ra files
            JFileChooser objFile = new JFileChooser();
            objFile.setCurrentDirectory(new java.io.File("."));
            objFile.setDialogTitle("Chọn file: ");
            objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            String[] EXTENSION = new String[] { "dat" };
            FileNameExtensionFilter filter = new 
            			FileNameExtensionFilter("DAT files", EXTENSION);
            objFile.setFileFilter(filter);
            objFile.setMultiSelectionEnabled(false);

            int returnVal = objFile.showSaveDialog(null);       
            String FileName = "";
            if (returnVal == JFileChooser.APPROVE_OPTION) {              
            	FileName = objFile.getSelectedFile().getPath();            	
            	if (objController.WriteObjects(lisStudent, FileName)) {
                    JOptionPane.showMessageDialog
                    					(null, "Ghi files thành công!!!");            		
                }
            }
        } catch (Exception e) {
            System.out.println("Ghi files thất bại!!!");
            e.printStackTrace();
        }
    }
}
