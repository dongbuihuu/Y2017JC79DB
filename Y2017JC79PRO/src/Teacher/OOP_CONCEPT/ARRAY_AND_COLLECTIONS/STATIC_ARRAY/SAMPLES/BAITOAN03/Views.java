package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.STATIC_ARRAY.SAMPLES.BAITOAN03;

public class Views {
	public static void main(String[] args) {
		//1. 
		double[] dArr = {2.5, 5.5, 7.5, 10.0, 2.5, 10.0, 2.5, 10.0};
		ArrayEntity objEntity = new ArrayEntity();
		objEntity.setdArr(dArr);
		objEntity.setbOpt((byte)0);
		
		//2. 
		ArrayControllers objController = new ArrayControllers();
		
		//3. 
		String[] sArrIndex = objController.FindIndex(objEntity);
		for(String sIndex : sArrIndex){
			System.out.println("- iIndex = "+ sIndex);
		}
	}
}
