package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXCERCISES;

import java.util.Scanner;

public class EXCERCISE06 {

	public static void main(String[] args) {
		String sExit = "";
		Scanner objSc = new Scanner(System.in);
		do {
			// 1. Mời nhập vào 1 giá trị nào đó?		
			String sTemp = "";
			do {
				System.out.println("Mời nhập vào 1 giá trị?");
				sTemp = objSc.nextLine();
			} while (sTemp.isEmpty());			
			int iValue = Integer.parseInt(sTemp);
			
			// 2. Mời chọn Chẵn hoặc Lẻ?	
			do {
				System.out.println("Mời chọn: 0 - Chẵn hoặc 1 - Lẻ?? ");
				sTemp = objSc.nextLine();
			} while (sTemp.isEmpty()
								|| Integer.parseInt(sTemp) < 0 
								|| Integer.parseInt(sTemp) > 1);
			int iSelected = Integer.parseInt(sTemp);
			
			// 3. Duyệt và đưa ra tập giá trị Chẵn hoặc Lẻ?
	        int i = 0;
	        String sOut = ""; // sOut format: 1 - 3 - 5 - 7 - ...
	        while (i <= iValue) {
	            //4. Kiểm tra trường hợp Chẵn hoặc Lẻ Chẵn
	            if (iSelected == 0) {
	                if (i % 2 == 0) {                   
	                    if (sOut.isEmpty())
	                    	sOut += i;//sOut = sOut + i;
	                    else
	                    	sOut += "-" + i;
	                }
	            } else {              
	                if (i % 2 != 0) {                  					
	                	if (sOut.isEmpty())
	                		sOut += i;
	                    else
	                    	sOut += "-" + i;
	                }
	            }
	            //Tăng giá trị biến đếm
	            i++;
	        }
	        System.out.println(String.format("Result: %s", sOut));
			System.out.println("Bạn đã chán chưa? Y/N");
			sExit = objSc.nextLine();
		}while (!sExit.toUpperCase().equals("Y"));
		System.out.println("Cảm ơn bạn đã sử dụng phần mềm của chúng tôi :D");
	}
}
