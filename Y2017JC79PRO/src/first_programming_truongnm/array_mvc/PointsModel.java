package first_programming_truongnm.array_mvc;

public class PointsModel {

	public int iCount(PointsEntity objArr) {
		int badPoints = 0;
		for (int i = 0; i < objArr.getArrPoints().length; i++) {

			if (objArr.getArrPoints()[i] < 5 && objArr.getArrPoints()[i] > 0) {
				badPoints++;

			}
		}
		System.out.println("The number of badPoints (lesser than 5) is: " + badPoints);
		System.out.print("The number of goodPoints (greater than 5) is: ");
		return objArr.getArrPoints().length - badPoints;
	}

}
