package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXAMPLES;

import java.util.Scanner;

public class DOWHILE_DEMO1 {
	
    public static void main(String[] args) {
        //1. Khai báo biến
        String sValue;
        
        //2. Sử dụng vòng lặp Do...While để yêu bắt buộc phải nhập vào giá trị
        do{
            //3. Mời nhập giá trị
            System.out.println("Mời nhập giá trị?");
            
            //4. Nhận giá trị và kiểm tra
            Scanner sc = new Scanner(System.in);
            sValue = sc.nextLine();
            
        }while(Double.parseDouble(sValue) > 0);
        System.out.println("Thoát chương trình");       
    }
}
