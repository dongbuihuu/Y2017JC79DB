package DemoTienDien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListKhachHang {
	ArrayList<KhachHang> ds=new ArrayList<>();
	public boolean themKH(KhachHang kh)
	{
		if(ds.contains(kh))
			return false;
		else
			return ds.add(kh);
	}
	public KhachHang timKiem(String maKH)
	{
		for (KhachHang kh : ds) {
			if(kh.getMaKH().equalsIgnoreCase(maKH))
				return kh;
		}
		return null;
	}
	public void sapXep()
	{
		Collections.sort(ds, new Comparator<KhachHang>() {
			public int compare(KhachHang kh1,KhachHang kh2) {
				return kh1.getMaKH().compareToIgnoreCase(kh2.getMaKH());
			}
		});
	}
	public void XuatDS()
	{
		for (KhachHang kh : ds) {
			System.out.println(kh.toString());
		}
	}
}	
