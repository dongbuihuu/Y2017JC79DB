package BaseUltils.XMLLibs;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLModel {        
    /***
     * Nghiệp vụ đọc dữ liệu trong files XML có sẵn
    *  Cần các tham số:
    *  @param List T lisField
    *  @param string sElementNode
    *  @param string sPathFile
     * @throws Exception 
     */
    public List<List<HashMap<String, String>>> ReadElements(
    												XMLParams objXMLParam)
    														throws Exception {
        // Khai báo & khởi tạo các đối tượng
        List<List<HashMap<String, String>>> lisHash = new ArrayList<List<HashMap<String, String>>>();
        List<HashMap<String, String>> lisTemp = new ArrayList<HashMap<String, String>>();
        try {
            // 1. Khởi tạo đối tượng files (tham chiếu tới files)
            File fXmlFile = new File(objXMLParam.sPathFile);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = null;

            // 2. Kiểm tra files trước khi bindding dữ liệu trong files XML vào
            // Documents
            if (fXmlFile.exists()) {
                doc = dBuilder.parse(fXmlFile);
                doc.getDocumentElement().normalize();
                // 3. Lấy ra danh sách phần tử "Student"
                NodeList nList = doc.getElementsByTagName(objXMLParam.sElementNode);

                // 4. Khai báo và khởi tạo HashMap
                HashMap<String, String> objHash = null;

                int iItems = nList.getLength();
                // 4. Duyệt danh sách phần tử trong nList
                String key = "";
                String value = "";
                
                //5. Lấy ra các field từ List<T>
                /*
                 * objF[0] = "Id"
                 * objF[1] = "iRollNo"
                 * objF[2] = "sFullName"
                 * objF[3] = "dMark"
                 * */
                Field[] objF = objXMLParam.lisField.get(0).getClass().getDeclaredFields();
                List<String> lis = new ArrayList<String>();                
        		for (int i = 0; i < objF.length; i++) {
        			lis.add(objF[i].getName());
        		}
        		
        		//6. Duyệt và gắn dữ liệu vào từng trường thông tin
                for (int j = 0; j < iItems; j++) {
                    Node nNode = nList.item(j);
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        objHash = new HashMap<String, String>();
                        
                        for (int k = 0; k < lis.size(); k++) {
                            if (k == 0) {
                                // Identify atribute key - Id
                                key = "" + lis.get(k);
                                value = "" + eElement.getAttribute("" + lis.get(k));
                                objHash.put(key, value);
                            } else {
                                // Node items in Element Node
                                key = "" + lis.get(k);
                                value = ""
                                        + eElement.getElementsByTagName("" 
                                        + lis.get(k)).item(0).getTextContent();
                                objHash.put(key, value);
                            }
                        }
                        // 5. Gắn thông tin vào List<HashMap<String, String>>
                        lisTemp.add(objHash);
                    }
                }
                // 6. Add các List<HashMap<String, String>> vào trong
                // List<List<HashMap<String, String>>>
                lisHash.add(lisTemp);
            } else {
                return null;
            }
        } catch (Exception e) {
            throw e;
        }
        return lisHash;
    }
    
    /**
     * Nghiệp vụ xử lý ghi dữ liệu xuống XML files
     * @param List T lisT
     * @param List(List(Object)) lisListObject
     * @param String sRootNode
     * @param String sElementNode
     * @param String sPathFile
     * @param boolean isWriteType
     * @return true or false
     * @throws Exception
     */
    public Object WriteElements(XMLParams objXMLParam)
								 throws Exception {
        try {
            File xmlFile = null;
            File objFile = null;
            if (objXMLParam.isWriteType == false) {
                objFile = new File(objXMLParam.sPathFile);
                /*
                 * TRUE: có tồn tại files FALSE: ko tồn tại files
                 */
                if (objFile.exists()) {
                    try {
                        xmlFile = new File(objXMLParam.sPathFile);
                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
            //1. Khai báo và khởi tạo sự thể hiện của Documents XML
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
            Document doc = null;
            Element rootElement = null;
            Node rootNodeElement = null;
            //TH: Ghi mới ra files
            if (objXMLParam.isWriteType) {
                doc = docBuilder.newDocument();
                rootElement = doc.createElement(objXMLParam.sRootNode); // phần tử gốc
                doc.appendChild(rootElement);
            } else {
                //TH: Ghi nối tiếp ra files
                if (xmlFile != null) {
                    doc = docBuilder.parse(xmlFile);
                    rootNodeElement = doc.getFirstChild();
                } else {
                    return false;
                }
            }
            
            //2. Lấy ra các field từ List<T>
            Field[] objF = objXMLParam.lisField.get(0).getClass().getDeclaredFields();
            List<String> lisField = new ArrayList<String>();                
    		for (int i = 0; i < objF.length; i++) {
    			lisField.add(objF[i].getName());
    		}
    		
            //3. Duyệt danh sách và gắn các node vào docs
    		List<List<Object>> lisListTemp = new ArrayList<List<Object>>
    																(objXMLParam.lisListObject);
            for (int i = 0; i < objXMLParam.lisField.size(); i++) {
                Element childElement = doc.createElement(objXMLParam.sElementNode);
                // Kiểm tra kiểu ghi dữ liệu
                if (objXMLParam.isWriteType)
                    rootElement.appendChild(childElement);
                else
                    rootNodeElement.appendChild(childElement);

                //4. Duyệt danh sách các trường dữ liệu
                for (int j = 0; j < lisField.size(); j++) {
                    if (j == 0) {
                        // Id
                        Attr attr = doc.createAttribute("" + lisField.get(0));
                        attr.setValue("" + (lisListTemp.get(i)).get(j));
                        childElement.setAttributeNode(attr);
                    } else {
                        // ElementNode
                        Element nodeName = doc.createElement("" + lisField.get(j));
                        nodeName.appendChild(doc.createTextNode("" + lisListTemp.get(i).get(j)));
                        childElement.appendChild(nodeName);
                    }
                }
            }

            //5. Ghi toàn bộ dữ liệu xuống file XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);

            StreamResult result = null;
            if (objXMLParam.isWriteType) {
                File objfile = new File(objXMLParam.sPathFile);
                result = new StreamResult(objfile);
            } else {
                result = new StreamResult(objFile.getPath());
            }            
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);         
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
        return true;
    }

    /**
     * Nghiệp vụ cập nhật dữ liệu trong XML Files
     * @param List(T) lisT
     * @param List(Object) lisObject
     * @param String sPathFile
     * @param String sAttributeKey
     * @param String sElementNode
     * @param lisStudent
     * @return
     * @throws Exception
     */
    public Object UpdateElements(XMLParams objXMLParam) 
    							throws Exception {
        try {
            // Lấy đường dẫn tương đối
            boolean bFlag = false;
            File objFile = new File(objXMLParam.sPathFile);
            File xmlFile = null;
            /*
             * TRUE: có tồn tại files FALSE: ko tồn tại files
             */
            if (objFile.exists()) {
                try {
                    xmlFile = new File(objXMLParam.sPathFile);
                    DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                    Document doc = docBuilder.parse(xmlFile);

                    // Cập nhật thông tin Sinh Viên
                    NodeList nList = doc.getElementsByTagName(objXMLParam.sElementNode);
                    for (int i = 0; i < nList.getLength(); i++) {
                        // Nhận về thông tin student element bởi tag name
                        Node nChild = doc.getElementsByTagName(objXMLParam.sElementNode).item(i);
                        NamedNodeMap attr = nChild.getAttributes();
                        Node nodeAttr = attr.getNamedItem(objXMLParam.sAttributeKey);
                        System.out.println("" + objXMLParam.lisObject.get(0));
                        
                        if (nodeAttr.getTextContent().equals("" + objXMLParam.lisObject.get(0))) {
                            NodeList list = nChild.getChildNodes();
                            String str = nChild.getNodeName();

                            for (int j = 0; j < list.getLength(); j++) {
                                Node node = list.item(j);

                                for (int k = 0; k < objXMLParam.lisField.size(); k++) {
                                    if (objXMLParam.lisField.get(k).equals(node.getNodeName())) {
                                        node.setTextContent("" + objXMLParam.lisObject.get(k));
                                    }
                                }
                            }
                        }
                    }

                    // write the content into xml file
                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    DOMSource source = new DOMSource(doc);
                    StreamResult result = new StreamResult(xmlFile);
                    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                    transformer.transform(source, result);

                } catch (Exception ex) {
                    throw ex;
                }
            }
        } catch (Exception e) {
            throw e;
        }
        return true;
    }
}
