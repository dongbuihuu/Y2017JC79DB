package TANGHAANHDUY.ArrayEx4;

import java.util.List;

public class model {
	
	public int findmin(arrayentity obj) {
		int nmin = obj.getNumlist().get(0);
		
		for (int i = 0; i < obj.getNumlist().size(); i++) {
			if (nmin < obj.getNumlist().get(i))
			{
				nmin = obj.getNumlist().get(i);
			}
		}
		return nmin;
	}
	
	public int findmax(arrayentity obj) {
		int nmax = obj.getNumlist().get(0);
		
		for (int i = 0; i < obj.getNumlist().size(); i++) {
			if (nmax > obj.getNumlist().get(i))
			{
				nmax = obj.getNumlist().get(i);
			}
		}
		return nmax;
	}
	
	
	public int[] checkindex(arrayentity obj) {
		List<Integer> objarr = obj.getNumlist();
		int[] vindex = null;
		int count = 0;
		int[] vindextemp = new int[objarr.size()];
		
		for (int i = 0; i<objarr.size();i++)
		{
			if(objarr.get(i) == obj.getMinormax())
			{
				vindextemp[count]=objarr.get(i);
				count++;
			}
		}
		
		vindex = new int[count];
		System.arraycopy(vindextemp, 0, vindex, 0, count);
		return vindex; 
	}
}
