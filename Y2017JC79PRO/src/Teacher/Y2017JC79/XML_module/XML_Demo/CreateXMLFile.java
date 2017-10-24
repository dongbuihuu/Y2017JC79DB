package Teacher.Y2017JC79.XML_module.XML_Demo;

import java.net.URL;

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
	public static void main(String[] args) {
		try {

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// Gốc XML
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("iMIC");
			doc.appendChild(rootElement);

			// student elements
			Element student = doc.createElement("student");
			rootElement.appendChild(student);

			// Thiết lập attribute cho student element
			Attr attr = doc.createAttribute("rollno");
			attr.setValue("111");
			student.setAttributeNode(attr);

			// firstname elements
			Element firstname = doc.createElement("firstname");
			firstname.appendChild(doc.createTextNode("Nguyễn"));
			student.appendChild(firstname);

			// lastname elements
			Element lastname = doc.createElement("lastname");
			lastname.appendChild(doc.createTextNode("Văn A"));
			student.appendChild(lastname);

			// UserName elements
			Element username = doc.createElement("username");
			username.appendChild(doc.createTextNode("doannv"));
			student.appendChild(username);

			// salary elements
			Element salary = doc.createElement("salary");
			salary.appendChild(doc.createTextNode("100000"));
			student.appendChild(salary);

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			ClassLoader objcls = Thread.currentThread().getContextClassLoader();
			URL url = objcls.getResource("DEMOXML/");
			StreamResult result = new StreamResult(url.getPath().toString() + "iMIC.xml");

			transformer.transform(source, result);
			System.out.println("File saved!");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}
}