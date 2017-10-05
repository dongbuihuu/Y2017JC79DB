package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ABSTRACTIONS.ABS_CLASS_METHOD;

import java.util.Scanner;

public class MainApps {
	public static void main(String[] args) {
		// 1. Khai báo đối tượng
		Controller objController;

		// 2. Mời chọn tính diện tích và chu vi cho các hình
		// 0 - Tam giác & 1 - Hình chữ nhật
		// 2 - Diện tích & 3 - Chu vi
		Scanner sc = new Scanner(System.in);
		System.out.println("- Mời chọn: 0 - Tam giác; 1 - Hình chữ nhật???");
		byte bObjectType = sc.nextByte();

		// 3. Tùy biến tính toán
		objController = new Controller(bObjectType);
		Object obj = null;
		switch (bObjectType) {
		case 0: {
			TringleEntity objEntity = new TringleEntity();
			objEntity.setdSide01(3);
			objEntity.setdSide02(4);
			objEntity.setdSide03(5);
			obj = objEntity;
		}
			break;
		case 1: {
			RectangeEntity objEntity = new RectangeEntity();
			objEntity.setdWidth(3);
			objEntity.setdHeight(4);
			obj = objEntity;
		}
			break;
		}
		double dResult = objController.ExecOf(obj, (byte) 0);
		System.out.println("- Kết quả: " + dResult);
	}
}
