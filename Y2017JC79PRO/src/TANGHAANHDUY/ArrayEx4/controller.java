package TANGHAANHDUY.ArrayEx4;

import TANGHAANHDUY.BTMang1.ArrayObjectEntity;

public class controller {
private model mmodel;

public controller() {
 mmodel = new model();	
}

public int[] StudentName(arrayentity objCal){
	//String name = "";
	
	switch (objCal.getbOption()) {
		case 0: objCal.setMinormax( mmodel.findmin(objCal));  break;
		case 1: objCal.setMinormax( mmodel.findmax(objCal));  break;
	} return mmodel.checkindex(objCal);
}
}
