package MODULES.M06.Models;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BaseModel<T> {
	protected Connection mobjConnection;
	protected ResultSet mobjRs = null;
	protected CallableStatement mobjCmst = null;
	public BaseModel() {}
	
	public BaseModel(Connection objConnection) {
		mobjConnection = objConnection;
	}
	
	public List<T> GetElements() throws SQLException {return null;}
	public List<T> GetElementById(){return null;}
	public boolean InsertElements(T objT){return true;}
	public boolean UpdateElements(T objT){return true;}
	public boolean DeleteElements(T objT){return true;}
}
