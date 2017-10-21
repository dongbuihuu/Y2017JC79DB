package Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.Sample01;

import java.io.File;

import javax.swing.JOptionPane;

import org.codehaus.jackson.map.ObjectMapper;

public class MainApp {
	public static void main(String[] args) {
		FilePath filePath = new FilePath();
		ObjectMapper objMapper = new ObjectMapper();
		filePath.setOpenFile();
		//
		// Student objStudent = new Student();
		// objStudent.setRollNo(100);
		// objStudent.setFullName("Nguyễn Văn A");
		// objStudent.setMark(8.5);

		if (filePath.getFile() != null) {
			String strFile = filePath.getFile().getAbsolutePath();
			try {
				// objMapper.writeValue(new File(strFile), objStudent);
				Student student = objMapper.readValue(new File(strFile), Student.class);

				JOptionPane.showMessageDialog(null, student);
			} catch (Exception e) {
				e.printStackTrace();

			}

		}

	}

}
