package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.STATIC_ARRAY.SAMPLES.BAITOAN02;

public class Views {
	public static void main(String[] args) {
		// 1. Khai báo biến mảng
		double[] dArr = new double[10];		

		// 2. Đưa giá trị vào biến mảng
		dArr[0] = 6.5;
		dArr[1] = 7.5;
		dArr[2] = 8.5;
		dArr[3] = 9.5;
		dArr[9] = 5.5;
		
		//3. Khai báo đối tượng
		ArrayEntity objEntity = new ArrayEntity();
		objEntity.setdArr(dArr);
		
		ArrayControllers objController = new ArrayControllers();
		double dTotal = objController.SumOf(objEntity);
		System.out.println("Total = "+ dTotal);		
	}
}
