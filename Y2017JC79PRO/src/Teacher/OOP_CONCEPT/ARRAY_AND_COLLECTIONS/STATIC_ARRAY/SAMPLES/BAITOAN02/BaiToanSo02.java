package JAVACORE_TRAINING.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.STATIC_ARRAY.SAMPLES.BAITOAN02;

public class BaiToanSo02 {
	public static void main(String[] args) {
		//1.
		double[] dArr = {2.5, 5.5, 7.5, 10.0, 2.5, 10.0, 2.5, 10.0};
		
		//2. 
		double dMax = dArr[0];
		for(int i = 1;i<dArr.length;i++){			
			if(dMax < dArr[i]){
				dMax = dArr[i];
			}
		}
		
		//3. 
		System.out.println("Max: "+ dMax);
	}
}
