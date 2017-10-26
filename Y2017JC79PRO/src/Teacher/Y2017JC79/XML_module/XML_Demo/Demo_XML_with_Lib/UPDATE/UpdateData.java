package Teacher.Y2017JC79.XML_module.XML_Demo.Demo_XML_with_Lib.UPDATE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class UpdateData {
	public static void main(String[] args) {
		/*
		 * - List<T> lisT - List<Object> lisObject - String sPathFile - String
		 * sAttributeKey - String sElementNode
		 */
		// 1. Khai báo & khởi tạo 1 list object
		List<StudentObject> lisStudent = new ArrayList<StudentObject>();
		StudentObject objStudent = new StudentObject();
		objStudent.setId(200);
		objStudent.setiRollNo(100);
		objStudent.setsFullName("Trần Thị Thanh Hằng");
		objStudent.setdMark(9.5);
		lisStudent.add(objStudent);
		/*
		 * - Dữ liệu trong XML Files : <Student id="2"> <iRollNo>SV002</iRollNo>
		 * <sFullName>Trần Thị B</sFullName> <dMark>7.5</dMark> </Student>
		 * 
		 * - Dữ liệu cần cập nhật thành: <Student id="2"> <iRollNo>100</iRollNo>
		 * <sFullName>Trần Thị Thanh Hằng</sFullName> <dMark>9.5</dMark> </Student>
		 */
		List<Object> lisData = new ArrayList<Object>();
		StudentObject objS = lisStudent.get(0);
		lisData.add(objS.getId());
		lisData.add(objS.getiRollNo());
		lisData.add(objS.getsFullName());
		lisData.add(objS.getdMark());

		// 2. Tích hợp components có sẵn để thực hiện việc lưu xuống file
		// ở 1 đường dẫn nào đó <tùy chọn của người dùng>.
		JFileChooser objFile = new JFileChooser();
		objFile.setCurrentDirectory(new java.io.File("."));
		objFile.setDialogTitle("Chọn file: ");
		objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		String[] EXTENSION = new String[] { "xml" };
		FileNameExtensionFilter filter = new FileNameExtensionFilter("XML Database files", EXTENSION);
		objFile.setFileFilter(filter);
		objFile.setMultiSelectionEnabled(false);

		int returnVal = objFile.showOpenDialog(null);
		String FileName = "";
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			FileName = objFile.getSelectedFile().getPath();

			try {
				XMLParams<StudentObject> objXMLParam = new XMLParams<StudentObject>();
				objXMLParam.lisField = lisStudent;
				objXMLParam.lisObject = lisData;
				objXMLParam.sPathFile = FileName;
				objXMLParam.sAttributeKey = "id";
				objXMLParam.sElementNode = "Student";

				// 4. Khai báo và khởi tạo đối tượng của XMLControllers
				XMLController<Boolean> objController = new XMLController<>();

				// 5. Ủy quyền thực thi nghiệp vụ
				boolean isResult = objController.XMLExecute(objXMLParam, (byte) 1);
				if (isResult) {
					JOptionPane.showMessageDialog(null, "Cập nhật thành công!!!");
					int iOpt = JOptionPane.showConfirmDialog(null, "Bạn có muốn xem dữ liệu sau cập nhật?", "Thông báo",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

					// TH: Người dùng chọn là Yes --> Hiển thị lại dữ liệu
					if (iOpt == 0) {
						// a. Khởi tạo lại Controller với
						// E = List<List<HashMap<String, String>>>
						XMLController<List<List<HashMap<String, String>>>> objControllers = new XMLController<>();

						// b. Khai báo ra 1 HashMap để nhận dữ liệu trả về
						List<List<HashMap<String, String>>> lisHashmap = objControllers.XMLExecute(objXMLParam,
								(byte) 0);

						// c. Duyệt và hiển thị dữ liệu trong file *.xml đã có sự thay đổi
						List<HashMap<String, String>> lisResult = lisHashmap.get(0);
						for (HashMap<String, String> objHash : lisResult) {
							System.out.println("+ Id: " + objHash.get("id"));
							System.out.println("+ RollNo: " + objHash.get("iRollNo"));
							System.out.println("+ FullName: " + objHash.get("sFullName"));
							System.out.println("+ Mark: " + objHash.get("dMark"));
							System.out.println();
						}
					}
				}
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}
