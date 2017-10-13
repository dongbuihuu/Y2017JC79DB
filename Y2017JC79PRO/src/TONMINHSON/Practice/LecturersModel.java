package TONMINHSON.Practice;

public class LecturersModel {

	public String findBestRate(Lecturers lects) {
		Lecturer[] lecturers = lects.getLecturers();
		byte[] rate = null;
		String bestRating = null;
		int i = 0;
		for (Lecturer lecturer : lecturers) {
			switch (lecturer.getsRate()) {
			case "Very bad":
				rate[i] = 1;
				break;
			case "Bad":
				rate[i] = 2;
				break;
			case "Good":
				rate[i] = 3;
				break;
			case "Very good":
				rate[i] = 4;
				break;
			}
			i++;
		}
		int bestRate = rate[0];
		for (int j = 1; j < rate.length; j++) {
			if (bestRate < rate[j]) {
				bestRate = rate[j];
			}
		}
		switch (bestRate) {
		case 1:
			bestRating = "Very bad";
			break;
		case 2:
			bestRating = "Bad";
			break;
		case 3:
			bestRating = "Good";
			break;
		case 4:
			bestRating = "Very good";
			break;
		}
		return bestRating;

	}

	public String findLowestRate(Lecturers lects) {
		Lecturer[] lecturers = lects.getLecturers();
		byte[] rate = null;
		String lowestRating = null;
		int i = 0;
		for (Lecturer lecturer : lecturers) {
			switch (lecturer.getsRate()) {
			case "Very bad":
				rate[i] = 1;
				break;
			case "Bad":
				rate[i] = 2;
				break;
			case "Good":
				rate[i] = 3;
				break;
			case "Very good":
				rate[i] = 4;
				break;
			}
			i++;
		}
		int lowestRate = rate[0];
		for (int j = 1; j < rate.length; j++) {
			if (lowestRate > rate[j]) {
				lowestRate = rate[j];
			}
		}
		switch (lowestRate) {
		case 1:
			lowestRating = "Very bad";
			break;
		case 2:
			lowestRating = "Bad";
			break;
		case 3:
			lowestRating = "Good";
			break;
		case 4:
			lowestRating = "Very good";
			break;
		}
		return lowestRating;

	}

	public String[] findBestLecturers(Lecturers lects) {
		Lecturer[] lecturers = lects.getLecturers();
		String[] bestLecturers = null;
		int i = 0;
		for (Lecturer lecturer : lecturers) {
			if (lecturer.getsRate().equals(this.findBestRate(lects))) {
				bestLecturers[i] = "Full name: " + lecturer.getsFullName() + ", ID: " + lecturer.getsID() + ", Age: "
						+ lecturer.getbAge() + ", Rate: " + lecturer.getsRate() + ", Department: "
						+ lecturer.getsDepartment();
				i++;
			}
		}
		return bestLecturers;
	}

	public String[] findWorstLecturers(Lecturers lects) {
		Lecturer[] lecturers = lects.getLecturers();
		String[] worstLecturers = null;
		int i = 0;
		for (Lecturer lecturer : lecturers) {
			if (lecturer.getsRate().equals(this.findLowestRate(lects))) {
				worstLecturers[i] = "Full name: " + lecturer.getsFullName() + ", ID: " + lecturer.getsID() + ", Age: "
						+ lecturer.getbAge() + ", Rate: " + lecturer.getsRate() + ", Department: "
						+ lecturer.getsDepartment();
				i++;
			}
		}

		return worstLecturers;
	}

	public int findBestLecturersNumbers(Lecturers lects) {
		Lecturer[] lecturers = lects.getLecturers();
		int count = 0;
		for (Lecturer lecturer : lecturers) {
			if (lecturer.getsRate().equals(this.findBestRate(lects))) {
				count++;
			}
		}
		return count;
	}

	public int findWorstLecturersNumbers(Lecturers lects) {
		Lecturer[] lecturers = lects.getLecturers();
		int count = 0;
		for (Lecturer lecturer : lecturers) {
			if (lecturer.getsRate().equals(this.findLowestRate(lects))) {
				count++;
			}
		}
		return count;

	}

	public String[] findDepartmentsWithBestLecturers(Lecturers lects) {
		Lecturer[] lecturers = lects.getLecturers();
		String[] departments = null;
		int i = 0;
		for (Lecturer lecturer : lecturers) {
			if (lecturer.getsRate() == this.findBestRate(lects)) {
				departments[i] = lecturer.getsDepartment();
			}
		}
		return departments;

	}

	public String[] findDepartmentsWithWorstLecturers(Lecturers lects) {
		Lecturer[] lecturers = lects.getLecturers();
		String[] departments = null;
		int i = 0;
		for (Lecturer lecturer : lecturers) {
			if (lecturer.getsRate() == this.findLowestRate(lects)) {
				departments[i] = lecturer.getsDepartment();
			}
		}
		return departments;

	}

	public int findBestLecturersNumbersInDepartments(Lecturers lects) {
		Lecturer[] lecturers = lects.getLecturers();
		int count = 0;
		for (Lecturer lecturer : lecturers) {
			if (lecturer.getsDepartment().equals(this.findDepartmentsWithBestLecturers(lects))) {
				count++;
			}

		}
		return count;

	}

	public int findWorstLecturersNumbersInDepartments(Lecturers lects) {
		Lecturer[] lecturers = lects.getLecturers();
		int count = 0;
		for (Lecturer lecturer : lecturers) {
			if (lecturer.getsDepartment().equals(this.findDepartmentsWithWorstLecturers(lects))) {
				count++;
			}

		}
		return count;

	}
}
