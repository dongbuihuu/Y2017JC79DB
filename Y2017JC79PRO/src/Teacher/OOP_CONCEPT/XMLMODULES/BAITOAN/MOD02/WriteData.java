package JAVACORE_TRAINING.XMLMODULES.BAITOAN.MOD02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import JAVACORE_TRAINING.XMLMODULES.BAITOAN.MOD01.Student;

public class WriteData {
	public static void main(String[] args) {
		//1.  Khai báo đối tượng
				List<Student> lisStudent = new ArrayList<>();
				
				//2.
				String sExit = "";
				Scanner sc = null;
				int iCount = 0;
				do{
					sc = new Scanner(System.in);
					System.out.println("- Student: "+ (iCount+1));
					Student objStudent = new Student();
					
					System.out.println("- Id<Int>: ");
					objStudent.setId(sc.nextInt());
					
					System.out.println("- RollNo<String>: ");
					sc.nextLine();
					objStudent.setRollNo(sc.nextLine());
					
					System.out.println("- FullName<String>: ");
					objStudent.setFullName(sc.nextLine());
					
					System.out.println("- Mark<double>: ");			
					objStudent.setMark(sc.nextDouble());
					lisStudent.add(objStudent);
					iCount++;
					
					System.out.println(String.format("- Hiện có: %s Sinh viên trong danh sách!", 
																		lisStudent.size()));
					
					System.out.println("- Bạn nhập đã chán chưa? Y/N");
					sc = new Scanner(System.in);
					sExit = sc.nextLine();
				}while(!sExit.toUpperCase().equals("Y"));
				
				//2. Khai báo và khởi tạo 1 List<List<Object>> chứa tập dữ liệu
				List<List<Object>> lisListObject = new ArrayList<>();
				
				//3. Duyệt danh sách và lấy ra toàn bộ dữ liệu để đưa vào List<List<Object>>		
				for (Student objS : lisStudent) {
					//a. Khởi tạo 1 đối tượng List<Object> để chứa dữ liệu của 
					//1 đối tượng Sinh Viên
					List<Object> lisO = new ArrayList<>();
					lisO.add(objS.getId());
					lisO.add(objS.getRollNo());
					lisO.add(objS.getFullName());
					lisO.add(objS.getMark());
					
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
						XMLParams<Student> objXMLParam = 
												new XMLParams<Student>();
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
									 System.out.println("+ Id: "+ objHash.get("Id"));
									 System.out.println("+ RollNo: "+ objHash.get("RollNo"));
									 System.out.println("+ FullName: "+ objHash.get("FullName"));
									 System.out.println("+ Mark: "+ objHash.get("Mark"));
									 System.out.println();
								 }
							}
						}					
					}catch(Exception ex){
						System.out.println(ex.getMessage());
					}
				}				
		System.out.println("- Tổng số có: "+ lisStudent.size());			
	}
}
