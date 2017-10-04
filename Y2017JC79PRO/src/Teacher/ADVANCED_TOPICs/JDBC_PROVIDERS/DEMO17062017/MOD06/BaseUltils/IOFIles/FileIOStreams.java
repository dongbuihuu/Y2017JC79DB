package BaseUltils.IOFIles;

import java.util.HashMap;
import java.util.List;

public class FileIOStreams<T> {
    private Serizablefs<T> m_objSerizable;
    private XMLManagements m_objXMLMans;
    
    public FileIOStreams(){
        m_objSerizable = new Serizablefs<T>();
        m_objXMLMans = new XMLManagements();
    }
    
    public boolean WriteListObjects(T lisValue, 
            String resource, String fileName) throws Exception {
        return m_objSerizable.
                        WriteListObjectIntoFiles(lisValue, resource, fileName);
    }
    
    public T ReadListObjects(String resource, 
            String fileName) throws Exception {
        return m_objSerizable.
                        ReadListObjectIntoFiles(resource, fileName);
    }
    
    public List<List<HashMap<String, String>>> ReadOfXML(List<Object> lisField, 
                                    String elementNode, String path) 
                                                throws Exception{
        return m_objXMLMans.ReadElements(lisField, elementNode, path);
    }
    
    public boolean WriteElements(List<Object> lisField, 
            List<List<Object>> lisValues, String rootNode,
            String elementNode, String path, boolean writeType) throws Exception{
        return m_objXMLMans.WriteElements(lisField, lisValues, rootNode, 
                                                            elementNode, path, writeType);
    }
    
    public boolean UpdateElements(List<Object> lisField, 
            List<Object> lisValues, String path, String attributeKey,
            String elementNode) throws Exception{
        return m_objXMLMans.UpdateElements(lisField, lisValues, 
                                    path, attributeKey, elementNode);
    }
}
