package MODULES.M06.Controllers;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import MODULES.M06.Entity.EventEntity;

public class EventController  
				extends BaseController<EventEntity>{
	
	public EventController(Connection objConnection) {
		super(objConnection);
	}
	
	@Override
	public List<EventEntity> SelectData() throws SQLException {
		return mEventModel.GetElements();
	}
	
	@Override
	public boolean Executes(EventEntity objT) throws SQLException {
		return super.Executes(objT);
	}
}
