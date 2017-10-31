package Teacher.ADVANCED_TOPICs.SWING_APPs.SAMPLES;

public class AccountModel {
	public boolean CheckElementById(AccountEntity objEntity) {
		return (objEntity.getsUserName().equals("abc") && objEntity.getsPassWord().equals("nothing")) ? true : false;
	}
}
