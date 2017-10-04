package Teacher.Y2017JC79.java_basic.structure_programming.sample;

public class continue_demo {

	public static void main(String[] args) {
		// 1. Định nghĩa một chuỗi cho trước và ký tự cần tìm
		String strSearch = "Xin chao tat ca cac chuyen gia tham du trong lop hoc java core tai imic!";
		char desSearch = 'a';
		int pos = 0;

		// 2. Lấy chiều dài của chuỗi bằng hàm length()
		int max = strSearch.length();

		for (int i = 0; i < max; i++) {
			if (strSearch.charAt(i) != desSearch)
				continue;
			pos++;
		}
		System.out.println("Đã tìm được " + pos + " kí tự a trong chuỗi");

	}

}
