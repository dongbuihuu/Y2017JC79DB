package JAVACORE_TRAINING.ADVANCED_TOPICs.SERIZABLES.EXCERCISES;

import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class CONTROLLERS <T> {
    private MODELS<T> m_objModels;
    
    public CONTROLLERS(){
        m_objModels = new MODELS<T>();
    }
    
    public boolean WriteListObjects(List<T> lisValue, 
            String fileName) throws Exception {
        return m_objModels.
                        WriteListObjectIntoFiles(lisValue, fileName);
    }
    
    public List<T> ReadListObjects(String fileName) throws Exception {
        return m_objModels.ReadListObjectIntoFiles(fileName);
    }
    
    public DefaultTableModel getModelInfo(List<T> lisT) throws Exception {
        return m_objModels.getDataModels(lisT);
    }
}
