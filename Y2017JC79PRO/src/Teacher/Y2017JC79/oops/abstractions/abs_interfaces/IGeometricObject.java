package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ABSTRACTIONS.ABS_INTERFACES;

public interface IGeometricObject extends IBussinesObjets, 
									IBussinesControllayer, 
										IDataAccessLayers {	
	double Area();
	double Perrimetter();
}
