package PHAMTHANHDAT.modifiedTiendien;

import java.text.DecimalFormat;
import java.time.LocalDate;

public abstract class KhachHang implements Comparable<KhachHang> {
	// 1. Khai báo các biến dữ liệu thành viên
	private String maKH, hoTen;
	private LocalDate ngayRaHD;
	private int soLuong;
	private double donGia;

	// 2. Constructor không tham số
	public KhachHang() {

	}

	// 3. Contructor có tham số
	public KhachHang(String maKH, String hoTen, LocalDate ngayRaHD, int soLuong, double donGia) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngayRaHD = ngayRaHD;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}
	// 4. Các hàm Encapsulation

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public LocalDate getNgayRaHD() {
		return ngayRaHD;
	}

	public void setNgayRaHD(LocalDate ngayRaHD) {
		this.ngayRaHD = ngayRaHD;
	}

	public abstract double thanhTien();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang kh = (KhachHang) obj;

		if (this.getMaKH() == null) {
			if (kh.getMaKH() != null)
				return false;
		} else if (!this.getMaKH().equals(kh.getMaKH()))
			return false;
		return true;
	}

	@Override
	public int hashCode() {

		return this.getMaKH().hashCode();
	}

	@Override
	public int compareTo(KhachHang o) {
		if (o == null)
			return -1;
		else
			return this.getMaKH().compareTo(o.getMaKH());

	}

	public String TieuDe() {
		// TODO Auto-generated method stub
		return String.format("%-15s %-19s %-19s %-12s %-15s", "Mã Khách Hàng", "Họ Tên", "Ngày Ra Hóa Đơn", "Số Lượng",
				"Đơn Gía", "Thành Tiền\n");
	}

	public String toString() {
		// TODO Auto-generated method stub
		// SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		DecimalFormat formatter = new DecimalFormat("###,###,###.00");
		return String.format("%15s %19s %19s %12s %15s %15s", maKH, hoTen, ngayRaHD, soLuong,
				formatter.format(this.getDonGia()) + "VNĐ", thanhTien());

	}
}
