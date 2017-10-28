package first_programming_truongnm.array_mvc_exercise02;

public class AverageController {

	private AverageModel averageModel = new AverageModel();

	public int intAverageController(AverageEntity objArr) {
		return averageModel.intAverage(objArr);
	}

	public double doubleAverageController(AverageEntity objArr) {
		return averageModel.doubleAverage(objArr);
	}

}
