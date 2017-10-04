package Teacher.Y2017JC79.oops.inheritances;

public class LopDongVat {

	private boolean isChan;
	private boolean isMat;
	String color;

	public boolean getChan() {
		return isChan;
	}

	void setChan(boolean isChan) {
		this.isChan = isChan;
	}

	protected boolean getMat() {
		return isMat;
	}

	protected void setMat(boolean isMat) {
		this.isMat = isMat;
	}

	public LopDongVat() {
		isChan = true;
		isMat = true;
	}

	public LopDongVat(boolean isChan, boolean isMat) {
		this.isChan = isChan;
		this.isMat = isMat;
		//
	}

	public LopDongVat(boolean isChan, boolean isMat, boolean isStatus) {
		this.isChan = isChan;
		this.isMat = isMat;
	}

	protected String TiengKeu() {
		return "";
	}

	C c = new C();

}
