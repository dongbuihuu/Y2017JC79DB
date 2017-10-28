package first_programming_truongnm.array_mvc_exercise02;

public class AverageView {

	public static void main(String[] args) {
		AverageEntity arrAverageInt = new AverageEntity();
		AverageEntity arrAverageDouble = new AverageEntity();

		int intArr[] = { 1, 2, 3, 4, 5, 6 };
		arrAverageInt.setArrAverageInt(intArr);
		double doubleArr[] = { 6.0, 4.4, 1.9, 2.9, 3.4, 3.5 };
		arrAverageDouble.setArrAverageDouble(doubleArr);

		AverageController avrController = new AverageController();
		avrController.intAverageController(arrAverageInt);
		avrController.doubleAverageController(arrAverageDouble);

	}

}
