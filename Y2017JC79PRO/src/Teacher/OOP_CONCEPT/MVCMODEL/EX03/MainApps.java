package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.MVCMODEL.EX03;

import java.util.Scanner;

public class MainApps {
	public static void main(String[] args) {
		//1. Khai báo đối tượng
		Controller objController;
		
		//2. Mời chọn tính diện tích và chu vi cho các hình
		//0 - Tam giác & 1 - Hình chữ nhật
		//2 - Diện tích & 3 - Chu vi
		Scanner sc = new Scanner(System.in);
		System.out.println("- Mời chọn: 0 - Tam giác; 1 - Hình chữ nhật???");
		byte bObjectType = sc.nextByte();
		
		//3. Tùy biến tính toán		
		objController = new Controller(bObjectType);
		Object obj = null;
		switch(bObjectType){
			case 0:{
				TringleEntity objEntity = new TringleEntity();
				System.out.println("Canh A");
				objEntity.setdSide01(sc.nextDouble());
				System.out.println("Canh B");
				objEntity.setdSide02(sc.nextDouble());
				System.out.println("Canh C");
				objEntity.setdSide03(sc.nextDouble());
				obj = objEntity;
			}break;
			case 1:{
				RectangeEntity objEntity = new RectangeEntity();
				System.out.println("Canh A");
				objEntity.setdWidth(sc.nextDouble());
				System.out.println("Canh B");
				objEntity.setdHeight(sc.nextDouble());
				obj = objEntity;
			}break;
		}
		double dResult = objController.ExecOf(obj, (byte)0);
		System.out.println("- Kết quả: "+ dResult);
	}
}
