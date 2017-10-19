package DemoTienDien;

import java.text.DecimalFormat;
//import java.text.SimpleDateFormat;
import java.time.LocalDate;


public abstract class KhachHang {
	protected String maKH,hoTen;
	protected LocalDate ngayRaHD;
	protected int soLuong;
	protected double donGia;
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
	public LocalDate getNgayRaHD() {
		return ngayRaHD;
	}
	public void setNgayRaHD(LocalDate ngayRaHD) {
		this.ngayRaHD = ngayRaHD;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maKH == null) ? 0 : maKH.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		if (maKH == null) {
			if (other.maKH != null)
				return false;
		} else if (!maKH.equals(other.maKH))
			return false;
		return true;
	}
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhachHang(String maKH, String hoTen, LocalDate ngayRaHD, int soLuong, double donGia) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngayRaHD = ngayRaHD;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}
	public abstract double ThanhTien();
	public String TieuDe() {
		// TODO Auto-generated method stub
		return String.format("%-15s %-19s %-19s %-12s %-15s","Mã Khách Hàng","Họ Tên","Ngày Ra Hóa Đơn","Số Lượng","Đơn Gía","Thành Tiền\n");
	}
	public String toString() {
		// TODO Auto-generated method stub
		//SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		DecimalFormat formatter=new DecimalFormat("###,###,###.00");
		return String.format("%-15s %-19s %-19s %-12d %-15f %-15.1f",maKH,hoTen,ngayRaHD,soLuong,formatter.format(donGia)+"VNĐ",ThanhTien());
		
	}
}
