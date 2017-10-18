package Assignment;

import java.util.Scanner;

public class Dec_To_Hex {

	public static void main(String[] args) {
	Converter();

	}
	
	public static void Converter(){
		
		int x, result, module;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Kindly input x value");
		x = sc.nextInt();
		sc.close();
		
		module = x%16;
		result = x/16;
		
			//Casting Integer type --> Hexadecimal String type
			String Result = Integer.toHexString(result).toUpperCase();
			String Module = Integer.toHexString(module).toUpperCase();
			
			Result += Module;
			
			System.out.println("The value of " + x + " in Dec converted to Hex is " + Result );
	}

}
