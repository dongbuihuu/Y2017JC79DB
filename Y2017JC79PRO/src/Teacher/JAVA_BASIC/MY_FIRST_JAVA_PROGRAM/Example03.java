package JAVACORE_TRAINING.BASIC_JAVA.MY_FIRST_JAVA_PROGRAM;

public class Example03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ctrl + Shift + F : Căn chỉnh mã lệnh trong eclipse
		// 1. Khai báo biến
		int a = 100;
		int b = 200;
		int c = a + b; // --> c = 300
		
		System.out.println("Giá trị hiện giờ của c = " + c);
		String sString = "iMIC.Edu.Vn";
		
		float numA, numC, numD;
		double numB;
		
		numA = (float) 2.5;  //float = double
		numB = 2.5;
		numC = 2.5f;
		numD = 2.5F;
		
		boolean bFlag01, bFlag02;
		bFlag01 = true;
		bFlag02 = false;
		System.out.println("NumA = " + numA);
		System.out.println("Flag01 = " + bFlag01);
		System.out.println("Flag02 = " + bFlag02);
	}
}
