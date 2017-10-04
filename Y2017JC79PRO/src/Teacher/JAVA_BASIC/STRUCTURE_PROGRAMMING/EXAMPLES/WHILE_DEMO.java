package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXAMPLES;

public class WHILE_DEMO {
	
    public static void main(String[] args) {
        // 1. Khai báo biến đếm
        int iCount = 0;

        // 2. Sử dụng vòng lặp While...Loop
        // Ctrl + shift + / : Comment mã lệnh
        // Ctrl + shift + \ : UnComment mã lệnh
        while (iCount < 10) {
            System.out.println("Giá trị của iCount = " + iCount);

            // Tăng dần biến đk --> echo đến khi ko còn TMĐK --> thoát
            //iCount = iCount + 1; //iCount++;
           //++iCount;
            //iCount++;
          iCount = iCount++;            
          //iCount = ++iCount;
        }

        /*
         * while(true){ 
         * 	System.out.println("Giá trị của iCount = "+ iCount); 
         * }
         */
    }
}
