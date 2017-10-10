package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.MVCMODEL.EX03;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	private Shape mShape;
	
	/***
	 * bObjectType = 0: Tam giác; bObjectType = 1: Hình chữ nhật
	 * @param bObjectType
	 */
	public Controller(byte bObjectType){
		switch(bObjectType){
			case 0:  mShape = new TringleModel(); break;
			case 1:  mShape = new RectangeModel(); break;
		}
	}
	
	public double ExecOf(Object obj, byte bOpt){		
		return (bOpt == 0)? mShape.Area(obj) 
							: mShape.Perrimetter(obj);
	}
}
