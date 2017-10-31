package Teacher.ADVANCED_TOPICs.SWING_APPs.SAMPLES;

public class AccountController {
	private AccountModel mModel;

	public AccountController() {
		mModel = new AccountModel();
	}

	public boolean CheckAccount(AccountEntity objEntity) {
		return mModel.CheckElementById(objEntity);
	}
}
