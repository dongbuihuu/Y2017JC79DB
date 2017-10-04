package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.STATIC_ARRAY.SAMPLES.BAITOAN03;

import java.util.ArrayList;
import java.util.List;

public class ArrayModels {
	/***
	 * Nghiệp vụ tính tổng các phần tử trong mảng
	 * @param objEntity: Đối tượng chứa thuộc tính là 1 biến mảng kiểu double
	 * @return 
	 */
	public double SumElements(ArrayEntity objEntity){
		double dTotal = 0;
		for(double dValue : objEntity.getdArr()){
			dTotal += dValue;
		}
		return dTotal;
	}
		
	public double MaxElement(ArrayEntity objEntity){
		double dMax = objEntity.getdArr()[0];
		for(int i = 1;i<objEntity.getdArr().length;i++){			
			if(dMax < objEntity.getdArr()[i]){
				dMax = objEntity.getdArr()[i];
			}
		}
		return dMax;
	}
	
	public double MinElement(ArrayEntity objEntity){
		double dMin = objEntity.getdArr()[0];
		for(int i = 1;i<objEntity.getdArr().length;i++){			
			if(dMin > objEntity.getdArr()[i]){
				dMin = objEntity.getdArr()[i];
			}
		}
		return dMin;
	}
	
	/***
	 * + objEntity..getbOpt() == 0: Tìm tập chỉ số chứa Max
	 * + objEntity..getbOpt() == 1: Tìm tập chỉ số chứa Min
	 * @param objEntity
	 * @return format: "0-3-5-7-...."
	 */
	public String IndexStringElement(ArrayEntity objEntity){
		String sOut="";
		double dValue = 0;
		if(objEntity.getbOpt() == 0)
			dValue = MaxElement(objEntity);
		else dValue = MinElement(objEntity);
		
		for(int i = 0;i<objEntity.getdArr().length;i++){
			if(objEntity.getdArr()[i] == dValue){
				if(sOut.isEmpty())
					sOut += i;
				else 
					sOut += "-"+ i;
			}
		}
		return sOut;
	}
	
	public int[] IndexElement(ArrayEntity objEntity){
		double dValue = 0;
		if(objEntity.getbOpt() == 0)
			dValue = MaxElement(objEntity);
		else dValue = MinElement(objEntity);
		
		double[] dArrTemp = new double[objEntity.getdArr().length];
		int iCounter = 0;		
		for(int i = 0; i<dArrTemp.length;i++){
			if(dValue == objEntity.getdArr()[i]){
				dArrTemp[iCounter] = i;
				iCounter++;
			}				
		}
		int[] dArrIndex = new int[iCounter];
		System.arraycopy(dArrTemp, 0, dArrIndex, 0, iCounter);
		return dArrIndex;
	}	
}
