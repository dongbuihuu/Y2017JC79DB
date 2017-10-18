package DemoTienDien;

import java.time.LocalDate;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KhachHang kh1=new KhachVN("1A","Phạm Tiến Đạt",LocalDate.of(23,5,2017),3,100000,"Kinh doanh",300);
		KhachHang kh2=new KhachVN("1B","Phạm Thành Đạt",LocalDate.of(22,8,2017),4,200000,"Sản xuất",400);
		KhachHang kh3=new KhachNN("1C","Phạm Thành Lâm",LocalDate.of(21,6,2017),5,300000,"Japan");
		KhachHang kh4=new KhachNN("1C","Phạm Thanh Thanh",LocalDate.of(20,5,2017),6,400000,"Lao");
		ListKhachHang lst=new ListKhachHang();
		lst.themKH(kh1);
		lst.themKH(kh2);
		lst.themKH(kh3);
		lst.themKH(kh4);
		lst.XuatDS();
	}

}
