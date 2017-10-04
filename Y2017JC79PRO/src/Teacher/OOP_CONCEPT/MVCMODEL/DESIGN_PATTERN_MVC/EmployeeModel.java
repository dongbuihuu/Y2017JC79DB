package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.MVCMODEL.DESIGN_PATTERN_MVC;

import java.sql.Connection;
import java.util.List;

//Bước 2
public class EmployeeModel {
	
	private Connection OpenConnection(){
		   return null;
	}	
	
	public List<EmployeeEntity> GetElements(){
		return null;
	}
	
	public List<EmployeeEntity> GetElementById(EmployeeEntity objEntity){
		return null;
	}
	
	public boolean InsertElement(EmployeeEntity objEntity){
		return true;
	}
	
	public boolean UpdateElement(EmployeeEntity objEntity){
		return true;
	}
	
	public boolean DeleteElement(EmployeeEntity objEntity){
		return true;
	}
}
