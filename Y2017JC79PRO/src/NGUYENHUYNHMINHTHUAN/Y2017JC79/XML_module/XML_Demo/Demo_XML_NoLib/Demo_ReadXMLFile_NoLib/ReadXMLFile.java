package Teacher.Y2017JC79.XML_module.XML_Demo;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.FilePath;

public class ReadXMLFile {

	public static void main(String[] args) {
		try {
			// ClassLoader objcls = Thread.currentThread().getContextClassLoader();
			// URL url = objcls.getResource("DEMOXML/Students.xml");

			String strFile = null;
			File file = FilePath.openFile();
			if (file != null) {
				strFile = file.getAbsolutePath();
				// System.out.println(f.getPath());
				// File fXmlFile = new File(url.toURI());

				File fXmlFile = new File(strFile);

				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(fXmlFile);

				doc.getDocumentElement().normalize();
				System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
				NodeList nList = doc.getElementsByTagName("Student");
				System.out.println("----------------------------");
				int i = nList.getLength();
				System.out.println(i);

				for (int temp = 0; temp < nList.getLength(); temp++) {
					Node nNode = nList.item(temp);
					System.out.println("\nCurrent Element :" + nNode.getNodeName());

					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
						Element eElement = (Element) nNode;
						System.out.println("RollNo : " + eElement.getAttribute("ID"));
						System.out.println(
								"First Name : " + eElement.getElementsByTagName("FullName").item(0).getTextContent());
						System.out.println(
								"Last Name : " + eElement.getElementsByTagName("Mark").item(0).getTextContent());
					}
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
