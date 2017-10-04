package JAVACORE_TRAINING.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.STATIC_ARRAY.SAMPLES.BAITOAN03;

public class BAITOANSO03 {
	public static void main(String[] args) {
		// 1.
		double[] dArr = { 2.5, 5.5, 7.5, 10.0, 2.5, 10.0, 2.5, 10.0 };
		
		//2. 
		double dMax = dArr[0];
		for(int i = 1;i<dArr.length;i++){			
			if(dMax < dArr[i]){
				dMax = dArr[i];
			}
		}
		
		//3. 
		for(int i = 0;i<dArr.length;i++){
			if(dMax == dArr[i])
				System.out.println("i = "+ i);
		}
	}
}
