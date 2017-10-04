package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXCERCISES;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class ConvertValue {
	public static void main(String[] args) {
		//1. 
		System.out.println("Mời bạn nhập vào số a?");
		
		//2. 
		Scanner sc = new Scanner(System.in);
		String strTemp = sc.nextLine();
		
		//3. 
		if(strTemp.isEmpty()){
			System.out.println("Nhập lại");
		}
		else{
			double a = Double.parseDouble(strTemp);  //a = Double.parseDouble("8.5");  //a = 8.5
			float b = Float.parseFloat(strTemp);
			short c = Short.parseShort(strTemp);
			int d = Integer.parseInt(strTemp);
			boolean e = Boolean.parseBoolean("false");
			System.out.println(a);
		}
	}
	
}
