package first_programming_truongnm.jasonmodule;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.map.ObjectMapper;

public class MainApp {

	public static void main(String[] args) {
		// Khai báo lớp đối tượng
		// 0. Khai báo biến khởi tạo đối tượng của ObjectMapper của Jackson Json

		ObjectMapper objMapper = new ObjectMapper();

		// 1. Hiển thị hộp thoại chọn nơi để lưu
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Open File"); // Hiển thị tiêu đề của hộp thoại
		fileChooser.setCurrentDirectory(new File("C:\\Users\\Dell Precision\\Desktop\\FileJson"));// Thiết lập đường dẫn
																									// thư mục default
																									// cần mở

		fileChooser.setMultiSelectionEnabled(false);// Thiet lap chon 01 file
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);// Cho hien thi ca thu muc va file
		// Chi muon loc ra cac file chi co duoi *.Json, *.XML
		String[] extensions = new String[] { "json", "XML" };
		FileNameExtensionFilter filters = new FileNameExtensionFilter("DataBase files", extensions);
		fileChooser.setFileFilter(filters);

		// GOi hop thoai bang giao dien

		int result = fileChooser.showSaveDialog(null);

		// 2. Tao doi tuong can luu
		Student objStudent = new Student();
		objStudent.setFullname("Nguyen Van A");
		objStudent.setMark(8.5);
		objStudent.setRollNo(100);

		if (result == JFileChooser.APPROVE_OPTION) {
			File filePath = fileChooser.getSelectedFile();
			String strFile = filePath.getAbsolutePath(); // Duong dan den cho ta muon luu
			try {
				objMapper.writeValue(new File(strFile), objStudent);
				JOptionPane.showMessageDialog(null, "Đã lưu thành công");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
