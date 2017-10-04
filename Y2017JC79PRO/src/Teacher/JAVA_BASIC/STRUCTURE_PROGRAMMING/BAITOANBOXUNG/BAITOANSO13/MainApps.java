package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.BAITOANBOXUNG.BAITOANSO13;

import java.util.Scanner;

public class MainApps {
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
         
         if(a == 0)
         {
             if(b == 0)
            	 System.out.println("-  Phương trình vô nghiệm!");                 
             else
            	 System.out.println(
            			  String.format("-  Nghiệm của pt x = %s", (-c)/b));
         }
         else
         {
             delta = b*b - 4*a*c;
             if(delta == 0)
            	 System.out.println(
            			 String.format(
            					 	"- Phương trình có nghiệm kép = %s", (-b)/(2*a)));                 
             else if(delta < 0)
            	 System.out.println("- Phương trình vô nghiệm!");             
             else
             {
                 x1 = (-b + (float)Math.sqrt(delta))/(2*a);
                 x2 = (-b - (float)Math.sqrt(delta))/(2*a);
                 System.out.println("- Nghiệm x1 = %s"+ x1);
                 System.out.println("- Nghiệm x2 = %s"+ x2);
             }
         }
	}
}	
