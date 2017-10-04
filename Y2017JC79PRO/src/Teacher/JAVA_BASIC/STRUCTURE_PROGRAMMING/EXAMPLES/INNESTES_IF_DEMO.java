package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXAMPLES;

public class INNESTES_IF_DEMO {
	
      public static void main(String[] args) {
          int iCount = 10;
          int a;         
          if(iCount < 0){
              System.out.println("iCount < 0");
          }
          else if(iCount == 5){
              System.out.println("iCount = 5");
          }
          else if(iCount == 10){
              System.out.println("iCount = 10");
          }
          else if(iCount == 100){
              System.out.println("iCount = 100");
          }
          else{
                if(iCount >= 500){
                    System.out.println("iCount >= 500");
                }
                else{
                	System.out.println("iCount >= 500");
                }
          }
      }
}
