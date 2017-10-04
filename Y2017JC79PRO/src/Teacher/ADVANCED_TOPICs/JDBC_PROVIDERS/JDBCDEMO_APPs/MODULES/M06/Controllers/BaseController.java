package MODULES.M06.Controllers;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import MODULES.M06.Models.EventModel;

public class BaseController<T> {
	protected EventModel mEventModel;
	protected Connection mobjConnection;
	
	public BaseController(Connection objConnection) {
		mobjConnection = objConnection;
		mEventModel = new EventModel(mobjConnection);
	}
	
	public List<T> SelectData() throws SQLException{return null;}
	public boolean Executes(T objT) throws SQLException{return true;}
}
