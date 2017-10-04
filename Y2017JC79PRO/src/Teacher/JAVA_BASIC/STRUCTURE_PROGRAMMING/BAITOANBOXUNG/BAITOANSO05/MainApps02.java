package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.BAITOANBOXUNG.BAITOANSO05;

public class MainApps02 {
	public static void main(String[] args) {
			//1. Khai báo và khởi tạo giá trị cho các biến
		    double a, b, c,d, e, f;	      	       
	        a = 1; b = 2; c = 9;
	        d = 8; e = 2; f = -5;
	        
	        //2. Gọi hàm và xử lý tính toán
	        String sResult = GiaiHePhuongTrinh(a, b, c, d, e, f);
	        
	        //3. Đưa ra thông báo tương ứng
	        if(sResult.equals("-1"))
	        	System.out.println("- Hệ phương trình có vô số nghiệm!!!");
	        else if(sResult.equals("-2"))
	        	System.out.println("- Hệ phương trình vô nghiệm!!!");
	        else{
	        	System.out.println("- Hệ phương trình có nghiệm!!!");
	        	System.out.println("--> KQ: "+ sResult);
	        }	        	
	}

	/***
	 * Nghiệp vụ Giải hệ phương trình bậc nhất
	 * - Return:
	 * + -1: - Hệ pt vô số nghiệm!!!
	 * + -2: - Hệ pt vô nghiệm!!!
	 * + Hệ pt có nghiệm: x = ...; y = ...; 	 
	 * @return
	 */
	private static String GiaiHePhuongTrinh(double a, double b, 
												double c, double d, double e, double f) {
		double Dx, Dy, D;
		D = a * e - b * d;
		Dx = c * e - b * f;
		Dy = a * f - c * d;		
		
		if(D == 0 && Dx == 0)
			return "-1";  //- Hệ pt vô số nghiệm!!!        	
		else if(D == 0 && Dx != 0)
        	return "-2";  //- Hệ pt vô nghiệm!!!        
		else         	
        	return String.format("x = %s; y = %s", (Dx/D), (Dy/D));                
	}
}
