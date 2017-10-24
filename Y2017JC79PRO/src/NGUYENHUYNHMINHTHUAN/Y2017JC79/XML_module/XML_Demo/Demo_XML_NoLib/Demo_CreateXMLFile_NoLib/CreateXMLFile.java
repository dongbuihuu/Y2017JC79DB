package Teacher.OOP_CONCEPT.XMLMODULES.DEMO;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXMLFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Student> lisStudent = new ArrayList<>();
		Student objS01 = new Student();
		objS01.setId(100);
		objS01.setRollNo("SV001");
		objS01.setFullName("Nguyễn Văn A");
		objS01.setMark(8.5);

		Student objS02 = new Student();
		objS02.setId(200);
		objS02.setRollNo("SV002");
		objS02.setFullName("Nguyễn Văn B");
		objS02.setMark(9.5);

		Student objS03 = new Student();
		objS03.setId(300);
		objS03.setRollNo("SV003");
		objS03.setFullName("Nguyễn Văn C");
		objS03.setMark(8.5);

		Student objS04 = new Student();
		objS04.setId(400);
		objS04.setRollNo("SV004");
		objS04.setFullName("Nguyễn Văn D");
		objS04.setMark(9.5);

		lisStudent.add(objS01);
		lisStudent.add(objS02);
		lisStudent.add(objS03);
		lisStudent.add(objS04);

		// --> Sử dụng công nghệ cao? <Ctrl + C & Ctrl + V>
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
		}
		StudentMetaData objMta = new StudentMetaData();
		objMta.setmLisStudent(lisStudent);
		objMta.setsFileName(FileName);

		WriteXMLDatabaseFile(objMta);
		JOptionPane.showMessageDialog(null, ":D");
	}

	static void WriteXMLDatabaseFile(StudentMetaData objMetadata) {
		try {
			// 1. Khai báo và khởi tạo các đối tượng của
			// DocumentBuilderFactory<newInstance>
			// DocumentBuilder để tạo ra 1 bản DocumentBuilbder để gắn dữ liệu
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// Tạo ra đối tượng Document XML để gắn trực tiếp dữ liệu vào đó.
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("IMIC");
			doc.appendChild(rootElement);

			for (Student objStudent : objMetadata.getmLisStudent()) {
				// student elements
				Element student = doc.createElement("Student");
				rootElement.appendChild(student);

				// Thiết lập attribute cho student element
				Attr attr = doc.createAttribute("Id");
				attr.setValue("" + objStudent.getId());
				student.setAttributeNode(attr);

				// RollNo Elements
				Element rollNo = doc.createElement("RollNo");
				rollNo.appendChild(doc.createTextNode(objStudent.getRollNo()));
				student.appendChild(rollNo);

				// FullName Elements
				Element fullName = doc.createElement("FullName");
				fullName.appendChild(doc.createTextNode(objStudent.getFullName()));
				student.appendChild(fullName);

				// Mark Elements
				Element mark = doc.createElement("Mark");
				mark.appendChild(doc.createTextNode("" + objStudent.getMark()));
				student.appendChild(mark);
			}

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);

			StreamResult result = new StreamResult(objMetadata.getsFileName());
			transformer.transform(source, result);
			// System.out.println("File saved!");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}
}
