package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.SERIZABLES;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MODELS {
    
    public boolean WriteListObjectIntoFiles(List<Student> lisStudent, 
    												String fileName)
            throws Exception {
        try {     
        	//1. Khai báo và khởi tạo đối tượng file
            File objFile = new File(fileName);
            FileOutputStream objOutFile = new FileOutputStream(objFile);
            ObjectOutputStream objOoS = new ObjectOutputStream(objOutFile);
            objOoS.writeObject(lisStudent);           
            objOoS.flush();           
        } catch (Exception e) {
            throw e;
        }return true;
    }

    public List<Student> ReadListObjectIntoFiles(String fileName) 
    											throws Exception {
        List<Student> lisStudent = null;
        try {                  
            File objFile = new File(fileName);
            ObjectInputStream objObjectIn = new 
            				ObjectInputStream(new FileInputStream(objFile));
            lisStudent = new ArrayList<Student>();
            lisStudent = (List<Student>) objObjectIn.readObject();
        } catch (Exception e) {
            throw e;
        }return lisStudent;
    }
}
