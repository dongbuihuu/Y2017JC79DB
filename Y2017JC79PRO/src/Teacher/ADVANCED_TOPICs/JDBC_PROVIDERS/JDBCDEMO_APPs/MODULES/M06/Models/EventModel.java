package MODULES.M06.Models;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import MODULES.M06.Entity.EventEntity;

public class EventModel extends BaseModel<EventEntity> {
	
	public EventModel(Connection objConnection) {
		super(objConnection);
	}
	private final String sSelectData = "{call SP_EventListInfo()}";	
	
	@Override
	public List<EventEntity> GetElements() throws SQLException {		
		mobjCmst = mobjConnection.prepareCall(sSelectData);
		mobjRs = mobjCmst.executeQuery();
		List<EventEntity> lisEvent = new ArrayList<>();		
		while(mobjRs.next()){
			EventEntity objEntity = new EventEntity();			
			objEntity.setsEventName(mobjRs.getString("EventName"));
			objEntity.setsPrice(mobjRs.getString("Price"));
			objEntity.setiEventDay(mobjRs.getInt("EventDay"));
			objEntity.setiEventMonth(mobjRs.getInt("EventMonth"));
			objEntity.setiEventYear(mobjRs.getInt("EventYear"));
			lisEvent.add(objEntity);
		}
		return lisEvent;
	}
}
