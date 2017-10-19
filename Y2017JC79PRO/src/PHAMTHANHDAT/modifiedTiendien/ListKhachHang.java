package PHAMTHANHDAT.modifiedTiendien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListKhachHang {
	private List<KhachHang> ds = new ArrayList<KhachHang>();

	// 1. Hàm thêm KH vào danh sách
	public void them(KhachHang o) {
		if (!ds.contains(o)) {
			ds.add(o);
		}
	}

	// 2. sắp xếp
	public void sapXep() {
		Collections.sort(ds);
	}

	public void XuatDS() {
		for (KhachHang kh : ds) {
			System.out.println(kh.toString());
		}
	}

	public KhachHang timKiem(String maKH) {
		for (KhachHang kh : ds) {
			if (kh.getMaKH().equals(maKH))
				return kh;
		}
		return null;
	}
}
