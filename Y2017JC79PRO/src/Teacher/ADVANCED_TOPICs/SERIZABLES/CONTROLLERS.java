package JAVACORE_TRAINING.ADVANCED_TOPICs.SERIZABLES;

import java.util.List;

public class CONTROLLERS {
    private MODELS m_objModels;
    
    public CONTROLLERS(){
        m_objModels = new MODELS();
    }
    /***
     * Nghiệp vụ Ghi đối tượng hay danh sách đối tượng xuống files.
     * @param lisStudent
     * @param resource
     * @param fileName
     * @return
     * @throws Exception
     */
    public boolean WriteObjects(List<Student> lisStudent,
            			String fileName) throws Exception {
        return m_objModels.WriteListObjectIntoFiles(
        						lisStudent, fileName);
    }
    
    /***
     * Nghiệp vụ Đọc đối tượng hay danh sách đối tượng lên Apps
     * @param fileName
     * @return
     * @throws Exception
     */
    public List<Student> ReadObjects(String fileName) 
            throws Exception {
    	
        return m_objModels.ReadListObjectIntoFiles(fileName);
    }
}
