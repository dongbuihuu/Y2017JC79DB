package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.BAITOANBOXUNG.BAITOANSO02;

import java.util.Scanner;

import BaseUltils.JC19Math;

public class BTAPSO01 {
	
	public static void main(String[] args) {
		System.out.println("- Mời nhập 1 số nào đó?");
		Scanner dt = new Scanner(System.in);
		int iValue = dt.nextInt();
		int iSum;
		  for(int i = 2; i <= iValue; i++)
          {
			  iSum = 1;
              for(int j = 2; j <= i/2; j++)
              {
                  if(i%j == 0)
                	  iSum += j;
              }
              if(iSum == i)
            	  System.out.println("i = "+ i);       
          }
	}		
}
