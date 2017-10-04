package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXAMPLES;

public class DOWHILE_DEMO2 {
	
    public static void main(String[] args) {
        // 1. Khai báo biến đếm
        int iCount = 0;
        
        //2. Sử dụng vòng lặp do...while()
        do {
            System.out.println("Giá trị của iCount = " + iCount);

            // Tăng dần biến đk --> cho đến khi ko còn TMĐK --> thoát
            iCount = iCount + 1; // iCount++;
            
        } while (iCount < 10);
    }
}
