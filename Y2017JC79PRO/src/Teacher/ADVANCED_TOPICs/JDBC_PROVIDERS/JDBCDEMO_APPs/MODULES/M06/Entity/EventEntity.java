package MODULES.M06.Entity;

public class EventEntity {
	private String sEventId;
	private String sEventName;
	private String sPrice;
	private int iEventDay;
	private int iEventMonth;
	private int iEventYear;
	
	public String getsEventId() {
		return sEventId;
	}
	public void setsEventId(String sEventId) {
		this.sEventId = sEventId;
	}
	public String getsEventName() {
		return sEventName;
	}
	public void setsEventName(String sEventName) {
		this.sEventName = sEventName;
	}
	public String getsPrice() {
		return sPrice;
	}
	public void setsPrice(String sPrice) {
		this.sPrice = sPrice;
	}
	public int getiEventDay() {
		return iEventDay;
	}
	public void setiEventDay(int iEventDay) {
		this.iEventDay = iEventDay;
	}
	public int getiEventMonth() {
		return iEventMonth;
	}
	public void setiEventMonth(int iEventMonth) {
		this.iEventMonth = iEventMonth;
	}
	public int getiEventYear() {
		return iEventYear;
	}
	public void setiEventYear(int iEventYear) {
		this.iEventYear = iEventYear;
	}	
}
