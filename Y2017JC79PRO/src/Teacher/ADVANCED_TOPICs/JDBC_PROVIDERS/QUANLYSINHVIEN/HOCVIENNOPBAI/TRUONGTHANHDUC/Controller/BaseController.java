package src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.TRUONGTHANHDUC.Controller;

import javax.swing.table.DefaultTableModel;

public abstract class BaseController<T> {
	public abstract DefaultTableModel BinddingOf() throws Exception;
	public abstract DefaultTableModel BinddingOfStudent(T objT) throws Exception;
}
