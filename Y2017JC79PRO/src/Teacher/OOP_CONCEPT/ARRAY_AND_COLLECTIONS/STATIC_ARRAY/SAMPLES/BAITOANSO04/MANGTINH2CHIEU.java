package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.STATIC_ARRAY.SAMPLES.BAITOANSO04;

public class MANGTINH2CHIEU {
	public static void main(String[] args) {
		//1.
		int[][] myArr = new int[5][5];
		
		//2. 
		myArr[0][0] = 10;
		myArr[0][1] = 20;
		myArr[1][0] = 30;
		myArr[1][1] = 40;
		
		//3. 
		for(int i=0;i<myArr.length;i++)
			for(int j=0; j<myArr[i].length;j++){
				System.out.println("Value = "+ myArr[i][j]);
			}
	}
}	
