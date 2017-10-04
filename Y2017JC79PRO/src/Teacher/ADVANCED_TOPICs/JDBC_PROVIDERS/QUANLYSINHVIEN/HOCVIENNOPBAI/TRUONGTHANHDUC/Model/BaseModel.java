package src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.TRUONGTHANHDUC.Model;

import java.sql.ResultSet;
import java.util.List;

public abstract class BaseModel<T> {
	public abstract ResultSet getElement() throws Exception;
	public abstract ResultSet addStudent(T objT) throws Exception;
}
