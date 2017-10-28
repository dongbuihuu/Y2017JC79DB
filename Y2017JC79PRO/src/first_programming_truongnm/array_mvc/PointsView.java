package first_programming_truongnm.array_mvc;

public class PointsView {

	public static void main(String[] args) {

		PointsEntity points = new PointsEntity();
		int[] arr = { 1, 3, 5, 7, 8, 10, 9, 6, 8, 5, 7, 4, 5, 3, 0, 10 };

		points.setArrPoints(arr);
		PointsController pointsController = new PointsController();
		System.out.println(pointsController.countBadAndGoodPoints(points));

	}

}
