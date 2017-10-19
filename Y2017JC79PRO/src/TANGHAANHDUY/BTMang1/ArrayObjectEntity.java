package TANGHAANHDUY.BTMang1;

public class ArrayObjectEntity {
	private StudentEntity[] mangSV;
	private double Minormax ;
	private byte boption;
	
	public StudentEntity[] getMangSV() {
		return mangSV;
	}
	public void setMangSV(StudentEntity[] mangSV) {
		this.mangSV = mangSV;
	}
	public double getMinormax() {
		return Minormax;
	}
	public void setMinormax(double minormax) {
		Minormax = minormax;
	}
	public byte getBoption() {
		return boption;
	}
	public void setBoption(byte boption) {
		this.boption = boption;
	}
}
