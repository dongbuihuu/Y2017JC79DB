package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXCERCISES;

import java.util.Scanner;

public class EXCERCISE03 {

	public static void main(String[] args) {
		//1. Nhận giá trị số kilogram cần chuyển đổi?
        System.out.println("Mời nhập vào kilogram?");       
        
        //2. Thực thi chuyển đổi số Kilogram --> Pound?
           //(Note that 1 kilogram is 2.2 pounds)
        Scanner obj = new Scanner(System.in);
        double dKilogram = obj.nextDouble();
        
        //3. Thực thi chuyển đổi giá trị
        double dPound = dKilogram * 2.2;   
        System.out.println("Giá trị cần chuyển đổi"+ dPound);
	}
}
