package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.OOP_EXCERCISES.LEVEL01.EX02;

public class Controllers {
	    //1. KB biến đối tượng
		private Models mObjModel;
		
		//2. KB hàm khởi dựng
		public Controllers() {
			mObjModel = new Models();
		}
		
		//3. Ủy quyền thực thi nghiệp vụ tới Models
		public short CheckDayOf(DateEntity objEntity){
			short shDay = 0;
			if(!CheckDate(objEntity)){
				return -1;
			}else{
				shDay = mObjModel.CheckElement(objEntity);
			}
			return shDay;
		}
		
		private boolean CheckDate(DateEntity objEntity){			
			return (objEntity.getShMonth() <= 1 || 
									objEntity.getShMonth() > 12) ? false : true;
		}
}
