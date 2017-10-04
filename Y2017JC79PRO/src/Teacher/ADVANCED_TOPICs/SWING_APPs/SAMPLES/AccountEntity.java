package JAVACORE_TRAINING.ADVANCED_TOPICs.SWING_APPs.SAMPLES;

public class AccountEntity {
	private int AccId;
	private String sFullName;
	private String sUserName;
	private String sPassWord;
	
	public int getAccId() {
		return AccId;
	}
	public void setAccId(int accId) {
		AccId = accId;
	}
	public String getsFullName() {
		return sFullName;
	}
	public void setsFullName(String sFullName) {
		this.sFullName = sFullName;
	}
	public String getsUserName() {
		return sUserName;
	}
	public void setsUserName(String sUserName) {
		this.sUserName = sUserName;
	}
	public String getsPassWord() {
		return sPassWord;
	}
	public void setsPassWord(String sPassWord) {
		this.sPassWord = sPassWord;
	}
}
