package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.BAITOANBOXUNG.BAITOANSO13;

import java.util.Scanner;

public class MainApp02 {
	public static void main(String[] args) {
		int a, b, c;
        float delta = 0;
        float x1, x2;
        Scanner dt = new Scanner(System.in);
        System.out.println(" - Mời nhập a?");
        a = dt.nextInt();
        
        System.out.println(" - Mời nhập b?");
        b = dt.nextInt();
        
        System.out.println(" - Mời nhập c?");
        c = dt.nextInt();
        
        //2. Gọi hàm xử lý nghiệp vụ Giải PT Bậc 2
        String sResult = GiaiPTBacHai(a, b, c);
        
        //3. Kiểm tra kết quả
        if(sResult.equals("-1"))
        	System.out.println("- Phương trình vô nghiệm!!!");
        else
        	System.out.println("- Nghiệm của PT là: "+ sResult);
	}
	
	/***
	 * Nghiệp vụ giải pt bậc 2	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return Return -1: Phương trình vô nghiệm và ngược lại 
	 */
	private static String GiaiPTBacHai(int a, int b, int c){
		if(a == 0)
        {
            if(b == 0)
            	return "-1";           	           
            else
            	return "x = "+ (-c)/b;
        }
        else
        {
            double delta = b*b - 4*a*c;
            if(delta == 0)
            	return "x1 = x2 = "+ (-b)/(2*a);           	                
            else if(delta < 0)
            	return "-1";      
            else
            {
                double x1 = (-b + (float)Math.sqrt(delta))/(2*a);
                double x2 = (-b - (float)Math.sqrt(delta))/(2*a);
                return String.format("x1 = %s; x2 = %s", x1, x2);
            }
        }
	}
}
