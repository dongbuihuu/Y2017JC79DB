package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.XMLMODULES.DEMO;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
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

public class CreateXMLWithLIBs {
	public static void main(String[] args) {
		//1. Khai báo và khởi tạo danh sách Sinh Viên
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
		
		// 2. Sử dụng công nghệ cao? <Ctrl + C & Ctrl + V>
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
		
		//3. Chuyển dữ liệu từ List Student --> List<List<Object>>
		List<List<Object>> lilisObject = AddListObject(lisStudent);
		
		//4. Tạo ra đối tượng của XML Param
		XMLParams<Student> objXML = new XMLParams<>();
		objXML.lisObject = lisStudent;
		objXML.lisListObject = lilisObject;
		objXML.sPathFile = FileName;
		objXML.sRootNode = "IMIC";
		objXML.sElementNode = "Student";
		objXML.isWriteType = true;
		
		WriteXMLDatabaseFile(objXML);
	}
	
	static List<List<Object>> AddListObject(List<Student> lisStudent){
		List<List<Object>> lisObject = new ArrayList<List<Object>>();		
		for(Student objStudent : lisStudent){
			List<Object> lisO = new ArrayList<>();
			lisO.add(objStudent.getId());
			lisO.add(objStudent.getRollNo());
			lisO.add(objStudent.getFullName());
			lisO.add(objStudent.getMark());
			lisObject.add(lisO);
		}
		return lisObject;
	}
	
	static void WriteXMLDatabaseFile(XMLParams objXMLParam) {
		try {
			// 1. Khai báo và khởi tạo các đối tượng của
			// DocumentBuilderFactory<newInstance>
			// DocumentBuilder để tạo ra 1 bản DocumentBuilbder để gắn dữ liệu
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// Tạo ra đối tượng Document XML để gắn trực tiếp dữ liệu vào đó.
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement(objXMLParam.sRootNode);
			doc.appendChild(rootElement);
			
			//Lấy động các field dựa List<T>
			Field[] objF = objXMLParam.lisObject.get(0).getClass().getDeclaredFields();
			List<String> lisField = new ArrayList<String>();
			for (int i = 0; i < objF.length; i++) {
				lisField.add(objF[i].getName());
			}

			for (int i = 0;i<objXMLParam.lisListObject.size();i++) {
				List<Object> lisO = (List<Object>) objXMLParam.lisListObject.get(i);
				
				// student elements
				Element student = doc.createElement(objXMLParam.sElementNode);
				rootElement.appendChild(student);
				
				for(int j = 0;j<lisField.size();j++){
					if(j == 0){
						// Attribute
						Attr attr = doc.createAttribute(lisField.get(0));
						attr.setValue("" + lisO.get(0));
						student.setAttributeNode(attr);
					}else{
						// Elements
						Element element = doc.createElement(lisField.get(j));
						element.appendChild(doc.createTextNode("" + lisO.get(j)));
						student.appendChild(element);
					}
				}				
			}
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);

			StreamResult result = new StreamResult(objXMLParam.sPathFile);
			transformer.transform(source, result);
			// System.out.println("File saved!");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}
}
