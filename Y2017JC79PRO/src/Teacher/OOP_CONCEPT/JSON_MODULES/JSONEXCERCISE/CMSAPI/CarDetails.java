package JAVACORE_TRAINING.OOPS_CONCEPTS.JSON_MODULES.JSONEXCERCISE.CMSAPI;

public class CarDetails {
	private String SalonID;
	private String SalonName;
	private int Star;
	private boolean IsDeleted;
	
	public String getSalonID() {
		return SalonID;
	}
	public void setSalonID(String salonID) {
		SalonID = salonID;
	}
	public String getSalonName() {
		return SalonName;
	}
	public void setSalonName(String salonName) {
		SalonName = salonName;
	}
	public int getStar() {
		return Star;
	}
	public void setStar(int star) {
		Star = star;
	}
	public boolean isIsDeleted() {
		return IsDeleted;
	}
	public void setIsDeleted(boolean isDeleted) {
		IsDeleted = isDeleted;
	}
}
