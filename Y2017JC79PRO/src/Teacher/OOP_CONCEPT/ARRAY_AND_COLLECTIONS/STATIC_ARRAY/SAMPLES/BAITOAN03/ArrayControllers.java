package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.STATIC_ARRAY.SAMPLES.BAITOAN03;

public class ArrayControllers {
	private ArrayModels mModel;
	public ArrayControllers() {
		mModel = new ArrayModels();
	}
	
	public double SumOf(ArrayEntity objEntity){
		return mModel.SumElements(objEntity);				
	}
	
	/***
	 * 
	 * @param objEntity
	 * objEntity.bOpt = 0: Tìm Max
	 *  objEntity.bOpt = 1: Tìm Min
	 * @return
	 */
	public double FindMaxMin(ArrayEntity objEntity){
		double dResult = 0;
		switch (objEntity.getbOpt()) {
			case 0: dResult = mModel.MaxElement(objEntity); break;
			case 1: dResult = mModel.MinElement(objEntity); break;		
		}
		return dResult;
	}
	
	public String[] FindIndex(ArrayEntity objEntity){		
		String sOut = mModel.IndexStringElement(objEntity);
		String[] sArrTemp = sOut.split("-");
		//int[] iIndex = new int[sArrTemp.length];
		//System.arraycopy(sArrTemp, 0, iIndex, 0, sArrTemp.length);
		return sArrTemp;
	}
}
