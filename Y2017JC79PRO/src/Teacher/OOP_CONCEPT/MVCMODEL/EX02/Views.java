package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.MVCMODEL.EX02;

public class Views {
	
	public static void main(String[] args) {
		// 1. Khai báo và khởi tạo đối tượng
		DateEntity objEntity = new DateEntity();

		// 2. Thiết lập đầy đủ thông tin cho đối tượng <đóng gói dữ liệu vào đối tượng>
		objEntity.setShMonth((short) 13);
		objEntity.setShYear((short) 2012);
		
		//3. Khai báo & khởi tạo đối tượng Controllers
		Controllers objController = new Controllers();
		
		//4. Ủy quyền thực thi nghiệp vụ
		short shDay = objController.CheckDayOf(objEntity);
		
		//5. Hiển thị kết quả
		if(shDay == -1)
			System.out.println("Thông tin tháng bạn đưa vào phải nằm trong khoảng 1 - 12");
		else
			System.out.println(String.format("Kết quả có %s", shDay));
	}
}
