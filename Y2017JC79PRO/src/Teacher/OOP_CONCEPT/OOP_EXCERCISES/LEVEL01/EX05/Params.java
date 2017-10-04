package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.OOP_EXCERCISES.LEVEL01.EX05;

public class Params {
	/**
	 * Tình trạng hôn nhân ko đc phép.
	 * --> TTHonNhan = 2: Đã kết hôn
	 */
	public final byte TTHonNhan = 2;  
	/**
	 * Giới tính ko đc phép.
	 * --> GTGioiHan = 1: Nam
	 */
	public final byte GTGioiHan = 1;	
	private short TuoiNam;	
	private short TuoiNu;	
	private PersonEntity objPerson;
	
	public short getTuoiNam() {
		return TuoiNam;
	}
	/***
	 * Tuổi qui định đối với Nam.
	 * @param tuoiNam
	 */
	public void setTuoiNam(short tuoiNam) {
		TuoiNam = tuoiNam;
	}
	public short getTuoiNu() {
		return TuoiNu;
	}
	/***
	 * Tuổi qui định đối với Nữ.
	 * @param tuoiNu
	 */
	public void setTuoiNu(short tuoiNu) {
		TuoiNu = tuoiNu;
	}
	public PersonEntity getObjPerson() {
		return objPerson;
	}
	public void setObjPerson(PersonEntity objPerson) {
		this.objPerson = objPerson;
	}	
}
