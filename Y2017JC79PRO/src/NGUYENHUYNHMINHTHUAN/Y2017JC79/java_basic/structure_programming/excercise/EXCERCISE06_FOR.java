package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXCERCISES;

import java.util.Scanner;

public class EXCERCISE06_FOR {

	public static void main(String[] args) {
		// 1. Yêu cầu nhập vào 1 giá trị bất kỳ
        System.out.println("+ Mời nhập vào 1 giá trị?");
        Scanner obj = new Scanner(System.in);
        int iValue = obj.nextInt();

        //2. Yêu cầu chọn Chẵn hoặc Lẻ
        System.out.println("Mời chọn: 0 - Chẵn hoặc 1 - Lẻ?");
        int iSelected = obj.nextInt();

        //3. Sử dụng vòng lặp While() để duyệt & xử lý
        int i = 0;
        String strOut = ""; // strOut format: 1 - 3 - 5 - 7 - ...
        for(;i < iValue;i++){
			//7. Kiểm tra xem người dùng lựa chọn là Chẵn hoặc Lẻ?
			//TH là Chẵn
			if(iSelected == 0){
				if(i % 2 == 0){
					if(strOut.isEmpty())
						strOut += i;
					else  strOut += "-"+i;
				}
			}
			else{
				//TH là Lẻ
				if(i % 2 != 0){
					if(strOut.isEmpty())
						strOut += i;
					else  strOut += "-"+i;
				}
			}		
		}

        //5. Hiển thị kết quả ra ngoài màn hình
        System.out.println(strOut);
	}
}
