package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXAMPLES;

public class SWITCH_DEMO {
    public static void main(String[] args) {
        //1. Khai báo biến điều kiện
        //int i = 2;
        
        //2. Sử dụng Switch...Case
        switch(100){
            case 0: System.out.println("Giá trị của i = 0"); //ctrl + shift+b
            case 1: System.out.println("Giá trị của i = 1"); break;
            case 2: System.out.println("Giá trị của i = 2"); break;
            case 3: System.out.println("Giá trị của i = 3"); break;
            default : System.out.println("..."); break;            
        }
    }
}
