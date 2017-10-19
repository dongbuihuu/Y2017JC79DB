package TANGHAANHDUY.BTMang1;

import Teacher.Y2017JC79.arrays.static_array.single_array.Sample04.CopyToArray;

public class StudentModel {
	public double FindMin(ArrayObjectEntity objentity)
	{
		double dMin = objentity.getMangSV()[0].getMark();
		
		for (int i = 0; i < objentity.getMangSV().length; i++) {
			if (dMin > objentity.getMangSV()[i].getMark())
			{
				dMin = objentity.getMangSV()[i].getMark();
			}
		}
		return dMin;
	}
	
	public double FindMax(ArrayObjectEntity objentity)
	{
		double dMax = objentity.getMangSV()[0].getMark();
		
		for (int i = 0; i < objentity.getMangSV().length; i++) {
			if (dMax < objentity.getMangSV()[i].getMark())
			{
				dMax = objentity.getMangSV()[i].getMark();
			}
		}
		return dMax;
	}
	
	public int[] getIndexArray(ArrayObjectEntity objEntity) {
		StudentEntity[] obj = objEntity.getMangSV();
		int[] vIndex = null;
		int iCount = 0;
		int[] vIndexTemp = new int[obj.length];
		
		for (int i = 0; i < obj.length; i++) {
			if(obj[i].getMark() == objEntity.getMinormax()	)	
					{
						vIndexTemp[iCount] = i;
						iCount++;
					}			
		}
		
		vIndex = new int[iCount];
		System.arraycopy(vIndexTemp, 0, vIndex, 0, iCount);
		return vIndex;
				
	}

}
