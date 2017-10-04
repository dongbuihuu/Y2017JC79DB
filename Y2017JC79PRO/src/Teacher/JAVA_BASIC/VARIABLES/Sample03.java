package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.VARIABLES;

public class Sample03 {
	public static void main(String[] args) {
		//1. Khai báo các biến chứa giá trị
		double dNumA = 6.5;
		double dNumB = 7.5;
		
		//2. Tính toán cộng 02 số --> gán giá trị cho biến kết quả
		double dTong = dNumA + dNumB;  //dKQ = 6.5 + 7.5
		double dHieu = dNumA - dNumB;   //dKQ = 6.5 - 7.5
		double dTich = dNumA * dNumB;   //dKQ = 6.5 * 7.5
		double dThuong = dNumA / dNumB;   //dKQ = 6.5 / 7.5
		
		//3. Hiển thị kết quả ra ngoài màn hình
		System.out.println("- Tổng là: "+ dTong);
		System.out.println("- Hiệu là: "+ dHieu);
		System.out.println("- Tích là: "+ dTich);
		System.out.println("- Thương là: "+ dThuong);
		
	}
}
