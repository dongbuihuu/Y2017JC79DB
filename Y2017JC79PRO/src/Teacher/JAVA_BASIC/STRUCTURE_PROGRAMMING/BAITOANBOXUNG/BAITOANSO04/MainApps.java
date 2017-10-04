package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.BAITOANBOXUNG.BAITOANSO04;

import java.util.Scanner;

public class MainApps {
	public static void main(String[] args) {
		  double dTotalKm;
          double dCost = 0;
          System.out.println("- Nhập vào số Km đã đi?");
          Scanner dt = new Scanner(System.in);
          dTotalKm = dt.nextDouble();
          
          //1. Kiểm tra điều kiện
          if(dTotalKm <= 1)
          {
        	  dCost = dTotalKm * 5000;
          }
          else if(dTotalKm <= 30 && dTotalKm > 1)
          {
        	  dCost = (dTotalKm - 1)*4000 + 1*5000;
          }
          else
          {
        	  dCost = 1*5000 + 29*4000 + (dTotalKm - 30)*3000;
          }
          System.out.println(String.format
        		  						("- Số tiền phải trả là: %s", dCost));         
	}
}
