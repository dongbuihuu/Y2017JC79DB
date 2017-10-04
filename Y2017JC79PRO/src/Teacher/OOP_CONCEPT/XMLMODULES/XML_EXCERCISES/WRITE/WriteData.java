package JAVACORE_TRAINING.OBJECT_AND_CLASSES.XML_MODULES.XML_EXCERCISES.WRITE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import JAVACORE_TRAINING.OBJECT_AND_CLASSES.XML_MODULES.XML_EXCERCISES.StudentObject;
import JAVACORE_TRAINING.OBJECT_AND_CLASSES.XML_MODULES.XML_EXCERCISES.XMLController;
import JAVACORE_TRAINING.OBJECT_AND_CLASSES.XML_MODULES.XML_EXCERCISES.XMLParams;

public class WriteData {
	public static void main(String[] args) {
		/*
		 * Nghiệp vụ ghi dữ liệu xuống XML Files
		 * - List<T> lisT
	     * - List<List<Object>> lisListObject
	     * - String sRootNode
	     * - String sElementNode
	     * - String sPathFile
	     * - boolean isWriteType
		 * */
		// 1. Khai báo & khởi tạo 1 list object
		List<StudentObject> lisStudent = new ArrayList<StudentObject>();
		
		//a. Khai báo ra 04 đối tượng Sinh Viên
		StudentObject objSV01 = new StudentObject();
		StudentObject objSV02 = new StudentObject();
		StudentObject objSV03 = new StudentObject();
		StudentObject objSV04 = new StudentObject();
		
		//b. Khởi tạo đầy đủ thông tin cho 04 đối tượng này
		objSV01.setId(1);
		objSV01.setiRollNo(1001);
		objSV01.setsFullName("Nguyễn Văn A");
		objSV01.setdMark(6.5);
		
		objSV02.setId(2);
		objSV02.setiRollNo(1002);
		objSV02.setsFullName(" Trần Thị B");
		objSV02.setdMark(7.5);
		
		objSV03.setId(3);
		objSV03.setiRollNo(1003);
		objSV03.setsFullName(" Hoàng Văn C");
		objSV03.setdMark(8.5);
		
		objSV04.setId(4);
		objSV04.setiRollNo(1004);
		objSV04.setsFullName(" Phạm Thị D");
		objSV04.setdMark(9.5);
		
		//c. Đưa 04 đối tượng Sinh Viên vào trong danh sách
		lisStudent.add(objSV01);
		lisStudent.add(objSV02);
		lisStudent.add(objSV03);
		lisStudent.add(objSV04);
		
		//2. Khai báo và khởi tạo 1 List<List<Object>> chứa tập dữ liệu
		List<List<Object>> lisListObject = new ArrayList<>();
		
		//3. Duyệt danh sách và lấy ra toàn bộ dữ liệu để đưa vào List<List<Object>>		
		for (StudentObject objS : lisStudent) {
			//a. Khởi tạo 1 đối tượng List<Object> để chứa dữ liệu của 
			//1 đối tượng Sinh Viên
			List<Object> lisO = new ArrayList<>();
			lisO.add(objS.getId());
			lisO.add(objS.getiRollNo());
			lisO.add(objS.getsFullName());
			lisO.add(objS.getdMark());
			
			//b. Đưa List<Object> vào List<List<Object>>
			lisListObject.add(lisO);
		}
		
		// 4. Tích hợp components có sẵn để thực hiện việc lưu xuống file
		// ở 1 đường dẫn nào đó <tùy chọn của người dùng>.
		JFileChooser objFile = new JFileChooser();
		objFile.setCurrentDirectory(new java.io.File("."));
		objFile.setDialogTitle("Chọn file: ");
		objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		String[] EXTENSION = new String[] { "xml" };
		FileNameExtensionFilter filter = new FileNameExtensionFilter("XML Database files", EXTENSION);
		objFile.setFileFilter(filter);
		objFile.setMultiSelectionEnabled(false);

		int returnVal = objFile.showSaveDialog(null);
		String FileName = "";
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			FileName = objFile.getSelectedFile().getPath();
			
			try{
				//5. Khai báo đối tượng chứa các tham số cấu hình
				XMLParams<StudentObject> objXMLParam = 
										new XMLParams<StudentObject>();
				objXMLParam.lisField = lisStudent;
				objXMLParam.lisListObject = lisListObject;
				objXMLParam.sRootNode = "IMIC";				
				objXMLParam.sElementNode = "Student";	
				objXMLParam.sPathFile = FileName;
				objXMLParam.isWriteType = true;
				
				//6. Khai báo và khởi tạo đối tượng của XMLControllers
				XMLController<Boolean>
				     objController = new XMLController<>();
				
				//5. Ủy quyền thực thi nghiệp vụ				
				boolean isResult = objController.
								XMLExecute(objXMLParam, (byte) 2);
				if(isResult){
					JOptionPane.showMessageDialog(null, "Ghi dữ liệu xuống file thành công!!!");
					int iOpt = JOptionPane.showConfirmDialog(null, 
							"Bạn có muốn xem dữ liệu vừa ghi xuống file hay không?",
							"Thông báo", 
							JOptionPane.YES_NO_OPTION, 
							JOptionPane.QUESTION_MESSAGE);
					
					//TH: Người dùng chọn là Yes --> Hiển thị lại dữ liệu
					if(iOpt == 0){
						//a. Khởi tạo lại Controller với 
						// E = List<List<HashMap<String, String>>>
						XMLController<List<List<HashMap<String, String>>>>
						     objControllers = new XMLController<>();		
						
						//b. Khai báo ra 1 HashMap để nhận dữ liệu trả về 
						List<List<HashMap<String, String>>> lisHashmap = 
								objControllers.XMLExecute
											(objXMLParam, (byte) 0);
						 
						//c. Duyệt và hiển thị dữ liệu trong file *.xml đã có sự thay đổi	
						 List<HashMap<String, String>> lisResult = lisHashmap.get(0);
						 for (HashMap<String, String> objHash : lisResult) {
							 System.out.println("+ Id: "+ objHash.get("id"));
							 System.out.println("+ RollNo: "+ objHash.get("iRollNo"));
							 System.out.println("+ FullName: "+ objHash.get("sFullName"));
							 System.out.println("+ Mark: "+ objHash.get("dMark"));
							 System.out.println();
						 }
					}
				}					
			}catch(Exception ex){
				System.out.println(ex.getMessage());
			}
		}		
	}
}
