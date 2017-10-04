package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.OOP_EXCERCISES.LEVEL01.EX02;

public class Models {
	
	public short CheckElement(DateEntity objDate){
		if (objDate.getShMonth() == 4 
				|| objDate.getShMonth() == 6 
				|| objDate.getShMonth() == 9 
				|| objDate.getShMonth() == 11)
			return 30;
		else if (objDate.getShMonth() == 2) {
			if ((objDate.getShYear() % 400 == 0) 
						|| (objDate.getShYear() % 4 == 0 
										&& objDate.getShYear() % 100 != 0)) {
				return 29;
			} else 
				return 28;			
		} else			
			return 31;		
	}
}
