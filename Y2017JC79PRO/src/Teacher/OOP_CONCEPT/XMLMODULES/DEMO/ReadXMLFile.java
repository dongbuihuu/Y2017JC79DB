package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.XMLMODULES.DEMO;

import java.io.File;
import java.io.ObjectInputStream.GetField;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXMLFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// --> Sử dụng công nghệ cao? <Ctrl + C & Ctrl + V>
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
				File fXmlFile = new File(FileName);
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(fXmlFile);

				doc.getDocumentElement().normalize();
				System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
				NodeList nList = doc.getElementsByTagName("Student");
				System.out.println("----------------------------");
				int i = nList.getLength();
				//System.out.println(i);
				
				List<Student> lisStudent = new ArrayList<>();
				
				for (int j = 0; j < i; j++) {
					Node nNode = nList.item(j);
					System.out.println("\nCurrent Element :" + nNode.getNodeName());
					
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
						Element eElement = (Element) nNode;
						Student objStudent = new Student();
						objStudent.setId(Integer.parseInt(""+eElement.getAttribute("Id")));
						objStudent.setRollNo(eElement.getElementsByTagName("RollNo")
																		.item(0).getTextContent());
						objStudent.setFullName(eElement.getElementsByTagName("FullName")
																		.item(0).getTextContent());
						objStudent.setMark(Double.parseDouble(""+eElement.getElementsByTagName("Mark")
																		.item(0).getTextContent()));
						lisStudent.add(objStudent);
					}
				}
				
				for (Student student : lisStudent) {
					System.out.println(student);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}