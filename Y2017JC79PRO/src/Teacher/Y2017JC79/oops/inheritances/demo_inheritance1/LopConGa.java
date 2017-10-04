package Teacher.Y2017JC79.oops.inheritances;

public class LopConGa extends LopDongVat {
	private boolean isCanh;

	public LopConGa(boolean isChan, boolean isMat, boolean isCanh) {
		super(isChan, isMat);
		this.isCanh = isCanh;
	}

	public boolean isCanh() {
		return isCanh;
	}

	public void setCanh(boolean isCanh) {
		this.isCanh = isCanh;
	}

	@Override
	protected String TiengKeu() {
		return "Ò ó o...";
	}
}
