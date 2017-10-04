package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.POLYMORPHIZM.OVERRIDES;

public class MODULE_B  extends MODULE_A {
	void ABC(){
		Delete();  
		Insert(); 
		Update();  
	}	
	
	@Override
	public boolean Update() {
		return false;
	}
	
	@Override
	public boolean Delete() {
		super.Delete();
		return false;
	}
}
