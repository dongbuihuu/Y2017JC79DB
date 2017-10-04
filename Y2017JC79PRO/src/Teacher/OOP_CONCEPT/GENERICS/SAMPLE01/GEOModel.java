package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.GENERICS.SAMPLE01;

public class GEOModel  
				implements IGeometricObjects {

    /***
     * bOpt = 0: Tam giác
     * bOpt  = 1: Bát giác
     */
    public double Area(Object obj, byte bOpt) {
        switch (bOpt) {
            //TH: Tam giác
            case 0: {
                  TringleEntity objTringle = (TringleEntity) obj;                  
            }break;
            case 1: {
                OctagonEntity objOctagon = (OctagonEntity) obj;
            }break;
        }
        return 0;
    }

	@Override
	public double Perrimeter(Object obj, byte bOpt) {
		// TODO Auto-generated method stub
		return 0;
	}
}
