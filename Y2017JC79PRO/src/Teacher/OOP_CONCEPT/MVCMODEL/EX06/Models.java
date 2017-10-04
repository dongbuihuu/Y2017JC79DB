package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.MVCMODEL.EX06;

public class Models {
	public boolean CheckElement(NumberEntity obj) {
		return (obj.getiNumber() % 2 == 0) ? true : false;
	}
}
