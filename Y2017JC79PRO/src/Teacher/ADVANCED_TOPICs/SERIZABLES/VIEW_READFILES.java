package JAVACORE_TRAINING.ADVANCED_TOPICs.SERIZABLES;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;



public class VIEW_READFILES {
    public static void main(String[] args) {
    	//1.
        JFileChooser objFile = new JFileChooser();
        objFile.setCurrentDirectory(new java.io.File("."));
        objFile.setDialogTitle("Chọn file: ");
        objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        String[] EXTENSION = new String[] { "dat" };
        FileNameExtensionFilter filter = new 
        			FileNameExtensionFilter("DAT files", EXTENSION);
        objFile.setFileFilter(filter);
        objFile.setMultiSelectionEnabled(false);

        int returnVal = objFile.showOpenDialog(null);     
        String FileName = "";
        if (returnVal == JFileChooser.APPROVE_OPTION) {        
            FileName = objFile.getSelectedFile().getPath();
            
            // 2. Khai báo & khởi tạo controllers
            CONTROLLERS objController = new CONTROLLERS();

            // 3. Đọc dữ liệu trong files *.dat --> bindding vào List<Student>
            List<Student> lisOut = new ArrayList<Student>();
            try {
                lisOut = objController.ReadObjects(FileName);

                // 3. Duyệt & hiển thị dữ liệu từ list<Student> ra bên ngoài
                PrintInfo(lisOut);               
            } catch (Exception e) {
                System.out.println("Err" + e.getMessage());
            }
        }        
    }    
    static void PrintInfo(List<Student> lisStudent){
    	for(Student objS : lisStudent){
        	System.out.println(String.format("--- %s ----", 
        							objS.getsFullName()));
        	System.out.println("+ iRollNo: "+ objS.getiRollNo());
        	System.out.println("+ sFullName: "+ objS.getsFullName());
        	System.out.println("+ Mark: "+ objS.getdMark());
        	
        	
        }
    }
}
