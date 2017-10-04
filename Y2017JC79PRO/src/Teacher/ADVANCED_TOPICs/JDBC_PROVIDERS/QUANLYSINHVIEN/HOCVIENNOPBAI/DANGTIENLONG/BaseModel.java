package src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.DANGTIENLONG;

import java.sql.ResultSet;

public interface BaseModel<T> {
	ResultSet getElement() throws Exception;
	
	boolean WriteElement(T obj) throws Exception;
}
