package Teacher.Y2017JC79.XML_module.XML_Demo.Demo_XML_NoLib.Demo_ReadXMLFile_NoLib;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.FilePath;

public class ReadXMLAuto {

	public static void main(String[] args) {
		// 1. Hiển thị hộp thoại chọn file
		File file = FilePath.openFile();
		// 2. Xử lý đọc XML
		if (file.exists()) {
			try {
				DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
				Document doc = docBuilder.parse(file);

				doc.getDocumentElement().normalize();
				// 3. Hien thi root node
				System.out.println("Root node: " + doc.getDocumentElement().getNodeName());

				// 4. Goi ham printNode
				if (doc.hasChildNodes()) {
					printAllNode(doc.getChildNodes());
				}

			} catch (Exception e) {

			}

		}

	}

	public static void printAllNode(NodeList nodeList) {
		for (int count = 0; count < nodeList.getLength(); count++) {
			Node tempNode = nodeList.item(count);

			if (tempNode.getNodeType() == Node.ELEMENT_NODE) {
				System.out.println("\nNode Name =" + tempNode.getNodeName() + " [OPEN]");
				System.out.println("Node Value =" + tempNode.getTextContent());
			}
			// if (tempNode.hasAttributes()) {
			//
			// // get attributes names and values
			// NamedNodeMap nodeMap = tempNode.getAttributes();
			//
			// for (int i = 0; i < nodeMap.getLength(); i++) {
			//
			// Node node = nodeMap.item(i);
			// System.out.println("attr name : " + node.getNodeName());
			// System.out.println("attr value : " + node.getNodeValue());
			//
			// }
			//
			// }

			if (tempNode.hasChildNodes()) {

				// loop again if has child nodes
				printAllNode(tempNode.getChildNodes());

			}

			System.out.println("Node Name =" + tempNode.getNodeName() + " [CLOSE]");

		}
	}
}
