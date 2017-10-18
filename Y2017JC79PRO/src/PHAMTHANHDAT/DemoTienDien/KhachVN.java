package DemoTienDien;

import java.time.LocalDate;


public class KhachVN extends KhachHang{
	private String doiTuongKH;
	private int dinhMuc;
	
	public KhachVN() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KhachVN(String maKH, String hoTen, LocalDate ngayRaHD, int soLuong, double donGia,String doiTuongKH,int dinhMuc) {
		super(maKH, hoTen, ngayRaHD, soLuong, donGia);
		// TODO Auto-generated constructor stub
		this.doiTuongKH=doiTuongKH;
		this.dinhMuc=dinhMuc;
	}

	@Override
	public double ThanhTien() {
		double thanhTien=0;
		// TODO Auto-generated method stub
		if(soLuong<dinhMuc)
			thanhTien=soLuong*donGia;
		else
			thanhTien=soLuong*donGia*dinhMuc+((soLuong-dinhMuc)*donGia*2.5);
		return thanhTien;
	}
@Override
	public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+"/t"+doiTuongKH+"/t"+dinhMuc;
	}
}
