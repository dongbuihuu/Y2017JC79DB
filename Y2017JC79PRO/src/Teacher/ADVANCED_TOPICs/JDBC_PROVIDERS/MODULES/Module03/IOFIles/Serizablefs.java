package BaseUltils.IOFIles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Serizablefs<T> {
    public boolean WriteListObjectIntoFiles(T lisValue, String resource, String fileName) 
                throws Exception {
        try {
            String path = resource + fileName;
            File objFile = new File(path);

            FileOutputStream objOutFile = new FileOutputStream(objFile);
            ObjectOutputStream objOoS = new ObjectOutputStream(objOutFile);
            objOoS.writeObject(lisValue);
            objOoS.flush();
        } catch (Exception e) {
            throw e;
        }
        return true;
    }

    public T ReadListObjectIntoFiles(String resource, String fileName) 
                throws Exception {
        T lisValue = null;
        try {
            String path = resource + fileName;
            File objFile = new File(path);
            ObjectInputStream objObjectIn = new ObjectInputStream(new FileInputStream(objFile));
            lisValue = (T) objObjectIn.readObject();
        } catch (Exception e) {
            throw e;
        }
        return lisValue;
    }
}
