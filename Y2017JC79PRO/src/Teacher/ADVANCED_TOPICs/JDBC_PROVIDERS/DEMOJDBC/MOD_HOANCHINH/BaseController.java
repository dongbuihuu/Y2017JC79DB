package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMOJDBC.MOD_HOANCHINH;

import javax.swing.table.DefaultTableModel;

public abstract class BaseController<T> {	
	abstract protected DefaultTableModel BindingOf() throws Exception;
}
