package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.OOP_EXCERCISES.LEVEL01.EX01;

public class Views {
	public static void main(String[] args) {
		//1. Khai báo và khởi tạo đối tượng
		NumberEntity objEntity = new NumberEntity();
		
		//2. Thiết lập đầy đủ thông tin cho đối tượng <đóng gói dữ liệu vào đối tượng>
		objEntity.setdNumA(8.5);
		objEntity.setdNumB(9.5);
		
		/*
		 * Quy ước với nhau như sau:
		 *  + shOpt = 0: Cộng
		 *   + shOpt = 1: Trừ
		 *   + shOpt = 2: Nhân
		 *   + shOpt = 3: Chia
		 * */
		objEntity.setShOpt((short)3);
		
		//3. Khai báo & khởi tạo đối tượng Controllers
		Controllers objController = new Controllers();
		
		//4. Ủy quyền thực thi nghiệp vụ
		if(objEntity.getShOpt() == 3){
			if (objEntity.getdNumA() == 0 && objEntity.getdNumB() == 0)
				System.out.println("Result of function is underfined");
			else if (objEntity.getdNumA() != 0 && objEntity.getdNumB() == 0)
				System.out.println("Cannot divide by zero");
			else
				System.out.println("Thương 2 số a và b là: " + 
						objController.Calculators(objEntity));
		}else{
			//5. Hiển thị kết quả
			System.out.println("Kết quả là: "+ 
						objController.Calculators(objEntity));			
		}
	}
}
