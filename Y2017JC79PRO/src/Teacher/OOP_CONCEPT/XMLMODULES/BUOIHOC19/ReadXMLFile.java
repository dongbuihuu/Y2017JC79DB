package Teacher.OOP_CONCEPT.XMLMODULES.BUOIHOC19;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXMLFile {
	public static void main(String[] args) {
		try {
			// 1. Đoạn mã lệnh sau sử dụng để lấy đường dẫn tương đối đến tài
			// nguyên
			// ClassLoader objcls =
			// Thread.currentThread().getContextClassLoader();
			// URL url = objcls.getResource("DEMOXML/Students.xml");

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

				// System.out.println(f.getPath());
				File fXmlFile = new File(FileName);
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(fXmlFile);

				doc.getDocumentElement().normalize();
				System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
				NodeList nList = doc.getElementsByTagName("Teacher");
				System.out.println("----------------------------");
				int i = nList.getLength();
				System.out.println(i);
				for (int temp = 0; temp < nList.getLength(); temp++) {
					Node nNode = nList.item(temp);
					System.out.println("\nCurrent Element :" + nNode.getNodeName());

					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
						Element eElement = (Element) nNode;
						System.out.println("Id : " + eElement.getAttribute("Id"));
						System.out.println(
								"TeacherId: " + eElement.getElementsByTagName("TeacherId").item(0).getTextContent());
						// lis.get(k)).item(0).getTextContent()
						System.out.println("Name: " + eElement.getElementsByTagName("Name").item(0).getTextContent());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
