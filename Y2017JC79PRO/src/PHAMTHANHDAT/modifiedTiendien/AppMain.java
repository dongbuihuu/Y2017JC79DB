package PHAMTHANHDAT.modifiedTiendien;

import java.time.LocalDate;

public class AppMain {

	public static void main(String[] args) {

		ListKhachHang lst = new ListKhachHang();
		KhachHang kh1 = new KhachHangVN("2A", "Phạm Tiến Đạt", LocalDate.of(2017, 5, 23), 3, 100000, "Kinh doanh", 300);
		KhachHang kh2 = new KhachHangVN("1A", "Phạm Văn Đạt", LocalDate.of(2017, 5, 23), 3, 100000, "Kinh doanh", 300);

		lst.them(kh1);
		lst.them(kh2);

		lst.XuatDS();

		lst.sapXep();
		lst.XuatDS();

		KhachHang kq = lst.timKiem("1A");
		System.out.println(kq);

	}

}
