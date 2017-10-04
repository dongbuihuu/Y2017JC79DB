package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.MVCMODEL.EX02;

public class Models {
	
	public short CheckElement(DateEntity objDate){
		short shDay = 0;
		switch(objDate.getShMonth()){
			case 4:
			case 6:
			case 9:
			case 11: shDay = 30; break;
			case 2: {
				if ((objDate.getShYear() % 400 == 0) 
						|| (objDate.getShYear() % 4 == 0 
										&& objDate.getShYear() % 100 != 0)) {
					shDay = 29;
			} else 
				shDay = 28;
			}break;
			default : shDay = 31; break;
		}
		return shDay;
	}
}
