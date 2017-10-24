package Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.sample01_object_with_json;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.map.ObjectMapper;

import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.EntityStudent;

public class ReadFileObject {
	public static void main(String[] args) {
		// 0. Khai bao bien khoi tao doi tuong cua ObjectMaper cua Jackson json
		ObjectMapper objMapper = new ObjectMapper();

		// 1. Hien thi hop thoai de chon noi de luu
		JFileChooser fileChooser = new JFileChooser(); // Khai bao lop doi tuong
		fileChooser.setDialogTitle("Open File"); // Hien thi tieu de cua hop thoai
		fileChooser.setCurrentDirectory(new File("C:\\Users\\dongbh\\Desktop\\FileJson")); // Thiet lap Duong dan thu
		fileChooser.setMultiSelectionEnabled(false); // muc default can mo
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		// Cho hien thi ca thu muc va file
		// Chi muon loc ra cac file chi co duoi la *.json, *.XML...
		String[] extensions = new String[] { "json", "xml" };
		FileNameExtensionFilter filters = new FileNameExtensionFilter("DataBase files", extensions);
		fileChooser.setFileFilter(filters);

		// Goi hop thoai len (bang giao dien)
		int result = fileChooser.showOpenDialog(null);

		if (result == JFileChooser.APPROVE_OPTION) {
			File filePath = fileChooser.getSelectedFile();
			String strFile = filePath.getAbsolutePath(); // Duong dan toi cho ma ta muon luu
			try {
				// objMapper.writeValue(new File(strFile), objStudent);
				EntityStudent objStudent = objMapper.readValue(new File(strFile), EntityStudent.class);

				// JOptionPane.showMessageDialog(null, "Đã đọc thành công !!");
				// Diplay information the student to interface of end user
				System.out.println("Mã sinh viên là: " + objStudent.getiID());
				System.out.println("Tên sinh viên là: " + objStudent.getsFullName());
				System.out.println("Điểm sinh viên là: " + objStudent.getdMark());

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
