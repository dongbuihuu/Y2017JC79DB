package DemoTienDien;

import java.time.LocalDate;

public class KhachNN extends KhachHang{
	private String quocTich;

	public KhachNN() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KhachNN(String maKH, String hoTen, LocalDate ngayRaHD, int soLuong, double donGia,String quocTich) {
		super();
		this.quocTich = quocTich;
	}

	@Override
	public double ThanhTien() {
		// TODO Auto-generated method stub
		double thanhTien=0;
		thanhTien=soLuong*donGia;
		return thanhTien;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"/t"+quocTich;
	}
}
