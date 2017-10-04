package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMOJDBC.MOD_HOANCHINH;

public class EventObject {
	private String sEventName;
	private String sPrice;
	private int iEventDay;
	
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
}
