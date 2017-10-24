package Teacher.Y2017JC79.oops.inheritances.demo;

public class Student {
	String sName;
	String sDiaChi;

	public void hienThi() {
		System.out.println("Tên là: " + this.sName + "Địa chỉ là: " + this.sDiaChi);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String kq = "Tên là: " + this.sName + "Địa chỉ là: " + this.sDiaChi;
		return kq;
	}

}
