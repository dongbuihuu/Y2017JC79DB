package PHAMTHANHDAT.modifiedTiendien;

import java.time.LocalDate;

public class KhachHangVN extends KhachHang {
	private String doiTuongKH;
	private int dinhMuc;

	public KhachHangVN() {

	}

	public KhachHangVN(String maKH, String hoTen, LocalDate ngayRaHD, int soLuong, double donGia, String doiTuongKH,
			int dinhMuc) {

		super(maKH, hoTen, ngayRaHD, soLuong, donGia);
		this.doiTuongKH = doiTuongKH;
		this.dinhMuc = dinhMuc;

	}

	@Override
	public double thanhTien() {

		// Sử dụng hàm getSoLuong hoặc getDonGia vì class KhachHangVN kế thừa lớp
		// KhachHang
		// và toàn bộ các thuộc tính như soLuong và donGia đều là private.

		double thanhTien = 0;
		if (this.getSoLuong() < this.getDonGia()) {
			thanhTien = this.getSoLuong() * this.getDonGia();
		} else {
			thanhTien = this.getSoLuong() * this.getDonGia() * this.dinhMuc
					+ ((this.getSoLuong() - this.dinhMuc) * this.getDonGia() * 2.5);
		}
		return thanhTien;
	}

	@Override
	public String toString() {
		return super.toString() + "/t" + doiTuongKH + "/t" + dinhMuc;
	}

}
