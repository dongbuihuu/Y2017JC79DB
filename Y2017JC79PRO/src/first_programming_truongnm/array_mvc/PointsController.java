package first_programming_truongnm.array_mvc;

public class PointsController {

	private PointsModel pointsModel = new PointsModel();

	public int countBadAndGoodPoints(PointsEntity iNumber) {
		return pointsModel.iCount(iNumber);

	}

}
