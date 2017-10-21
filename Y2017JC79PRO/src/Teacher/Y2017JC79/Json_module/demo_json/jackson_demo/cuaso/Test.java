package Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.cuaso;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Test {
	public static void main(String[] args) {

		// Mục đích mở cửa sổ
		// 1. Gọi đối tượng JFileChooser
		JFileChooser fileChooser = new JFileChooser();
		// 2. Thiết lập tiêu đề
		fileChooser.setDialogTitle("Hãy chọn file");
		// 3. Thiết lập đường dẫn của thư mục defalt
		fileChooser.setCurrentDirectory(new File("C://Users//dongbh"));

		// 4. Thiết lập mode cho File
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		// 5. Thiết lập chỉ chọn 1 file
		fileChooser.setMultiSelectionEnabled(false);
		// 6. Lọc file
		String[] EXTENSION = new String[] { "json", "xml" };
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Database files", EXTENSION);
		fileChooser.setFileFilter(filter);

		int result = fileChooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			File files = fileChooser.getSelectedFile();
			String filePath = files.getAbsolutePath();

			System.out.println(filePath);

		}
	}

}
