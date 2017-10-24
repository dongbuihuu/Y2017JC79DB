package Teacher.Y2017JC79.oops.inheritances.demo;

public class SinhVien extends Student {

	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		Student sv1 = new SinhVien();
		sv1.sDiaChi = "";
		System.out.println(sv1.toString());
	}

	// @Override
	// public String toString() {
	// // TODO Auto-generated method stub
	// return "Trần Văn C";
	// }
}
