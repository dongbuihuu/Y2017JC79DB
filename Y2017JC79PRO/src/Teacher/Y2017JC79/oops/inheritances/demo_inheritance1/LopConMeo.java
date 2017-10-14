package Teacher.Y2017JC79.oops.inheritances.demo_inheritance1;

public class LopConMeo extends LopDongVat {
	public boolean isDuoi;

	public LopConMeo() {

	}

	public LopConMeo(boolean isChan, boolean isMat, boolean isDuoi) {
		// super.setChan(isChan);
		// super.setMat(isMat);
		super(isChan, isMat);
		this.isDuoi = isDuoi;
	}

	@Override
	protected String TiengKeu() {

		return super.TiengKeu();
	}
}
