package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.STATIC_ARRAY.SAMPLES.BAITOAN01;

import java.util.Scanner;

public class Views {
	public static void main(String[] args) {
		//1. Khai báo biến
		 String sValue ="";
		double[] dArr = new double[5];
		Scanner sc = new Scanner(System.in);
		short iCounter = 0;
		double dTotal = 0;
		System.out.println("- Khi đang nhập thấy chán thì nhập Y hoặc y");
		System.out.println("- Mời nhập giá trị cho biến mảng?");		
		
		do{					 
			 System.out.println(String.format("dArray[%s] = ",  iCounter));
			 sValue = sc.nextLine();
			 if(sValue.toUpperCase().equals("Y")){
				 break;
			 }else{
				 dArr[iCounter] = Double.parseDouble(sValue);
				 dTotal += dArr[iCounter];
				 iCounter++;
			 }			 			
		}while(!(dArr.length == iCounter));
		
		//2. Khai báo đối tượng controller
		ArrayControllers objController = new ArrayControllers();
		ArrayEntity objEntity = new ArrayEntity();
		objEntity.dArr = dArr;
		dTotal = objController.SumOf(objEntity);
		System.out.println("- Tổng số: "+ dTotal);		
		System.out.println("Cảm ơn bạn đã sử dụng phần mềm của chúng tôi :D");
	}
}
