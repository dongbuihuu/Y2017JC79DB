package first_programming_truongnm.json02;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.map.ObjectMapper;

import first_programming_truongnm.jasonmodule.Student;

public class ReadFileObject {

	public static void main(String[] args) {
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

		int result = fileChooser.showOpenDialog(null);

		if (result == JFileChooser.APPROVE_OPTION) {
			File filePath = fileChooser.getSelectedFile();
			String strFile = filePath.getAbsolutePath(); // Duong dan den cho ta muon luu
			try {
				// objMapper.writeValue(new File(strFile), objStudent);
				Student objStudent = objMapper.readValue(new File(strFile), Student.class);
				JOptionPane.showMessageDialog(null, "Đã đọc thành công");
				// Display information the student to interface of end user
				System.out.println("Mã sinh viên là: " + objStudent.getFullname());
				System.out.println("Mã sinh viên là: " + objStudent.getMark());
				System.out.println("Mã sinh viên là: " + objStudent.getRollNo());
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
