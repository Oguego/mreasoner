package database.Tables;

import java.sql.ResultSet;
import java.sql.SQLException;






import java.util.Calendar;
import java.util.GregorianCalendar;

import main.SystemStatus;
import main.elements.states.State;
import main.elements.time.Time;


public class InternalEventsTable {

//	private long      		lastId;
//	private DatabaseOperations reasonerDatabase;
	
	public InternalEventsTable(){//DatabaseOperations reasonerDatabase){
//		this.reasonerDatabase = reasonerDatabase;
//	//	this.lastId     = 0;
//		this.
//		reasonerDatabase.eraseInternalEventsTable();
//		reasonerDatabase.createInternalEventsTable();
//		
	}
	
	public void insertNextTimeRuleEffect(State consequence,Time time){
//		
//		reasonerDatabase.insertInternalEvent(""+time.getIteration(),consequence.getName(), 
//											 ""+consequence.getStatus(),
//											 time.getDateFromRealTimeMillis(),
//											 time.getDayTimeFromRealTimeMillis(),
//											 ""+time.getSystemRealTime());
//		
	}
	
	
	

	
	public SystemStatus findLatestEvents(SystemStatus systemStatus){
	//	ResultSet result ;
//
//	    try {
//			
//			result = reasonerDatabase.findLatestInternalEvents();
//		
//			if(result != null){
//				while(result.next()){
//					systemStatus.occurs(result.getString("state"), result.getBoolean("value"),true);
//			//		lastId = result.getInt("id");
//					reasonerDatabase.logInternalEvent(""+result.getInt("id"), 
//														 result.getString("iteration"),
//														 result.getString("state"),
//														 ""+result.getBoolean("value"), 
//														 result.getString("date"), 
//														 result.getString("time"));
//				}
//			}else System.out.println("RESULT = NULL");
//			result.close();
//		} catch (SQLException e1) {
//		e1.printStackTrace();
//		}
//		
		return systemStatus;
//		
	}
}
