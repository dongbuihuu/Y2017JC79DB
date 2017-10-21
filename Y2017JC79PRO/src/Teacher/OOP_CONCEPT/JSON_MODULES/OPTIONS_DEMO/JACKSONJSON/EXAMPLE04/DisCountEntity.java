package Teacher.OOP_CONCEPT.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.EXAMPLE04;

public class DisCountEntity {
	private int MALOAIKM;
	private String TENLOAIKM;

	public int getMALOAIKM() {
		return MALOAIKM;
	}

	public void setMALOAIKM(int mALOAIKM) {
		MALOAIKM = mALOAIKM;
	}

	public String getTENLOAIKM() {
		return TENLOAIKM;
	}

	public void setTENLOAIKM(String tENLOAIKM) {
		TENLOAIKM = tENLOAIKM;
	}

	@Override
	public String toString() {
		return MALOAIKM + " - " + TENLOAIKM;
	}
}
