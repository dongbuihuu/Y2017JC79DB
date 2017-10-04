package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.OOP_EXCERCISES.LEVEL01.EX05;

import java.util.Scanner;

public class Views {

	public static void main(String[] args) {
		 //1. Khai báo và khởi tạo đối tượng
		 PersonEntity objPerson = new PersonEntity();
		 objPerson.setiPersonId(100);
		 objPerson.setsFullName("Mr A");
		 objPerson.setiAge(19);
		 objPerson.setShMarriage((short)1);
		 objPerson.setShSex((short)0);
		 
		 Params objParam = new Params();
		 objParam.setTuoiNam((short)22);
		 objParam.setTuoiNu((short)19);
		 objParam.setObjPerson(objPerson);
		 
		// 2. Khai báo và khởi tạo đối tượng của Controllers
		Controllers objController = new Controllers();
		
		//3. Ủy quyền thực thi nghiệp vụ				
		if(objController.ExecuteOf(objParam)){
			System.out.println("Bạn đủ điều kiện tham gia kết bạn :D");
		}
		else{
			System.out.println("Rất tiếc :<");
		}
	}
}
