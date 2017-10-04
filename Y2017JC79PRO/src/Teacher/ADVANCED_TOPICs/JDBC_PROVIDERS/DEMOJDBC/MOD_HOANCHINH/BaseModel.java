package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMOJDBC.MOD_HOANCHINH;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class BaseModel <T> {
 	abstract protected ResultSet getElement() throws SQLException;
}
