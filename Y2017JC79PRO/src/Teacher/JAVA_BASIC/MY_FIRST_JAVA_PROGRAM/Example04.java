package JAVACORE_TRAINING.BASIC_JAVA.MY_FIRST_JAVA_PROGRAM;

import java.util.Scanner;

public class Example04 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // 1. Khai báo biến
        int a = 0;

        // 2. Khai báo đối tượng Scanner để nhận giá trị người dùng nhập
        // vào từ bàn phím
        // Scan --> Giữ Ctrl + Spacer (tự động kbsd import java.util.Scanner;)
        // System.in: Lắng nghe & nhận các giá trị người dùng nhập vào
        Scanner doituong = new Scanner(System.in);

        // 3. Lấy giá trị & gán giá trị đó cho biến
        System.out.println("Mời Anh/Chị nhập cho e 1 số nào đó :D");
        a = doituong.nextInt();
        
       // int i = doituong.nextInt();
        //float j = doituong.nextFloat();
        //double k = doituong.nextDouble();
        //byte l = doituong.nextByte();
        
        // 4. Hiển thị giá trị ra ngoài màn hình
        System.out.println("Giá trị của a = " + a);
    }
}
