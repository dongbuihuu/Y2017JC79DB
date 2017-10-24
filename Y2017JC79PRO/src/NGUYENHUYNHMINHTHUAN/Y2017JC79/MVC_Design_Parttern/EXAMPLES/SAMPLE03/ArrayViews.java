package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.EXAMPLES.SAMPLE01;

import java.util.Scanner;

public class ArrayViews {
	public static void main(String[] args) {
		//1. Nhập các phần tử vào mảng?
		String sValue = "";
		ArrayEntity objArrEntity = new ArrayEntity();
		double[] dArray = new double[100];
		
		int iIndex = 0;
		Scanner sc = null;
		System.out.println("- Nhập vào N giá trị. Khi nào chán rồi thì ấn E <Exit> :D");
		do{
			sc = new Scanner(System.in);
			System.out.print(String.format("- dArray[%s] = ", 
					iIndex));
			sValue = sc.nextLine();
			if(!sValue.toUpperCase().equals("E")){				
				dArray[iIndex] = Double.parseDouble(sValue);				
				iIndex++;
			}
		}while(!sValue.toUpperCase().equals("E"));
		objArrEntity.setdArr(dArray);
		
		//2. Ủy quyền thực thi nghiệp vụ
		ArrayController objController = new ArrayController();
		double dTotal = objController.SumOf(objArrEntity);
		System.out.println("- Total = "+ dTotal);
	}
}
