package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.GENERICS.SAMPLE02.GENERICS_WILDCARDS.EXAMPLE01;
import java.util.Collection;

public class WildCardModel {
	
	public WildCardModel() {
		Collection<CircleEntity> objCircles = null;
        Collection<OctagonEntity> objOctagon = null;
        drawObject(objCircles);
        drawObject(objOctagon); //Err do Octagon ko thực thi kế thừa
        // GeometricObjects nên ko thể mapping đc
	}

	private void drawObject(Collection<? extends GeometricObjects> objT) {		
	}
}
