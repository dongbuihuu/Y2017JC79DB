package first_programming_truongnm.array_mvc_exercise02;

public class AverageModel {

	public int intAverage(AverageEntity objArr) {

		int sumInt = 0;

		for (int i = 0; i < objArr.getArrAverageInt().length; i++) {

			sumInt += objArr.getArrAverageInt()[i];
		}
		System.out.println("Average of integer array is: " + (double) sumInt / objArr.getArrAverageInt().length);
		return 0;

	}

	public double doubleAverage(AverageEntity objArr) {
		double sumDouble = 0;

		for (int i = 0; i < objArr.getArrAverageDouble().length; i++) {
			sumDouble += objArr.getArrAverageDouble()[i];
		}
		System.out.print("Average of double array is: " + sumDouble / objArr.getArrAverageDouble().length);
		return 0;
	}

}
