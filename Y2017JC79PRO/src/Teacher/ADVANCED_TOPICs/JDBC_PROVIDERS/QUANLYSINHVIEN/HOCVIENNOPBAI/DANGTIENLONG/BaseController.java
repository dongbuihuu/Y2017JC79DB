package src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.DANGTIENLONG;

import javax.swing.table.DefaultTableModel;

public interface BaseController<T> {
	DefaultTableModel BindingOf() throws Exception;
	boolean UpdateElement(T obj) throws Exception;
}
