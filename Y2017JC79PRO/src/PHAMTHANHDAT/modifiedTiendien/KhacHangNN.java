package PHAMTHANHDAT.modifiedTiendien;

import java.time.LocalDate;

public class KhacHangNN extends KhachHang {

	private String quocTich;

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public KhacHangNN() {
		super();
	}

	public KhacHangNN(String maKH, String hoTen, LocalDate ngayRaHD, int soLuong, double donGia, String quocTich) {
		super(maKH, hoTen, ngayRaHD, soLuong, donGia);
		this.quocTich = quocTich;
	}

	@Override
	public double thanhTien() {

		return this.getDonGia() * this.getSoLuong();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "/t" + this.getQuocTich();
	}

}
